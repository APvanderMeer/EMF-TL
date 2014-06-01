package nl.tue.mdse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.container.CompositeComponent;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.AbstractEMFWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.emftext.language.textAML3.*;
import org.emftext.language.textAML3.impl.TextAML3PackageImpl;
import org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ResourceFactory;

import constraints.Element;
import constraints.Feature;
import constraints.Literal;
import constraints.Node;
import constraints.Equation;
import constraints.ObjectNode;
import constraints.ListNode;
import constraints.EquationConstraint;

/**
 * @author ameer
 *
 */
/**
 * @author ameer
 *
 */
/**
 * @author ameer
 *
 */
public class ResultMerger extends AbstractEMFWorkflowComponent {
	
	/**
	 * Identifier of IWorkFlowContext slot that should contain constraint results model
	 */
	String resultsSlot = null;
    /**
     * Result constraint results model
     */
    constraints.Program results = null;
    
    /**
     * Identifier of source metamodel
     */
    String sourceMetaModelURI = null;
    /**
     * Source Metamodel Package
     */
    EPackage sourceMetaModel = null;
    
    /**
	 * Identifier of IWorkFlowContext slot that contains source model
	 */
    String sourceProgramSlot = null;   
    /**
     * Source Model Base Object
     */
    EObject sourceProgram = null;

    /**
     * Identifier of target metamodel
     */
    String targetMetaModelURI = null;
    /**
     * Target Metamodel Package
     */    
    EPackage targetMetaModel = null;
    
    /**
     * Identifier of IWorkFlowContext slot that should contain target model
     */
    String copyProgramSlot = null;
    /**
     * Result model
     */    
    EObject copyProgram = null;

    /**
     * Identifier of IWorkFlowContext slot that contains type system
     */
    String typeSystemSlot = null;
    /**
     * Type system base object
     */
    TypeSystemDec typeSystem = null;
    
    /**
     * Map containing tracing links from source objects to equivalent target objects
     */
    Map<EObject,EObject> transformLink = null;
    
    /**
     * Map containing tracing links from constraint results to equivalent target objects
     */
    Map<Integer,EObject> constraintLink = null;
    
    /**
     * Map containing tracing links from constraint result node to equivalent target objects
     */
    Map<ObjectNode,EObject> createLink = null;
    
    /**
     * Map linking source objects with references to constraint values to constraint slots
     */
    Map<EReference, Map<EObject,Integer>> constraintReference = null;
    
    //CompositeComponent container = null;
	
    /**
     * List linking target property names to their numerical identifier, by their position in the list.
     */
    List<String> functions = new ArrayList<String>();
    /**
     * Map linking type names to representation in target model
     */
    Map<String,ModelElement> typeMap = new HashMap<String,ModelElement>();
    /**
     * Map linking classes to name of type they represent 
     */
    Map<EClass,String> inverseTypeMap = new HashMap<EClass,String>();        
		
	/**
	 * Applies the type system defined in the file indicated by the typeSystemSlot to the model indicated by sourceProgramSlot using the metamodel indicated by sourceMetaModelURI, and puts the result in a new model created in the location indicated by copyProgramSlot using the metamodel indicated by targetMetaModelURI.
	 * <p>
	 * 
	 * @param ctx The workspace used to access the file indicated by the various references.
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#invoke(org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext)
	 */
	public void invoke(IWorkflowContext ctx) {
		
		//Construct constraint program base
        results = (constraints.Program)ctx.get(resultsSlot);
        
        
		//register type system resource factory
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"textAML3", new TextAML3ResourceFactory());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap(
				   ).put(Resource.Factory.Registry.DEFAULT_EXTENSION,
				         new XMIResourceFactoryImpl());
		//register type system ecore model for reference resolving	
		EPackage.Registry.INSTANCE.put(
				"Ns URI	http://www.emftext.org/language/textAML3",
				TextAML3PackageImpl.init());
		
		//Load type system model
		URI typeSystemURI = URI.createPlatformResourceURI(typeSystemSlot,
				true);        
		Resource typeSystemResource = resourceSet.getResource(
				typeSystemURI, true);		
		typeSystem = (TypeSystemDec) typeSystemResource.getContents().get(0);        
        
		// Number of constraint values computed for each object
		int objectSize = getObjectSize(typeSystem) + 1;
		
