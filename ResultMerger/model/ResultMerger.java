package nl.tue.mdse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
import constraints.NodeEquality;
import constraints.ObjectNode;
import constraints.ListNode;

public class ResultMerger extends AbstractEMFWorkflowComponent {
	
	String resultsSlot = null;
    constraints.Program results = null;
    
    String sourceMetaModelURI = null;
    EPackage sourceMetaModel = null;
    
    String sourceProgramSlot = null;
    EObject sourceProgram = null;
    
    String targetMetaModelURI = null;
    EPackage targetMetaModel = null;
    
    String copyProgramSlot = null;
    EObject copyProgram = null;
    
    String typeSystemSlot = null;
    TypeSystemDec typeSystem = null;
    
    Map<EObject,EObject> transformLink = null;
    
    CompositeComponent container = null;
	
    List<String> functions = new ArrayList<String>();
    Map<String,ModelElement> typeMap = new HashMap<String,ModelElement>();
    Map<EClass,String> inverseTypeMap = new HashMap<EClass,String>();    
	@Override
	public void preInvoke() {
		
	}
    
	public void invoke(IWorkflowContext ctx) {
		
        results = (constraints.Program)ctx.get(resultsSlot);
        
        Boolean valid = true;

		//register your resource factory
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"textAML3", new TextAML3ResourceFactory());
		//register all ecore models needed for reference resolving as follows:	
		EPackage.Registry.INSTANCE.put(
				"Ns URI	http://www.emftext.org/language/textAML3",
				TextAML3PackageImpl.init());
		URI typeSystemURI = URI.createPlatformResourceURI(typeSystemSlot,
				true);
		Resource typeSystemResource = resourceSet.getResource(
				typeSystemURI, true);
		typeSystem = (TypeSystemDec) typeSystemResource.getContents().get(0);        
        
		int objectSize = getObjectSize(typeSystem) + 1;
		
        for (int i = 0; i < results.getConstraints().size(); i = i + objectSize) {
        	if (((ObjectNode)((NodeEquality)results.getConstraints().get(i).getEquation().get(0)).getRight()).getName().equalsIgnoreCase("error")) {
        		System.out.println("Error at " +i);
        		valid = false;
        	}
        }
        
        if (valid) {
			sourceMetaModel = EPackage.Registry.INSTANCE
					.getEPackage(sourceMetaModelURI);
			//        sourceMetaModel = (EPackage)ctx.get(sourceMetaModelSlot);
			targetMetaModel = EPackage.Registry.INSTANCE
					.getEPackage(targetMetaModelURI);
			for (TypeRule rule : typeSystem.getRulesystem()) {
				for (RuleElementAttribute attr : rule.getTarget()
						.getAttributes()) {
					if (!functions.contains(attr.getMyattribute().getName())) {
						functions.add(attr.getMyattribute().getName());
					}
				}
			}
			;
			for (TypeDec dec : typeSystem.getTypevalues()) {
				for (ModelElement rep : dec.getRepresentation()) {
					if (rep.getRelation().equals(ModelElementConnection.IN_OUT)
							|| rep.getRelation().equals(
									ModelElementConnection.OUT)) {
						typeMap.put(dec.getName(), rep);
						inverseTypeMap.put(rep.getTargetclass(), dec.getName());
					}
				}
			}
			sourceProgram = (EObject) ctx.get(sourceProgramSlot);
			transformLink = new HashMap<EObject, EObject>();
			copyProgram = visit(sourceProgram);
			ctx.put(copyProgramSlot, copyProgram);
		}
        else {
        	System.out.println("Unable to create consistent model");
        }

	}
	
	@Override
	protected void invokeInternal(WorkflowContext arg0, ProgressMonitor arg1,
			Issues arg2) {

	}
	
	@Override
	public void postInvoke() {

		
	}
	
	public String getCopyProgramSlot() {
		return copyProgramSlot;
	}	
	
	public void setCopyProgramSlot(String value) {
		copyProgramSlot = value;
	}
	
	public String getResultsSlot() {
		return resultsSlot;
	}
	
	public void setResultsSlot(String value) {
		resultsSlot = value;
	}
	
	public String getSourceMetaModelURI() {
		return sourceMetaModelURI;
	}
	
	public void setSourceMetaModelURI(String value) {
		sourceMetaModelURI = value;
	}
	
	public String getSourceProgramSlot() {
		return sourceProgramSlot;
	}
	
	public void setSourceProgramSlot(String value) {
		sourceProgramSlot = value;
	}
	
	public String getTargetMetaModelURI() {
		return targetMetaModelURI;
	}
	
	public void setTargetMetaModelURI(String value) {
		targetMetaModelURI = value;
	}
	
	public String getTypeSystemSlot() {
		return typeSystemSlot;
	}
	
	public void setTypeSystemSlot(String value) {
		typeSystemSlot = value;
	}
	
