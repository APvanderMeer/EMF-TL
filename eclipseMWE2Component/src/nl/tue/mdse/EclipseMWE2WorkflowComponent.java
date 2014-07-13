package nl.tue.mdse;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import com.parctechnologies.eclipse.*;

import java.io.*;

public class EclipseMWE2WorkflowComponent implements IWorkflowComponent {
    // Object representing the Eclipse engine
    EclipseEngine eclipse = null;
    
    EFactory factory = EPackage.Registry.INSTANCE.getEFactory("http://constraints/1.0");
    EPackage mypackage = null;
    
    String constraintTerm = null;
    
    String inputLocation = null;
    
    String outputSlot = null;

	@Override
	public void preInvoke() {

	    // Create some default Eclipse options
	    EclipseEngineOptions eclipseEngineOptions = new EclipseEngineOptions();

	    // Connect the Eclipse's standard streams to the JVM's
	    eclipseEngineOptions.setUseQueues(false);

	    // Initialise Eclipse
	    try {
	        eclipse = EmbeddedEclipse.getInstance(eclipseEngineOptions);
	    }
	    catch (EclipseException e) {}
	    catch (IOException e){}
	}
    
	@Override
	public void invoke(IWorkflowContext ctx) {

		System.out.println(factory.toString());
		
		mypackage = factory.getEPackage();
		
		// Result model
		EObject constraintlist = factory.create((EClass)mypackage.getEClassifier("Program"));
		
	    // Create some default Eclipse options
	    EclipseEngineOptions eclipseEngineOptions = new EclipseEngineOptions();
	    
	    eclipseEngineOptions.setGlobalSize(264000);

	    // Connect the Eclipse's standard streams to the JVM's
	    eclipseEngineOptions.setUseQueues(false);

	    // Initialise Eclipse
	    try {
	        eclipse = EmbeddedEclipse.getInstance(eclipseEngineOptions);
	    }
	    catch (EclipseException e) {}
	    catch (IOException e) {}
	    // Write a message
	    try {
	        //eclipse.rpc("ensure_loaded(\""+ inputLocation +"\")");
	    	eclipse.compile(new File(inputLocation));
	        CompoundTerm result = eclipse.rpc(constraintTerm);
	        CompoundTerm resultTerm = ((CompoundTerm) result.arg(1));
	        System.out.println(resultTerm.toString());
	        EList<EObject> constraints = new BasicEList<EObject>();
	        for (int i = 1; i <= resultTerm.arity(); i++){
	        	EObject constraint = addVariableToProgram(constraintlist,i,compoundTermtoNode(resultTerm.arg(i)));
	        	constraints.add(constraint);
	        	
	        }
	        constraintlist.eSet(((EClass)factory.getEPackage().getEClassifier("Program")).getEStructuralFeature("constraints"), constraints);
        }
        catch (EclipseException e) { System.out.println(e);}
        catch (IOException e) {}
	    // Destroy the Eclipse process
        try {
	        ((EmbeddedEclipse) eclipse).destroy();
        }
        catch (IOException e) {}
        ctx.put(outputSlot,constraintlist);
	}

	@Override
	public void postInvoke() {
		// Destroy the Eclipse engine
		try {
		((EmbeddedEclipse) eclipse).destroy();
		}
		catch (IOException e) {}
	}
	
	public String getConstraintTerm() {
		return constraintTerm;
	}
	
    public void setConstraintTerm(String constraint) {
    	this.constraintTerm = constraint;
    }
	
	public String getInputLocation() {
		return inputLocation;
	}
	
	public void setInputLocation(String input) {
		this.inputLocation = input;
	}
	
	public String getOutputSlot() {
		return outputSlot;
	}
	
	public void setOutputSlot(String outputSlot){
		this.outputSlot = outputSlot;
	}

	private EObject addVariableToProgram(EObject program, int identifier, EObject value) {
		EObject variable = factory.create((EClass)factory.getEPackage().getEClassifier("Variable"));
		variable.eSet(((EClass)factory.getEPackage().getEClassifier("Variable")).getEStructuralFeature("number"), identifier);
		((EList<EObject>) program.eGet(program.eClass().getEStructuralFeature("variables"))).add(variable);
		
		EObject varref = factory.create((EClass)factory.getEPackage().getEClassifier("VariableReference"));
		varref.eSet(varref.eClass().getEStructuralFeature("var"),variable);
		
		EObject equation = factory.create((EClass)factory.getEPackage().getEClassifier("Equation"));
		equation.eSet(equation.eClass().getEStructuralFeature("left"),varref);
		equation.eSet(equation.eClass().getEStructuralFeature("right"),value);
		
		EObject constraint = factory.create((EClass)factory.getEPackage().getEClassifier("EquationConstraint"));
		EList<EObject> equationlist = new BasicEList<EObject>();
		equationlist.add(equation);
		constraint.eSet(constraint.eClass().getEStructuralFeature("equation"),equationlist);
		
		return constraint;
	}
	