		// Boolean for recording if constraint results contain any errors 
		Boolean valid = true;
		// Go through results for each object
        for (int i = 0; i < results.getConstraints().size(); i = i + objectSize) {
        	// Get result node
        	ObjectNode result = (ObjectNode)((Equation)((EquationConstraint)results.getConstraints().get(i)).getEquation().get(0)).getRight();
        	// If result is error
        	if (result.getName().equalsIgnoreCase("error")) {
        		String message;
        		// If error has detailed message, get it
        		if (result.getFeatures().size() > 0) {
					ObjectNode error = (ObjectNode) result.getFeatures().get(0)
							.getValue();
					message = "Error at " + i + " :";
					for (Feature f : error.getFeatures()) {
						message = message + " " + nodeToString(f.getValue());
					}
				}
        		else {
        			message = "Error at " + i;
        		}
        		// Print error message to console
				System.out.println(message);
        		
				// Results contain errors
        		valid = false;
        	}
        }
        // If no errors in result, we can construct target model
        if (valid) {
        	// Get source metamodel
			sourceMetaModel = EPackage.Registry.INSTANCE
					.getEPackage(sourceMetaModelURI);
			
			// Get target metamodel
			targetMetaModel = EPackage.Registry.INSTANCE
					.getEPackage(targetMetaModelURI);
			
			// Add all target attributes to function list
			for (TypeRule rule : typeSystem.getRulesystem()) {
				for (RuleElementAttribute attr : rule.getTarget()
						.getAttributes()) {
					if (!functions.contains(attr.getMyattribute().getName())) {
						functions.add(attr.getMyattribute().getName());
					}
				}
			};
			
			// Fill typeMap and inverseTypeMap based on type system
			for (TypeDec dec : typeSystem.getTypevalues()) {
				for (ModelElement rep : dec.getRepresentation()) {
					if (rep.getRelation().equals(ModelElementConnection.IN_OUT)
							|| rep.getRelation().equals(
									ModelElementConnection.OUT)) {
						typeMap.put(rep.getTargetclass().getName().toLowerCase(), rep);
						inverseTypeMap.put(rep.getTargetclass(), dec.getName());
					}
				}
			}
			
			// Get source model
			sourceProgram = (EObject) ctx.get(sourceProgramSlot);
			
			// Initialize tracing link maps
			transformLink = new HashMap<EObject, EObject>();
			createLink = new HashMap<ObjectNode,EObject>();
			constraintLink = new HashMap<Integer,EObject>();
			constraintReference = new HashMap<EReference,Map<EObject,Integer>>();
			
			// Apply constraints results to construct target model
			copyProgram = visit(sourceProgram);
			
			// Fill in any references left open once all object have been constructed
			for(EReference key: constraintReference.keySet()) {
				Map<EObject,Integer> map = constraintReference.get(key);
				for (EObject obj: map.keySet()) {
					obj.eSet(key, EcoreUtil.copy(constraintLink.get(map.get(obj))));
				}				
			}
			
			// Put target model in context slot
			ctx.put(copyProgramSlot, copyProgram);
		}
        // If there are errors, we cannot create a model
        else {
        	System.out.println("Unable to create consistent model");
        }
	}
	
	/**
	 * Returns the current value of the CopyProgram slot.
	 * @return the current value of the CopyProgram slot.
	 */
	public String getCopyProgramSlot() {
		return copyProgramSlot;
	}	
	
	/**
	 * Set the value of the CopyProgram slot.
	 * @param value the new value for the Copy Program slot.
	 */
	public void setCopyProgramSlot(String value) {
		copyProgramSlot = value;
	}
	
	/**
	 * Returns the current value of the Results slot.
	 * @return the current value of the Results slot.
	 */	
	public String getResultsSlot() {
		return resultsSlot;
	}
	
	/**
	 * Set the value of the Results slot.
	 * @param value the new value for the Results slot.
	 */
	public void setResultsSlot(String value) {
		resultsSlot = value;
	}
	
	/**
	 * Returns the current value of the sourceMetaModelURI slot.
	 * @return the current value of the sourceMetaModelURI slot.
	 */	
	public String getSourceMetaModelURI() {
		return sourceMetaModelURI;
	}
	
	/**
	 * Set the value of the sourceMetaModelURI slot.
	 * @param value the new value for the sourceMetaModelURI slot.
	 */
	public void setSourceMetaModelURI(String value) {
		sourceMetaModelURI = value;
	}

	/**
	 * Returns the current value of the sourceProgramSlot slot.
	 * @return the current value of the sourceProgramSlot slot.
	 */	
	public String getSourceProgramSlot() {
		return sourceProgramSlot;
	}

	/**
	 * Set the value of the sourceProgramSlot slot.
	 * @param value the new value for the sourceProgramSlot slot.
	 */
	public void setSourceProgramSlot(String value) {
		sourceProgramSlot = value;
	}

	/**
	 * Returns the current value of the targetMetaModelURI slot.
	 * @return the current value of the targetMetaModelURI slot.
	 */	
	public String getTargetMetaModelURI() {
		return targetMetaModelURI;
	}

	/**
	 * Set the value of the targetMetaModelURI slot.
	 * @param value the new value for the targetMetaModelURI slot.
	 */
	public void setTargetMetaModelURI(String value) {
		targetMetaModelURI = value;
	}

	/**
	 * Returns the current value of the typeSystemSlot slot.
	 * @return the current value of the typeSystemSlot slot.
	 */	
	public String getTypeSystemSlot() {
		return typeSystemSlot;
	}

	/**
	 * Set the value of the typeSystemSlot slot.
	 * @param value the new value for the typeSystemSlot slot.
	 */
	public void setTypeSystemSlot(String value) {
		typeSystemSlot = value;
	}
	
	/**
	 * Apply constraint results to model object and transform to output metamodel.
	 * @param object to be transformed
	 * @return transformed object
	 */
	private EObject visit(EObject o) {
		EObject newObject = null;
		// If already visited, don't visit again
		if (transformLink.containsKey(o)) {
			
			return transformLink.get(o);
		} 
		else {
			//If the object is not in the input model, use directly
		    if (o.eResource() != sourceProgram.eResource()) {
		    	newObject = o;
		    }
		    // Retrieve target class and construct base target object
		    else {
				Integer basenumber = 0;
				//if we have a constraint number, use it to select class based on name
				if (o.eClass().getEStructuralFeature("constraintvar") != null) {
					EObject constraintvar = (EObject)o.eGet(o.eClass().getEStructuralFeature("constraintvar"));
					if (constraintvar != null) {
						basenumber = Integer.parseInt(constraintvar.eGet(
								constraintvar.eClass().getEStructuralFeature("number"))
								.toString());
						if (constraintLink.containsKey(basenumber)) {
						    newObject = constraintLink.get(basenumber);	
						} else {
						    EClass candidate = getConstraintResultFor(basenumber);
						    newObject = EcoreUtil.create(candidate);
						}
					}
				// Otherwise, select class based on name	
					else {
						EPackage copyPackage = getEquivalentPackage(targetMetaModel, o.eClass().getEPackage());
						newObject = copyPackage.getEFactoryInstance().create(getEquivalentEClass(targetMetaModel, o.eClass()));							
					}
				}
				else {
					EPackage copyPackage = getEquivalentPackage(targetMetaModel, o.eClass().getEPackage());
					newObject = copyPackage.getEFactoryInstance().create(getEquivalentEClass(targetMetaModel, o.eClass()));
				}
				
				//add to tracing maps
				transformLink.put(o, newObject);
				constraintLink.put(basenumber, newObject);
				
				//copy non-type features
				copyObjectFeatures(o, newObject);
				//add type features if present
				if (basenumber != 0) {
		    	    addTypeInfo(o,newObject,basenumber);
				}
		    }
		}
		//transformLink.put(o, newObject);
		return newObject;
	}

	/**
	 * Get target class of the rule corresponding to the given constraint variable 
	 * @param basenumber
	 * @return target class
	 */
	private EClass getConstraintResultFor(Integer basenumber) {
		ObjectNode result = (ObjectNode) ((Equation) ((EquationConstraint)results
				.getConstraints().get(basenumber - 1)).getEquation().get(0))
				.getRight();
		EClass candidate = findTargetCandidates(Integer.decode(result
				.getName()));
		return candidate;
	}
	
	/**
	 * Add type information to newObject based on object o and constraint variable basenumber
	 * @param o
	 * @param newObject
	 * @param basenumber
	 * @return transformed object
	 */
	@SuppressWarnings("unchecked")
	private EObject addTypeInfo(EObject o, EObject newObject, Integer basenumber) {
        //for each declared type feature
		for(int i = 0; i < functions.size(); i++) {
			//Get result value
			Node result = getConstraintsResults(basenumber + 1 + i);
			//if the result is a single object
			if (ObjectNode.class.isAssignableFrom(result.getClass())) {
				//if the result is not an error or null
				if (!result.getName().equalsIgnoreCase("error")
						&& !result.getName()
						.equalsIgnoreCase("oclundefined")) {
					//get feature of target object to contain result
                    EReference ref = (EReference)newObject.eClass().getEStructuralFeature(functions.get(i));
                    EList<EObject> links;                    
					if (o.eClass().getEStructuralFeature("links") == null) {
						links = new BasicEList<EObject>();
					} else {
						links = (EList<EObject>) o.eGet(o.eClass().getEStructuralFeature("links"));
					}
					//Create result object
					EObject newvalue = createObjectFromNode((ObjectNode) result,ref.isContainment(),links);
					//if not null add to object and record it if needed
					if (newvalue != null) {
						newObject.eSet(ref, newvalue);
						boolean found = false;
						if (getMetamodelName((ObjectNode)result).equalsIgnoreCase(targetMetaModel.getName())) {
							for (ObjectNode key : createLink.keySet()) {
								found = found
										|| (compareNodeToNode(key, result));
							}
							if (!found) {
								createLink.put((ObjectNode) result,
										newvalue);
							}
						}    
					} else {
						Integer constraintNumber = getConstraintFromNode((ObjectNode)result);
						addToConstraintReference(ref,newObject,constraintNumber);
					}					
				}
			}
			//Otherwise, we have a list
			else {
				if (o.eClass().getEStructuralFeature("links") != null) {
					EList<EObject> links = (EList<EObject>) o.eGet(o
							.eClass().getEStructuralFeature("links"));
					if (ListNode.class.isAssignableFrom(result
							.getClass())) {
						ListNode list = (ListNode) result;
						EList<EObject> resultList = new BasicEList<EObject>();
						//Process objects one by one
						for (Element elem : list.getValues()) {
							for (EObject candidate : links) {
								if (compareNodeToObject(elem, candidate)) {
									resultList.add(visit(candidate));
								}
							}
						}
						newObject.eSet(
								newObject.eClass()
								.getEStructuralFeature(
										functions.get(i)),
										resultList);
					}
				}
			}
		}
		return newObject;
	}
	
	/**
	 * get target class for given type system rule based on index
	 * @param rule
	 * @return target class
	 */
	private EClass findTargetCandidates(Integer rule) {
		if (rule > 0 && rule <= typeSystem.getRulesystem().size()) {
			return typeSystem.getRulesystem().get(rule-1).getTarget().getBaseclass();
		}
		else {
			return null;
		}
	}
    /**
     * Copy features of source model object to target model object
     * @param o
     * @param newObject
     */
	@SuppressWarnings("unchecked")
	private void copyObjectFeatures(EObject o, EObject newObject) {
		//for most attributes, we can copy the value directly
		for(EAttribute attr : o.eClass().getEAllAttributes()) {
			EStructuralFeature newFeature = newObject.eClass().getEStructuralFeature(attr.getName());
			if ((o.eGet(attr) != null) && (newFeature != null)) {
				if (!EEnum.class.isAssignableFrom(attr.getEType().getClass())) {
					if (attr.getEAttributeType().equals(newFeature.getEType())) {
						newObject.eSet(newFeature, o.eGet(attr));
					}
				}
				//for enumeration values, we need to translate from source enumeration to the target enumeration
				else {
					EEnum oldenum = (EEnum)attr.getEAttributeType();
					EEnum neweenum = (EEnum)newFeature.getEType();
					newObject.eSet(newFeature, neweenum.getEEnumLiteral(oldenum.getEEnumLiteralByLiteral(o.eGet(attr).toString()).getName()).getInstance());
				}
			}
		}
		//for containment references, we need to transform all contained objects
		for (EReference r : o.eClass().getEAllContainments()) {
			EStructuralFeature targetFeature = newObject.eClass().getEStructuralFeature(r.getName());
			if ((o.eGet(r) != null) && (targetFeature != null)) {
				if (r.isMany()) {
					EList<EObject> sourcelist = (EList<EObject>) o.eGet(r);
					//visit each object separately
					for (EObject source : sourcelist) {
						EObject temp = visit(source);
						//check if we already visited this object, if so, make a copy, otherwise use directly
						if (temp.eContainer() != null) {
						    ((EList<EObject>) newObject.eGet(targetFeature)).add(EcoreUtil.copy(temp));
						} else {
							((EList<EObject>) newObject.eGet(targetFeature)).add(temp);
						}
					}
				} else {
					EObject source = (EObject) o.eGet(r);
					if (source != null) {
						//visit object
						EObject temp = visit(source);
						//check if we already visited this object, if so, make a copy, otherwise use directly
						if (temp.eContainer() != null) {
						    newObject.eSet(targetFeature, EcoreUtil.copy(temp));
						} else {
							newObject.eSet(targetFeature, temp);
						}
					}
				}
			}			
		}
	}
    
	/**
	 * Select type conversion function based on class
	 * @param type
	 * @return created object
	 */
	private EObject createTypeObject(Element type) {
		if (ObjectNode.class.isAssignableFrom(type.getClass())) {
			return createTypeObject((ObjectNode)type);
		}
		else {
			return createTypeObject((Literal)type);
		}
	}
	
	/**
	 * Create object based on type object node
	 * @param type
	 * @return created object
	 */
	private EObject createTypeObject(ObjectNode type) {
		EObject newObject = null;
		//get type element based on name
		ModelElement typeElement = getTypeRepresentation(type.getName());
		if (typeElement != null) {
			//Create object
			newObject = EcoreUtil.create(typeElement.getTargetclass());
			//add each defined attribute 
			for (int i = 0; i < typeElement.getAttributes().size(); i++) {
				Element value = type.getFeatures().get(i).getValue();
				//for lists, add each element 
				if (ListNode.class.isAssignableFrom(value.getClass())) {
					EList<EObject> values = new BasicEList<EObject>();
					for (Element e : ((ListNode)value).getValues()) {
						values.add(createTypeObject(e));
					}
					newObject.eSet(typeElement.getAttributes().get(i), values);
				}
				else {
					//for enumerations, add converted enumeration value
					if (EEnum.class.isAssignableFrom(typeElement.getAttributes().get(i).getEType().getClass())) {
						EEnum eenum = (EEnum)typeElement.getAttributes().get(i).getEType();
						newObject.eSet(typeElement.getAttributes().get(i), eenum.getEEnumLiteralByLiteral(((Literal)type.getFeatures().get(i).getValue()).getValue()).getInstance());
					}
					else {
						//for objects, add created type objects
						if (EReference.class.isAssignableFrom(typeElement.getAttributes().get(i).getClass())) {
				            newObject.eSet(typeElement.getAttributes().get(i), createTypeObject(type.getFeatures().get(i).getValue()));
						}
						//otherwise, add attribute value
						else {
							newObject.eSet(typeElement.getAttributes().get(i), ((Literal)type.getFeatures().get(i).getValue()).getValue());
						}
					}
				}
			}
		}
		return newObject;
	}
	
	/**
	 * Create object based on basic type element
	 * @param type
	 * @return created object
	 */
	private EObject createTypeObject(Literal type) {
		EObject newObject = null;
		ModelElement typeElement = getTypeRepresentation(type.getValue());
		if (typeElement != null) {
			newObject = EcoreUtil.create(typeElement.getTargetclass());
		}
		return newObject;
	}

	/**
	 * Compare element to object
	 * @param node
	 * @param object
	 * @return true if equal, false if unequal
	 */
	@SuppressWarnings("unchecked")
	private boolean compareNodeToObject(Element node, Object object) {
		//we consider null unequal to null
		if ((node == null) && (object == null)) {
			return false;
		}
		//if we are comparing an object node to an object, use corresponding function
		if (ObjectNode.class.isAssignableFrom(node.getClass())) {
			if (EObject.class.isAssignableFrom(object.getClass())) {
				return compareNodeToObject((ObjectNode)node,(EObject)object,((EObject)object).eClass());
			} else {
			    return false;	
			}
		}
		else {
			//if we compare a list element to a list object, use corresponding function
			if (ListNode.class.isAssignableFrom(node.getClass())) {
				if (EList.class.isAssignableFrom(object.getClass())) {
					return compareNodeToObject((ListNode) node,
							(EList<EObject>) object);
				}
				else {
					//if list has one value, we can compare to a single object
					if (((ListNode)node).getValues().size() == 1) {
					    return compareNodeToObject(((ListNode)node).getValues().get(0),object);
					} else {
						return false;
					}
				}
			}
			else {
				//oclUndefined is equal to null
				if (((Literal)node).getValue().equalsIgnoreCase("oclUndefined")) {
					return object == null;
				}
				else {
					//Literals are compared as strings
					if (object != null) {
					    return ((Literal) node).getValue().equalsIgnoreCase(object.toString());
					}
					else {
						return false;
					}
				}
			}
		}
	}
	
	/**
	 * Compare node to object based on class objectClass
	 * @param node
	 * @param object
	 * @param objectClass
	 * @return true if equal, false if unequal
	 */
	private boolean compareNodeToObject(ObjectNode node, EObject object, EClass objectClass) {
		boolean result = true;
		//Check if the node refers to a type
		if (!typeMap.containsKey(node.getName())) {
			//If the object is of the wrong type, we know it cannot be equal
			if (!getObjectName(node).equalsIgnoreCase(objectClass.getName())) {
				return false;
			}
			//if the node has enough features
			if (node.getFeatures().size() >= objectClass
					.getEStructuralFeatures().size()) {
				//compare each object feature
				for (int i = 0; i < objectClass.getEStructuralFeatures().size(); i++) {
					Element featurevalue = node.getFeatures().get(i).getValue();
					EStructuralFeature estructfeature = objectClass
							.getEStructuralFeatures().get(i);
					if (featurevalue != null) {
						result = result
								&& compareNodeToObject(featurevalue,
										object.eGet(estructfeature));
					} else {
						if (isContainment(estructfeature)) {
						    result = result && (object.eGet(estructfeature) == null);
						}    
					}
				}
			} else {
				return false;
			}
			//If the node has enough features to cover the supertypes also
			if (node.getFeatures().size() >= objectClass.getESuperTypes()
					.size() + objectClass.getEStructuralFeatures().size() && result) {
				//Compare super nodes to object using the superclasses
				for (int i = 0; i < objectClass.getESuperTypes().size(); i++) {
					Element featurevalue = node
							.getFeatures()
							.get(i
									+ objectClass.getEStructuralFeatures()
											.size()).getValue();
					if (featurevalue != null) {
						if (ObjectNode.class.isAssignableFrom(featurevalue.getClass())) {
							result = result
									&& compareNodeToObject(
											(ObjectNode) featurevalue, object,
											objectClass.getESuperTypes().get(i));
						} else {
							result = false;
						}
					}
				}
			} else {
				result = false;
			}
		}
		return result;
	}
	
	/**
	 * Compare list node to list of objects
	 * @param node
	 * @param object
	 * @return true if equal, false if unequal
	 */
	private boolean compareNodeToObject(ListNode node, EList<EObject> object) {
		boolean result = true;
		//If the lists are of equal size 
		if (node.getValues().size() == object.size()) {
			//Compare all elements
			for(int i = 0; i < object.size(); i++) {
				result = result & compareNodeToObject(node.getValues().get(i),object.get(i));
			}
		}
		else {
			result = false;
		}
		return result;
	}
	
	/**
	 * Create object based on node, copying it if copy and using object from links
	 * @param node
	 * @param copy
	 * @param links
	 * @return created object
	 */
	private EObject createObjectFromNode(ObjectNode node, Boolean copy, EList<EObject> links) {
		EObject result = null;
		Boolean found = false;
		//Check if the object is in links
		for(EObject o: links) {
			if (compareNodeToObject(node,o,o.eClass())) {
				found = true;
				EObject temp = visit(o);
				//Return copied object or original depending on copy
				if (copy && (temp.eContainer() != null)) {
					result = EcoreUtil.copy(temp);
				} else {
				    result = temp;
				}    
			} 
			
		}
		if (!found) {
			//Check if we already created an object for this node
			for (ObjectNode n: createLink.keySet()) {
				if(compareNodeToNode(n,node)) {
					EObject temp = createLink.get(n);
					if (temp.eContainer() == null || !copy) {
						result = temp;
						found = true;
					}
				}
			}
		}
		if (!found) {
			//Check if the node describes a type
			EClass resultclass;
			if (typeMap.containsKey(node.getName())) {
				result = createTypeObject(node);
			} else {
				//Check if node contains constraint number
				int basenumber = getConstraintFromNode(node);
				if (basenumber > 0) {
					//Handle constraint administration
					if (constraintLink.get(basenumber) == null) {
						EClass candidate = getConstraintResultFor(basenumber);
						result = EcoreUtil.create(candidate);
						constraintLink.put(basenumber, result);
					} else {
						result = constraintLink.get(basenumber);
					}
				} else {
					//Otherwise create class based on name
					resultclass = (EClass) getClassifier(targetMetaModel,
							getObjectName(node));
					result = EcoreUtil.create(resultclass);
					addFeaturesFromNode(node.getFeatures(), result,
							resultclass, links);
				}
			}
		}
		return result;
	}
	
	/**
	 * Add features from list to object, using features from eclass and objects from links
	 * @param list
	 * @param object
	 * @param eclass
	 * @param links
	 */
	private void addFeaturesFromNode(EList<Feature> list, EObject object, EClass eclass, EList<EObject> links) {
		//For each object feature
		for(EStructuralFeature feature : eclass.getEStructuralFeatures()) {
			Element featurevalue = list.get(eclass.getEStructuralFeatures().indexOf(feature)).getValue();
			if (featurevalue != null) {
				//If the feature is an attribute, set value directly
				if (EAttribute.class.isAssignableFrom(feature.getClass())) {					
					object.eSet(feature, ((Literal)featurevalue).getValue());
				} else {
					//If the value is an object node
					if (ObjectNode.class.isAssignableFrom(featurevalue
							.getClass())) {
						//Try to create an object. If that fails, add constraint reference
						EObject newvalue = createObjectFromNode((ObjectNode) featurevalue,((EReference)feature).isContainment(),links);
						if (newvalue != null) {
							object.eSet(feature, newvalue);
						} else {
							Integer constraintNumber = getConstraintFromNode((ObjectNode)featurevalue);
							addToConstraintReference((EReference)feature,object,constraintNumber);
						}
						
					} else {
						//If the value is a list node
						if (ListNode.class.isAssignableFrom(featurevalue.getClass())) {
						    EList<EObject> resultlist = new BasicEList<EObject>();
						    //Process each node separately
							for (Element listvalue : ((ListNode) featurevalue)
									.getValues()) {
								resultlist
										.add(createObjectFromNode((ObjectNode) listvalue,((EReference)feature).isContainment(),links));
							}
							object.eSet(feature, resultlist);
						} 
						//Other results are errors
					}
				}
			}
		}
		int i = 0;
		//For each superclass, add features from corresponding values
		for(EClass superclass : eclass.getESuperTypes()) {
			Element supervalue = list.get(eclass.getEStructuralFeatures().size() + i).getValue();
			if (supervalue != null) {
				if (ObjectNode.class.isAssignableFrom(supervalue.getClass())) {
					addFeaturesFromNode(
							((ObjectNode) supervalue).getFeatures(), object,
							superclass,links);
				}
			}
			i = i++;
		}
	}
	/**
	 * Get EClass equivalent to eClass from EPackage base based on name
	 * @param base
	 * @param eClass
	 * @return equivalent EClass
	 */
	private EClass getEquivalentEClass(EPackage base, EClass eClass) {
		EClassifier res = base.getEClassifier(eClass.getName());
		if (res != null) {
			return (EClass)res;
		}
		else {
			return (EClass)(getEquivalentPackage(base,eClass.getEPackage())).getEClassifier(eClass.getName());
		}
	}
	
	/**
	 * get EPackage equivalent to ePackage from EPackage base based on name
	 * @param base
	 * @param ePackage
	 * @return
	 */
	private EPackage getEquivalentPackage(EPackage base, EPackage ePackage) {
		EPackage res = null;
		if (ePackage == null) {
			return null;
		}
		//Search direct subpackages of base
		for (EPackage iter : base.getESubpackages()) {
			if (iter.getName().equals(ePackage.getName())) {
				res = iter;
			}
		}
		
		if (res != null) {
		    return res;
		}
		else {
			//If not a subpackage, it might be a sibling package
			if (ePackage.getESuperPackage() != null) {
				EPackage parent = getEquivalentPackage(base,
						ePackage.getESuperPackage());
				for (EPackage iter : parent.getESubpackages()) {
					if (iter.getName().equals(ePackage.getName())) {
						res = iter;
					}
				}
			}
			else {
				res = base;
			}
			return res;
		}
	}
	
	/**
	 * Get result node corresponding to given index
	 * @param number
	 * @return result node
	 */
	private Node getConstraintsResults(int number) {
		return (Node)((Equation)((EquationConstraint)results.getConstraints().get(number -1)).getEquation().get(0)).getRight();
	}
	
	/**
	 * Get element from typeMap corresponding to name
	 * @param name
	 * @return value ModelElement
	 */
	private ModelElement getTypeRepresentation(String name) {
		return typeMap.get(name);
	}
	/**
	 * Get EClassifier from epackage based on name
	 * @param epackage
	 * @param name
	 * @return Found EClassifier
	 */
	private EClassifier getClassifier(EPackage epackage, String name) {
		//Search package directly
		EClassifier result = epackage.getEClassifier(name);
		if (result == null) {
			//If not in main package, search subpackages
			ListIterator<EPackage> subpackages = epackage.getESubpackages().listIterator();
			while (subpackages.hasNext() && result == null) {
				result = getClassifier(subpackages.next(),name);
			}
		}
		return result;
	}
	
	/**
	 * Get the size of objects in the constraint solutions of system
	 * @param system
	 * @return
	 */
	private int getObjectSize(TypeSystemDec system) {
		Set<String> names = new TreeSet<String>();
		//Add all attributes to a set
		for (TypeRule rule : system.getRulesystem()) {
			for (RuleElementAttribute attr : rule.getTarget().getAttributes()) {
				names.add(attr.getMyattribute().getName());
			}
		}
		//Size of set is number of unique attributes
		return names.size();
	}
	/**
	 * Create a string representation for a node
	 * @param n
	 * @return string representation
	 */
	private String nodeToString(Element n) {
		if (n != null) {
			//If the node is an objectnode
			if (ObjectNode.class.isAssignableFrom(n.getClass())) {
				ObjectNode object = (ObjectNode) n;
				//Serialize name and all features
				String text = object.getName() + "(";
				for (Feature f : object.getFeatures()) {
					text = text + "," + nodeToString(f.getValue());
				}
				return text + ")";
			} else {
				//If the node is a listnode
				if (ListNode.class.isAssignableFrom(n.getClass())) {
					ListNode list = (ListNode) n;
					//Serialize all elements in sequence
					String text = "[";
					for (Element e : list.getValues()) {
						text = text + " " + nodeToString(e);
					}
					return text + "]";
				} else {
					//Otherwise, use literal value
					return ((Literal) n).getValue();
				}
			}
		} else {
			return "";
		}
		
	}
	
	/**
	 * Get constraint number from a node
	 * @param n
	 * @return constraint number found, zero if none
	 */
	private int getConstraintFromNode(ObjectNode n) {
		int result = 0;
        //Get classifier corresponding to object
		EClass sourceclass = (EClass)sourceMetaModel.getEClassifier(getObjectName(n));
		
		if (sourceclass != null) {
			//If the node is not a constraint variable
			if (!getObjectName(n).equalsIgnoreCase("constraintvar")) {
				//If node should have a constraint value
				if (sourceclass.getEStructuralFeature("constraintvar") != null) {
					//Seek for it among the features
					for (Feature f : n.getFeatures()) {
						if (f.getValue() != null) {
							if (ObjectNode.class.isAssignableFrom(f.getValue()
									.getClass())) {
								boolean found = false;
								for (EClass parent : sourceclass
										.getESuperTypes()) {
									if (parent.getName().equalsIgnoreCase(
											f.getValue().getName())) {
										found = true;
									}
								}
								result = getConstraintFromNode((ObjectNode) f
										.getValue());
							}
						}
					}

				}
			//If it is a constraint variable, get its value	
			} else {
				result = Integer.parseInt(((Literal) n.getFeatures().get(0)
						.getValue()).getValue());
			}
		}
		return result;
	}
	
	/**
	 * Put EObject obj in constraint reference for reference ref and with constraint value i
	 * @param ref
	 * @param obj
	 * @param i
	 */
	private void addToConstraintReference(EReference ref, EObject obj, Integer i) {
		if (!constraintReference.containsKey(ref)) {
			constraintReference.put(ref, new HashMap<EObject,Integer>());
		}
		constraintReference.get(ref).put(obj,i);
	}
	
	/**
	 * Get object name from object node o
	 * @param o
	 * @return object node
	 */
	private String getObjectName(ObjectNode o) {
		//Object node names are formatted as metamodelname_objectname
		return o.getName().split("_")[1];
	}
	
	/**
	 * Get metamodel name from object node o
	 * @param o
	 * @return metamodel name
	 */
	private String getMetamodelName(ObjectNode o) {
		//Object node names are formatted as metamodelname_objectname
		return o.getName().split("_")[0];
	}
	
	/**
	 * Check if feature f is a containment feature
	 * @param f
	 * @return true if f is containment, false otherwise
	 */
	private boolean isContainment(EStructuralFeature f) {
		if (EAttribute.class.isAssignableFrom(f.getClass())) {
			return true;
		} else {
			return ((EReference)f).isContainment();
		}
	}
	
	/**
	 * Compare node e1 to e2
	 * @param e1
	 * @param e2
	 * @return true if equal, false if unequal
	 */
	private boolean compareNodeToNode(Element e1, Element e2) {
		//if both are not null
		if (!((e1 == null) || (e2 ==null))) {
			//if they are the same kind of node
			if (e1.eClass() == e2.eClass()) {
				//Compare literals based of values
				if (Literal.class.isAssignableFrom(e1.getClass())) {
					return ((Literal) e1).getValue().equals(
							((Literal) e2).getValue());
				} else {
					//Compare object nodes by comparing names and features
					if (ObjectNode.class.isAssignableFrom(e1.getClass())) {
						ObjectNode o1 = (ObjectNode) e1;
						ObjectNode o2 = (ObjectNode) e2;
						boolean result = true;
						result = o1.getName().equals(o2.getName())
								&& (o1.getFeatures().size() == o2.getFeatures()
										.size());
						for (int i = 0; i < (o1.getFeatures().size()) && result; i++) {
							result = result
									&& compareNodeToNode(o1.getFeatures()
											.get(i).getValue(), o2
											.getFeatures().get(i).getValue());
						}
						return result;
					} else {
						//Compare lists based on elements
						if (ListNode.class.isAssignableFrom(e1.getClass())) {
							ListNode l1 = (ListNode) e1;
							ListNode l2 = (ListNode) e2;
							boolean result = true;
							result = l1.getValues().size() == l2.getValues()
									.size();
							for (int i = 0; i < (l1.getValues().size())
									&& result; i++) {
								result = result
										&& compareNodeToNode(l1.getValues()
												.get(i), l2.getValues().get(i));
							}
							return result;
						} else {
							return false;
						}
					}
				}
			//If unequal types, we have unequal objects	
			} else {
				return false;
			}
			//If one is null, only equal if both null
		} else {
			return e1 == e2;
		}
	}
	
    /*
     * (non-Javadoc)
     * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#invokeInternal(org.eclipse.emf.mwe.core.WorkflowContext, org.eclipse.emf.mwe.core.monitor.ProgressMonitor, org.eclipse.emf.mwe.core.issues.Issues)
     */
	@Override
	protected void invokeInternal(WorkflowContext arg0, ProgressMonitor arg1,
			Issues arg2) {
		// Auto-generated method stub
		
	}
}
