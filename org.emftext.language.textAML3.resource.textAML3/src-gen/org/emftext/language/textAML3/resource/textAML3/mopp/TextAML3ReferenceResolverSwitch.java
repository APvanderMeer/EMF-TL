/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.mopp;

public class TextAML3ReferenceResolverSwitch implements org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected org.emftext.language.textAML3.resource.textAML3.analysis.TypeSystemDecBaseclassReferenceResolver typeSystemDecBaseclassReferenceResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.TypeSystemDecBaseclassReferenceResolver();
	protected org.emftext.language.textAML3.resource.textAML3.analysis.TypeSystemDecStrategytargetReferenceResolver typeSystemDecStrategytargetReferenceResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.TypeSystemDecStrategytargetReferenceResolver();
	protected org.emftext.language.textAML3.resource.textAML3.analysis.PackageElementTargetpackageReferenceResolver packageElementTargetpackageReferenceResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.PackageElementTargetpackageReferenceResolver();
	protected org.emftext.language.textAML3.resource.textAML3.analysis.ModelElementTargetclassReferenceResolver modelElementTargetclassReferenceResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.ModelElementTargetclassReferenceResolver();
	protected org.emftext.language.textAML3.resource.textAML3.analysis.ModelElementAttributesReferenceResolver modelElementAttributesReferenceResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.ModelElementAttributesReferenceResolver();
	protected org.emftext.language.textAML3.resource.textAML3.analysis.TypeRelationReferenceTargetReferenceResolver typeRelationReferenceTargetReferenceResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.TypeRelationReferenceTargetReferenceResolver();
	protected org.emftext.language.textAML3.resource.textAML3.analysis.TypeRelationReferenceElementTypeattributeReferenceResolver typeRelationReferenceElementTypeattributeReferenceResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.TypeRelationReferenceElementTypeattributeReferenceResolver();
	protected org.emftext.language.textAML3.resource.textAML3.analysis.RuleElementExpressionBaseclassReferenceResolver ruleElementExpressionBaseclassReferenceResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.RuleElementExpressionBaseclassReferenceResolver();
	protected org.emftext.language.textAML3.resource.textAML3.analysis.RuleElementAttributeMyattributeReferenceResolver ruleElementAttributeMyattributeReferenceResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.RuleElementAttributeMyattributeReferenceResolver();
	protected org.emftext.language.textAML3.resource.textAML3.analysis.AttributeExpressionMyattributeReferenceResolver attributeExpressionMyattributeReferenceResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.AttributeExpressionMyattributeReferenceResolver();
	protected org.emftext.language.textAML3.resource.textAML3.analysis.ContainmentVariableContainerReferenceResolver containmentVariableContainerReferenceResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.ContainmentVariableContainerReferenceResolver();
	protected org.emftext.language.textAML3.resource.textAML3.analysis.VariableReferenceTargetReferenceResolver variableReferenceTargetReferenceResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.VariableReferenceTargetReferenceResolver();
	protected org.emftext.language.textAML3.resource.textAML3.analysis.TypeReferenceTargetReferenceResolver typeReferenceTargetReferenceResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.TypeReferenceTargetReferenceResolver();
	protected org.emftext.language.textAML3.resource.textAML3.analysis.TypeReferenceElementTypeattributeReferenceResolver typeReferenceElementTypeattributeReferenceResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.TypeReferenceElementTypeattributeReferenceResolver();
	protected org.emftext.language.textAML3.resource.textAML3.analysis.AttributeReferenceTargetReferenceResolver attributeReferenceTargetReferenceResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.AttributeReferenceTargetReferenceResolver();
	protected org.emftext.language.textAML3.resource.textAML3.analysis.ModelElementExpressionBaseclassReferenceResolver modelElementExpressionBaseclassReferenceResolver = new org.emftext.language.textAML3.resource.textAML3.analysis.ModelElementExpressionBaseclassReferenceResolver();
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.TypeSystemDec, org.eclipse.emf.ecore.EClass> getTypeSystemDecBaseclassReferenceResolver() {
		return getResolverChain(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec_Baseclass(), typeSystemDecBaseclassReferenceResolver);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.TypeSystemDec, org.eclipse.emf.ecore.EStructuralFeature> getTypeSystemDecStrategytargetReferenceResolver() {
		return getResolverChain(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec_Strategytarget(), typeSystemDecStrategytargetReferenceResolver);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.PackageElement, org.eclipse.emf.ecore.EPackage> getPackageElementTargetpackageReferenceResolver() {
		return getResolverChain(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getPackageElement_Targetpackage(), packageElementTargetpackageReferenceResolver);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.ModelElement, org.eclipse.emf.ecore.EClass> getModelElementTargetclassReferenceResolver() {
		return getResolverChain(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElement_Targetclass(), modelElementTargetclassReferenceResolver);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.ModelElement, org.eclipse.emf.ecore.EStructuralFeature> getModelElementAttributesReferenceResolver() {
		return getResolverChain(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElement_Attributes(), modelElementAttributesReferenceResolver);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.TypeRelationReference, org.emftext.language.textAML3.TypeDec> getTypeRelationReferenceTargetReferenceResolver() {
		return getResolverChain(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelationReference_Target(), typeRelationReferenceTargetReferenceResolver);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.TypeRelationReferenceElement, org.emftext.language.textAML3.TypeAttribute> getTypeRelationReferenceElementTypeattributeReferenceResolver() {
		return getResolverChain(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelationReferenceElement_Typeattribute(), typeRelationReferenceElementTypeattributeReferenceResolver);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.RuleElementExpression, org.eclipse.emf.ecore.EClass> getRuleElementExpressionBaseclassReferenceResolver() {
		return getResolverChain(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getRuleElementExpression_Baseclass(), ruleElementExpressionBaseclassReferenceResolver);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.RuleElementAttribute, org.eclipse.emf.ecore.EStructuralFeature> getRuleElementAttributeMyattributeReferenceResolver() {
		return getResolverChain(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getRuleElementAttribute_Myattribute(), ruleElementAttributeMyattributeReferenceResolver);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.AttributeExpression, org.eclipse.emf.ecore.EStructuralFeature> getAttributeExpressionMyattributeReferenceResolver() {
		return getResolverChain(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getAttributeExpression_Myattribute(), attributeExpressionMyattributeReferenceResolver);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.ContainmentVariable, org.eclipse.emf.ecore.EClass> getContainmentVariableContainerReferenceResolver() {
		return getResolverChain(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getContainmentVariable_Container(), containmentVariableContainerReferenceResolver);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.VariableReference, org.emftext.language.textAML3.Variable> getVariableReferenceTargetReferenceResolver() {
		return getResolverChain(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getVariableReference_Target(), variableReferenceTargetReferenceResolver);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.TypeReference, org.emftext.language.textAML3.TypeDec> getTypeReferenceTargetReferenceResolver() {
		return getResolverChain(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReference_Target(), typeReferenceTargetReferenceResolver);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.TypeReferenceElement, org.emftext.language.textAML3.TypeAttribute> getTypeReferenceElementTypeattributeReferenceResolver() {
		return getResolverChain(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReferenceElement_Typeattribute(), typeReferenceElementTypeattributeReferenceResolver);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.AttributeReference, org.emftext.language.textAML3.TypeAttribute> getAttributeReferenceTargetReferenceResolver() {
		return getResolverChain(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getAttributeReference_Target(), attributeReferenceTargetReferenceResolver);
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.ModelElementExpression, org.eclipse.emf.ecore.ENamedElement> getModelElementExpressionBaseclassReferenceResolver() {
		return getResolverChain(org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementExpression_Baseclass(), modelElementExpressionBaseclassReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		typeSystemDecBaseclassReferenceResolver.setOptions(options);
		typeSystemDecStrategytargetReferenceResolver.setOptions(options);
		packageElementTargetpackageReferenceResolver.setOptions(options);
		modelElementTargetclassReferenceResolver.setOptions(options);
		modelElementAttributesReferenceResolver.setOptions(options);
		typeRelationReferenceTargetReferenceResolver.setOptions(options);
		typeRelationReferenceElementTypeattributeReferenceResolver.setOptions(options);
		ruleElementExpressionBaseclassReferenceResolver.setOptions(options);
		ruleElementAttributeMyattributeReferenceResolver.setOptions(options);
		attributeExpressionMyattributeReferenceResolver.setOptions(options);
		containmentVariableContainerReferenceResolver.setOptions(options);
		variableReferenceTargetReferenceResolver.setOptions(options);
		typeReferenceTargetReferenceResolver.setOptions(options);
		typeReferenceElementTypeattributeReferenceResolver.setOptions(options);
		attributeReferenceTargetReferenceResolver.setOptions(options);
		modelElementExpressionBaseclassReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec().isInstance(container)) {
			TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EClass> frr = new TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EClass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("baseclass")) {
				typeSystemDecBaseclassReferenceResolver.resolve(identifier, (org.emftext.language.textAML3.TypeSystemDec) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec().isInstance(container)) {
			TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EStructuralFeature> frr = new TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EStructuralFeature>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("strategytarget")) {
				typeSystemDecStrategytargetReferenceResolver.resolve(identifier, (org.emftext.language.textAML3.TypeSystemDec) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getPackageElement().isInstance(container)) {
			TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EPackage> frr = new TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EPackage>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("targetpackage")) {
				packageElementTargetpackageReferenceResolver.resolve(identifier, (org.emftext.language.textAML3.PackageElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElement().isInstance(container)) {
			TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EClass> frr = new TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EClass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("targetclass")) {
				modelElementTargetclassReferenceResolver.resolve(identifier, (org.emftext.language.textAML3.ModelElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElement().isInstance(container)) {
			TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EStructuralFeature> frr = new TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EStructuralFeature>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("attributes")) {
				modelElementAttributesReferenceResolver.resolve(identifier, (org.emftext.language.textAML3.ModelElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelationReference().isInstance(container)) {
			TextAML3FuzzyResolveResult<org.emftext.language.textAML3.TypeDec> frr = new TextAML3FuzzyResolveResult<org.emftext.language.textAML3.TypeDec>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("target")) {
				typeRelationReferenceTargetReferenceResolver.resolve(identifier, (org.emftext.language.textAML3.TypeRelationReference) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelationReferenceElement().isInstance(container)) {
			TextAML3FuzzyResolveResult<org.emftext.language.textAML3.TypeAttribute> frr = new TextAML3FuzzyResolveResult<org.emftext.language.textAML3.TypeAttribute>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("typeattribute")) {
				typeRelationReferenceElementTypeattributeReferenceResolver.resolve(identifier, (org.emftext.language.textAML3.TypeRelationReferenceElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getRuleElementExpression().isInstance(container)) {
			TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EClass> frr = new TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EClass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("baseclass")) {
				ruleElementExpressionBaseclassReferenceResolver.resolve(identifier, (org.emftext.language.textAML3.RuleElementExpression) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getRuleElementAttribute().isInstance(container)) {
			TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EStructuralFeature> frr = new TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EStructuralFeature>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("myattribute")) {
				ruleElementAttributeMyattributeReferenceResolver.resolve(identifier, (org.emftext.language.textAML3.RuleElementAttribute) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getAttributeExpression().isInstance(container)) {
			TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EStructuralFeature> frr = new TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EStructuralFeature>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("myattribute")) {
				attributeExpressionMyattributeReferenceResolver.resolve(identifier, (org.emftext.language.textAML3.AttributeExpression) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getContainmentVariable().isInstance(container)) {
			TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EClass> frr = new TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.EClass>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("container")) {
				containmentVariableContainerReferenceResolver.resolve(identifier, (org.emftext.language.textAML3.ContainmentVariable) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getVariableReference().isInstance(container)) {
			TextAML3FuzzyResolveResult<org.emftext.language.textAML3.Variable> frr = new TextAML3FuzzyResolveResult<org.emftext.language.textAML3.Variable>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("target")) {
				variableReferenceTargetReferenceResolver.resolve(identifier, (org.emftext.language.textAML3.VariableReference) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReference().isInstance(container)) {
			TextAML3FuzzyResolveResult<org.emftext.language.textAML3.TypeDec> frr = new TextAML3FuzzyResolveResult<org.emftext.language.textAML3.TypeDec>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("target")) {
				typeReferenceTargetReferenceResolver.resolve(identifier, (org.emftext.language.textAML3.TypeReference) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReferenceElement().isInstance(container)) {
			TextAML3FuzzyResolveResult<org.emftext.language.textAML3.TypeAttribute> frr = new TextAML3FuzzyResolveResult<org.emftext.language.textAML3.TypeAttribute>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("typeattribute")) {
				typeReferenceElementTypeattributeReferenceResolver.resolve(identifier, (org.emftext.language.textAML3.TypeReferenceElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getAttributeReference().isInstance(container)) {
			TextAML3FuzzyResolveResult<org.emftext.language.textAML3.TypeAttribute> frr = new TextAML3FuzzyResolveResult<org.emftext.language.textAML3.TypeAttribute>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("target")) {
				attributeReferenceTargetReferenceResolver.resolve(identifier, (org.emftext.language.textAML3.AttributeReference) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementExpression().isInstance(container)) {
			TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.ENamedElement> frr = new TextAML3FuzzyResolveResult<org.eclipse.emf.ecore.ENamedElement>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("baseclass")) {
				modelElementExpressionBaseclassReferenceResolver.resolve(identifier, (org.emftext.language.textAML3.ModelElementExpression) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec_Baseclass()) {
			return getResolverChain(reference, typeSystemDecBaseclassReferenceResolver);
		}
		if (reference == org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeSystemDec_Strategytarget()) {
			return getResolverChain(reference, typeSystemDecStrategytargetReferenceResolver);
		}
		if (reference == org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getPackageElement_Targetpackage()) {
			return getResolverChain(reference, packageElementTargetpackageReferenceResolver);
		}
		if (reference == org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElement_Targetclass()) {
			return getResolverChain(reference, modelElementTargetclassReferenceResolver);
		}
		if (reference == org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElement_Attributes()) {
			return getResolverChain(reference, modelElementAttributesReferenceResolver);
		}
		if (reference == org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelationReference_Target()) {
			return getResolverChain(reference, typeRelationReferenceTargetReferenceResolver);
		}
		if (reference == org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeRelationReferenceElement_Typeattribute()) {
			return getResolverChain(reference, typeRelationReferenceElementTypeattributeReferenceResolver);
		}
		if (reference == org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getRuleElementExpression_Baseclass()) {
			return getResolverChain(reference, ruleElementExpressionBaseclassReferenceResolver);
		}
		if (reference == org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getRuleElementAttribute_Myattribute()) {
			return getResolverChain(reference, ruleElementAttributeMyattributeReferenceResolver);
		}
		if (reference == org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getAttributeExpression_Myattribute()) {
			return getResolverChain(reference, attributeExpressionMyattributeReferenceResolver);
		}
		if (reference == org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getContainmentVariable_Container()) {
			return getResolverChain(reference, containmentVariableContainerReferenceResolver);
		}
		if (reference == org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getVariableReference_Target()) {
			return getResolverChain(reference, variableReferenceTargetReferenceResolver);
		}
		if (reference == org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReference_Target()) {
			return getResolverChain(reference, typeReferenceTargetReferenceResolver);
		}
		if (reference == org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getTypeReferenceElement_Typeattribute()) {
			return getResolverChain(reference, typeReferenceElementTypeattributeReferenceResolver);
		}
		if (reference == org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getAttributeReference_Target()) {
			return getResolverChain(reference, attributeReferenceTargetReferenceResolver);
		}
		if (reference == org.emftext.language.textAML3.TextAML3Package.eINSTANCE.getModelElementExpression_Baseclass()) {
			return getResolverChain(reference, modelElementExpressionBaseclassReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(org.emftext.language.textAML3.resource.textAML3.ITextAML3Options.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new org.emftext.language.textAML3.resource.textAML3.util.TextAML3RuntimeUtil().logWarning("Found value with invalid type for option " + org.emftext.language.textAML3.resource.textAML3.ITextAML3Options.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver) {
			org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver replacingResolver = (org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver) resolverValue;
			if (replacingResolver instanceof org.emftext.language.textAML3.resource.textAML3.ITextAML3DelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((org.emftext.language.textAML3.resource.textAML3.ITextAML3DelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceCache) {
					org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver nextResolver = (org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver) next;
					if (nextResolver instanceof org.emftext.language.textAML3.resource.textAML3.ITextAML3DelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((org.emftext.language.textAML3.resource.textAML3.ITextAML3DelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new org.emftext.language.textAML3.resource.textAML3.util.TextAML3RuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.emftext.language.textAML3.resource.textAML3.ITextAML3Options.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.emftext.language.textAML3.resource.textAML3.ITextAML3DelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new org.emftext.language.textAML3.resource.textAML3.util.TextAML3RuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.emftext.language.textAML3.resource.textAML3.ITextAML3Options.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.emftext.language.textAML3.resource.textAML3.ITextAML3DelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