	@SuppressWarnings("unchecked")
	private EObject compoundTermtoNode(Object term) {
		
		if (term != null) {
			if (CompoundTerm.class.isAssignableFrom(term.getClass())) {
				if (((CompoundTerm)term).functor().equals("a")) {
					return compoundTermtoListNode((CompoundTerm)term);
				} else {
					return compoundTermtoObjectNode((CompoundTerm)term);
				}
			}
			else {
				if (java.util.List.class.isAssignableFrom(term.getClass())) {
					return compoundTermtoListNode((java.util.List<Object>)term); 
				}
				else {
				    return compoundTermtoObjectNode(new Atom((term.toString())));
				}
			}
		}
		else {	
			return compoundTermtoObjectNode(new Atom("error"));
		}
	}
	
//	private EObject compoundTermtoLiteral(CompoundTerm term) {
//		EObject node = factory.create((EClass)factory.getEPackage().getEClassifier("Literal"));
//		node.eSet(((EClass)factory.getEPackage().getEClassifier("Literal")).getEStructuralFeature("value"),term.functor());
//		return node;
//	}
	
	private EObject stringtoLiteral(String i) {
		EObject node = factory.create((EClass)factory.getEPackage().getEClassifier("Literal"));
		node.eSet(((EClass)factory.getEPackage().getEClassifier("Literal")).getEStructuralFeature("value"),i);
		return node;
	}
	
	private EObject compoundTermtoListNode(CompoundTerm term) {
		EObject node = factory.create((EClass)factory.getEPackage().getEClassifier("ListNode"));
		EList<EObject> values = new BasicEList<EObject>();
		for (int i = 1; i <= term.arity(); i++) {
			values.add(compoundTermtoNode((CompoundTerm)term.arg(i)));
		}
		node.eSet(((EClass)factory.getEPackage().getEClassifier("ListNode")).getEStructuralFeature("values"),values);
		return node;
	}

	private EObject compoundTermtoListNode(java.util.List<Object> term) {
		EObject node = factory.create((EClass)factory.getEPackage().getEClassifier("ListNode"));
		EList<EObject> values = new BasicEList<EObject>();
		for (Object o : term) {
			values.add(compoundTermtoNode(o));
		}
		node.eSet(((EClass)factory.getEPackage().getEClassifier("ListNode")).getEStructuralFeature("values"),values);
		return node;
	}	
	
	private EObject compoundTermtoObjectNode(CompoundTerm term) {
		EObject node = factory.create((EClass)factory.getEPackage().getEClassifier("ObjectNode"));
		node.eSet(((EClass)factory.getEPackage().getEClassifier("ObjectNode")).getEStructuralFeature("name"),term.functor());
		
		EList<EObject> features = new BasicEList<EObject>();
		for (int i = 1; i <= term.arity(); i++) {
			EObject feature = factory.create((EClass)factory.getEPackage().getEClassifier("Feature"));
			if (term.arg(i) != null) {
				if (CompoundTerm.class.isInstance(term.arg(i))) {
					feature.eSet(
							((EClass) factory.getEPackage().getEClassifier(
									"Feature")).getEStructuralFeature("value"),
							compoundTermtoNode((CompoundTerm) term.arg(i)));
				} else {
					    if (java.util.List.class.isInstance(term.arg(i))) {
					    	EObject listnode = factory.create((EClass)factory.getEPackage().getEClassifier("ListNode"));
					    	@SuppressWarnings("unchecked")
							java.util.List<Object> objects = (java.util.List<Object>)term.arg(i);
					        EList<EObject> values = new BasicEList<EObject>();
					        for (Object elem : objects) {
					        	values.add(compoundTermtoNode(elem));
					        }
					        listnode.eSet(((EClass)factory.getEPackage().getEClassifier("ListNode")).getEStructuralFeature("values"),values);
					        feature.eSet(
							((EClass) factory.getEPackage().getEClassifier(
									"Feature")).getEStructuralFeature("value"),
							   listnode);
					    }
					    else {
						    feature.eSet(	
							((EClass) factory.getEPackage().getEClassifier(
									"Feature")).getEStructuralFeature("value"),
							stringtoLiteral(term.arg(i).toString()));
					    }
				}
			}
			features.add(feature);
		}
		node.eSet(((EClass)factory.getEPackage().getEClassifier("ObjectNode")).getEStructuralFeature("features"),features);
		return node;
	}	
	
}
