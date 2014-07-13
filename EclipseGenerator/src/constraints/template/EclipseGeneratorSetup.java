package constraints.template;

import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class EclipseGeneratorSetup implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		// TODO Auto-generated method stub
		return Guice.createInjector(new EclipseGeneratorModule());
	}

}