/*	private void registerAll(EPackage basePackage) {
		EPackage.Registry.INSTANCE.put(basePackage.getNsURI(), basePackage);
        for(EPackage p : basePackage.getESubpackages()) {
        	registerAll(p);
        }
	}*/
	
	private EObject visit(EObject o) {
		EObject newObject = null;
		
		if (transformLink.containsKey(o)) {
			return transformLink.get(o);
		} 
		else {
		    if (o.eResource() != sourceProgram.eResource()) {
		    	newObject = o;
		    }
		    else {
		    	newObject = createNewObject(o);
		    }
		}
		transformLink.put(o, newObject);
		return newObject;
	}
	
	private EObject createNewObject(EObject o) {
		EObject newObject = null;
		
		Integer basenumber = 0;
		
		if (o.eClass().getEStructuralFeature("constraintvar") != null) {
			EObject constraintvar = (EObject)o.eGet(o.eClass().getEStructuralFeature("constraintvar"));
			if (constraintvar != null) {
				basenumber = Integer.parseInt(constraintvar.eGet(
						constraintvar.eClass().getEStructuralFeature("number"))
						.toString());
				ObjectNode result = (ObjectNode) ((NodeEquality) results
						.getConstraints().get(basenumber - 1).getEquation().get(0))
						.getRight();
				EClass candidate = findTargetCandidates(Integer.decode(result
						.getName()));
				newObject = EcoreUtil.create(candidate);
			}
			else {
				EPackage copyPackage = getEquivalentPackage(targetMetaModel, o.eClass().getEPackage());
				newObject = copyPackage.getEFactoryInstance().create(getEquivalentEClass(targetMetaModel, o.eClass()));							
			}
		}
		else {
			EPackage copyPackage = getEquivalentPackage(targetMetaModel, o.eClass().getEPackage());
			newObject = copyPackage.getEFactoryInstance().create(getEquivalentEClass(targetMetaModel, o.eClass()));
		}

		copyObjectFeatures(o, newObject);
		if (basenumber != 0) {
			System.out.println(basenumber);
			for(int i = 0; i < functions.size(); i++) {
				Node result = getConstraintsResults(basenumber + 1 + i);
				if (ObjectNode.class.isAssignableFrom(result.getClass())) {
					if (!result.getName().equalsIgnoreCase("error")
							&& !result.getName()
									.equalsIgnoreCase("oclundefined")) {
						if (o.eClass().getEStructuralFeature("links") != null) {
							@SuppressWarnings("unchecked")
							EList<EObject> links = (EList<EObject>) o.eGet(o
									.eClass().getEStructuralFeature("links"));
							for (EObject candidate : links) {
								if (compareNodeToObject(result, candidate)) {
									newObject.eSet(
											newObject.eClass()
													.getEStructuralFeature(
															functions.get(i)),
											visit(candidate));
								}
							}
						}
						else {
							newObject.eSet(
									newObject.eClass()
											.getEStructuralFeature(
													functions.get(i)),
									visit(createObjectFromNode((ObjectNode)result)));
						}
					}
				}
				else {
					if (o.eClass().getEStructuralFeature("links") != null) {
						@SuppressWarnings("unchecked")
						EList<EObject> links = (EList<EObject>) o.eGet(o
								.eClass().getEStructuralFeature("links"));
						if (ListNode.class.isAssignableFrom(result
								.getClass())) {
							ListNode list = (ListNode) result;
							EList<EObject> resultList = new BasicEList<EObject>();
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
		}		
		return newObject;
	}
	
	private EClass findTargetCandidates(Integer rule) {
		if (rule > 0 && rule <= typeSystem.getRulesystem().size()) {
			return typeSystem.getRulesystem().get(rule-1).getTarget().getBaseclass();
		}
		else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	private void copyObjectFeatures(EObject o, EObject newObject) {
		for(EAttribute attr : o.eClass().getEAllAttributes()) {
			EStructuralFeature newFeature = newObject.eClass().getEStructuralFeature(attr.getName());
			if ((o.eGet(attr) != null) && (newFeature != null)) {
				if (!EEnum.class.isAssignableFrom(attr.getEType().getClass())) {
					if (attr.getEAttributeType().equals(newFeature.getEType())) {
						newObject.eSet(newFeature, o.eGet(attr));
					}
				}
				else {
					EEnum oldenum = (EEnum)attr.getEAttributeType();
					EEnum neweenum = (EEnum)newFeature.getEType();
					newObject.eSet(newFeature, neweenum.getEEnumLiteral(oldenum.getEEnumLiteralByLiteral(o.eGet(attr).toString()).getName()).getInstance());
				}
			}
		}
		for (EReference r : o.eClass().getEAllContainments()) {
			EStructuralFeature targetFeature = newObject.eClass().getEStructuralFeature(r.getName());
			if ((o.eGet(r) != null) && (targetFeature != null)) {
				if (r.isMany()) {
					EList<EObject> sourcelist = (EList<EObject>) o.eGet(r);
					for (EObject source : sourcelist) {						
						((EList<EObject>) newObject.eGet(targetFeature)).add(visit(source));
					}
				} else {
					EObject source = (EObject) o.eGet(r);
					if (source != null) {
						newObject.eSet(targetFeature, visit(source));
					}
				}
			}			
		}
	}

	private EObject createTypeObject(Element type) {
		if (ObjectNode.class.isAssignableFrom(type.getClass())) {
			return createTypeObject((ObjectNode)type);
		}
		else {
			return createTypeObject((Literal)type);
		}
	}
	
	private EObject createTypeObject(ObjectNode type) {
		EObject newObject = null;
		ModelElement typeElement = getTypeRepresentation(type.getName());
		if (typeElement != null) {
			newObject = EcoreUtil.create(typeElement.getTargetclass());
			for (int i = 0; i < typeElement.getAttributes().size(); i++) {
				Element value = type.getFeatures().get(i).getValue();
				if (ListNode.class.isAssignableFrom(value.getClass())) {
					EList<EObject> values = new BasicEList<EObject>();
					for (Element e : ((ListNode)value).getValues()) {
						values.add(createTypeObject(e));
					}
					newObject.eSet(typeElement.getAttributes().get(i), values);
				}
				else {
					if (EEnum.class.isAssignableFrom(typeElement.getAttributes().get(i).getEType().getClass())) {
						EEnum eenum = (EEnum)typeElement.getAttributes().get(i).getEType();
						newObject.eSet(typeElement.getAttributes().get(i), eenum.getEEnumLiteralByLiteral(((Literal)type.getFeatures().get(i).getValue()).getValue()).getInstance());
					}
					else {
						if (EReference.class.isAssignableFrom(typeElement.getAttributes().get(i).getClass())) {
				            newObject.eSet(typeElement.getAttributes().get(i), createTypeObject(type.getFeatures().get(i).getValue()));
						}
						else {
							newObject.eSet(typeElement.getAttributes().get(i), ((Literal)type.getFeatures().get(i).getValue()).getValue());
						}
					}
				}
			}
		}
		return newObject;
	}
	
	private EObject createTypeObject(Literal type) {
		EObject newObject = null;
		ModelElement typeElement = getTypeRepresentation(type.getValue());
		if (typeElement != null) {
			newObject = EcoreUtil.create(typeElement.getTargetclass());
		}
		return newObject;
	}

	@SuppressWarnings("unchecked")
	private boolean compareNodeToObject(Element node, Object object) {
		if (ObjectNode.class.isAssignableFrom(node.getClass())) {
			return compareNodeToObject((ObjectNode)node,(EObject)object);
		}
		else {
			if (ListNode.class.isAssignableFrom(node.getClass())) {
				if (EList.class.isAssignableFrom(object.getClass())) {
					return compareNodeToObject((ListNode) node,
							(EList<EObject>) object);
				}
				else {
					return compareNodeToObject(((ListNode)node).getValues().get(0),object);
				}
			}
			else {
				if (((Literal)node).getValue().equalsIgnoreCase("oclUndefined")) {
					return object == null;
				}
				else {
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
	
	private boolean compareNodeToObject(ObjectNode node, EObject object) {
		boolean result = true;
		if (object != null) {
			if (node.getName()
					.equalsIgnoreCase(object.eClass().getName())) {
				EClass objectClass = object.eClass();
				for (int i = 0; i < objectClass.getEStructuralFeatures().size(); i++) {
					Element featurevalue = node.getFeatures().get(i).getValue();
					if (featurevalue != null) {
						EStructuralFeature estructfeature = objectClass
								.getEStructuralFeatures().get(i);
						result = result
								&& compareNodeToObject(featurevalue,
										object.eGet(estructfeature));
					}
				}
				for (int i = 0; i < objectClass.getESuperTypes().size(); i++) {
					Element featurevalue = node
							.getFeatures()
							.get(i
									+ objectClass.getEStructuralFeatures()
											.size()).getValue();
					if (featurevalue != null) {
						if (ObjectNode.class.isAssignableFrom(featurevalue
								.getClass())) {
							result = result
									&& compareNodeToObject(
											(ObjectNode) featurevalue, object,
											objectClass.getESuperTypes().get(i));
						} else {
							System.out.println("List as super?");
						}
					}
				}
			} else {
				result = false;
			}
		}
		return result;
	}

	private boolean compareNodeToObject(ObjectNode node, EObject object, EClass objectClass) {
		boolean result = true;
		for (int i = 0; i < objectClass.getEStructuralFeatures().size(); i++){
			Element featurevalue = node.getFeatures().get(i).getValue();
			if (featurevalue != null) {
				EStructuralFeature estructfeature = objectClass.getEStructuralFeatures().get(i);
				result = result && compareNodeToObject(featurevalue,object.eGet(estructfeature));
			}
		}
		for (int i = 0; i < objectClass.getESuperTypes().size(); i++) {
			Element featurevalue = node.getFeatures().get(i + objectClass.getEStructuralFeatures().size()).getValue();
			if (featurevalue != null) {
				result = result && compareNodeToObject((ObjectNode)featurevalue,object, objectClass.getESuperTypes().get(i));
			}					
		}
		return result;
	}
	
	private boolean compareNodeToObject(ListNode node, EList<EObject> object) {
		boolean result = true;
		if (node.getValues().size() == object.size()) {
			for(int i = 0; i < object.size(); i++) {
				result = result & compareNodeToObject(node.getValues().get(i),object.get(i));
			}
		}
		else {
			result = false;
		}
		return result;
	}
	
	private EObject createObjectFromNode(ObjectNode node) {
		EObject result = null;
		EClass candidate = (EClass)targetMetaModel.getEClassifier(node.getName().);
		result = EcoreUtil.create(candidate);
		return result;
	}
	
	private EClass getEquivalentEClass(EPackage base, EClass eClass) {
		EClassifier res = base.getEClassifier(eClass.getName());
		if (res != null) {
			return (EClass)res;
		}
		else {
			return (EClass)(getEquivalentPackage(base,eClass.getEPackage())).getEClassifier(eClass.getName());
		}
	}
	
	private EPackage getEquivalentPackage(EPackage base, EPackage ePackage) {
		EPackage res = null;
		if (ePackage == null) {
			return null;
		}
		
		for (EPackage iter : base.getESubpackages()) {
			if (iter.getName().equals(ePackage.getName())) {
				res = iter;
			}
		}
		
		if (res != null) {
		    return res;
		}
		else {
			
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
	
	private Node getConstraintsResults(int number) {
		return (Node)((NodeEquality)results.getConstraints().get(number -1).getEquation().get(0)).getRight();
	}
	
	private ModelElement getTypeRepresentation(String name) {
		return typeMap.get(name);
	}
	
	private String getType(EClass eclass) {
		return inverseTypeMap.get(eclass);
	}
	
	private int getObjectSize(TypeSystemDec system) {
		Set<String> names = new TreeSet<String>();
		for (TypeRule rule : system.getRulesystem()) {
			for (RuleElementAttribute attr : rule.getTarget().getAttributes()) {
				names.add(attr.getMyattribute().getName());
			}
		}
		return names.size();
	}
	
	@SuppressWarnings("unchecked")
	private boolean compareTypeToObject(ObjectNode type, EObject object) {
		boolean result = true;
		ModelElement typeElement = getTypeRepresentation(type.getName());
		if (typeElement.getTargetclass().getName().equalsIgnoreCase(object.eClass().getName())) {
			for (EStructuralFeature f : typeElement.getAttributes()) {
				if (f.getUpperBound() != 1) {
					Element typevalue = type.getFeatures().get(typeElement.getAttributes().indexOf(f)).getValue();
					result = result && compareNodeToObject(typevalue,(EObject)object.eGet(f));
				}
				else {
					if (EReference.class.isAssignableFrom(f.getClass())) {
					    EObject objectvalue = (EObject)object.eGet(f);
					    ObjectNode typevalue = (ObjectNode)type.getFeatures().get(typeElement.getAttributes().indexOf(f)).getValue();
					    result = result && compareNodeToObject(typevalue,objectvalue);
					}
					else {
						Literal featurevalue = (Literal)type.getFeatures().get(typeElement.getAttributes().indexOf(f)).getValue();
						result = result
								&& (((Literal) featurevalue).getValue()
										.equalsIgnoreCase(object.eGet(f).toString()));
					}
				}
			}
		}
		else {
			result = false;
		}
		return result;
	}
}
