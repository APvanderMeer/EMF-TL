package constraints.template;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;

import com.google.inject.Injector;

public class EclipseGeneratorComponent implements IWorkflowComponent {

	private Injector injector;
	private List<String> slotNames = newArrayList();
	private Map<String,String> outlets = newHashMap();

	
	/**
	 * registering an {@link ISetup}, which causes the execution of {@link ISetup#createInjectorAndDoEMFRegistration()}
	 * the resulting {@link com.google.inject.Inject} is stored and used to obtain the used {@link IGenerator}. 
	 */
	public void setRegister(ISetup setup) {
		injector = setup.createInjectorAndDoEMFRegistration();
	}
	
	/**
	 * sets the {@link Injector} to be used to obtain the used {@link IGenerator} instance.
	 */
	public void setInjector(Injector injector) {
		this.injector = injector;
	}
	
	/**
	 * adds a slot name to look for {@link Resource}s (the slot's contents might be a Resource or an Iterable of Resources).
	 */
	public void addSlot(String slot) {
		this.slotNames.add(slot);
	}

	public void preInvoke() {
		if (slotNames.isEmpty())
			throw new IllegalStateException("no 'slot' has been configured.");
		if (injector == null)
			throw new IllegalStateException("no Injector has been configured. Use 'register' with an ISetup or 'injector' directly.");
		if (outlets.isEmpty())
			throw new IllegalStateException("no 'outlet' has been configured.");
			
		for (Entry<String, String> outlet : outlets.entrySet()) {
			if (outlet.getKey()==null)
				throw new IllegalStateException("One of the outlets was configured without a name");
			if (outlet.getValue()==null)
				throw new IllegalStateException("The path of outle '"+outlet.getKey()+"' was null.");
		}
	}
	
	
	public static class Outlet {
		
		private String outletName = IFileSystemAccess.DEFAULT_OUTPUT;
		private String path;
		
		public void setOutletName(String outputName) {
			this.outletName = outputName;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public String getOutletName() {
			return outletName;
		}
		public String getPath() {
			return path;
		}
	}
	
	/**
	 * an outlet is defined by a name and a path.
	 * The generator will internally choose one of the configured outlets when generating a file.
	 * the given path defines the root directory of the outlet.
	 */
	public void addOutlet(Outlet out) {
		outlets.put(out.outletName,out.path);
	}

	protected IGenerator getCompiler() {
		return injector.getInstance(IGenerator.class);
	}

	protected IFileSystemAccess getConfiguredFileSystemAccess() {
		final JavaIoFileSystemAccess configuredFileSystemAccess = injector.getInstance(JavaIoFileSystemAccess.class);
		for (Entry<String, String> outs : outlets.entrySet()) {
			configuredFileSystemAccess.setOutputPath(outs.getKey(), outs.getValue());
			System.out.println("Writing " + outs.getKey() + " to " + outs.getValue());
		}
		return configuredFileSystemAccess;
	}

	public void postInvoke() {
		
	}
	@Override
	public void invoke(IWorkflowContext ctx) {
		IGenerator instance = getCompiler();
		IFileSystemAccess fileSystemAccess = getConfiguredFileSystemAccess();
		for (String slot : slotNames) {
			Object object = ctx.get(slot);
			if (object == null) {
				throw new IllegalStateException("Slot '"+slot+"' was empty!");
			}
			if (object instanceof Iterable) {
				Iterable<?> iterable = (Iterable<?>) object;
				for (Object object2 : iterable) {
					
					instance.doGenerate(((EObject)object2).eResource(), fileSystemAccess);
				}
			} else {
				instance.doGenerate(((EObject)object).eResource(), fileSystemAccess);
				System.out.println(object);
				System.out.println("Succesfully generated " + slot);
			} 
		}
	}

}
