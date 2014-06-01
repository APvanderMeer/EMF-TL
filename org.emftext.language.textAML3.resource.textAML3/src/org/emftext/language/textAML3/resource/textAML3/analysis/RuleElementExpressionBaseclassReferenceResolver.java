/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.analysis;

import org.eclipse.emf.ecore.EcorePackage;
import org.emftext.language.textAML3.resource.textAML3.analysis.helper.EMFTypesResolver;

public class RuleElementExpressionBaseclassReferenceResolver implements org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<org.emftext.language.textAML3.RuleElementExpression, org.eclipse.emf.ecore.EClass> {
		
	public void resolve(String identifier, org.emftext.language.textAML3.RuleElementExpression container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolveResult<org.eclipse.emf.ecore.EClass> result) {
		new EMFTypesResolver().doResolve(identifier, container, reference, EcorePackage.eINSTANCE.getEClass(), resolveFuzzy, result);
	}
	
	public String deResolve(org.eclipse.emf.ecore.EClass element, org.emftext.language.textAML3.RuleElementExpression container, org.eclipse.emf.ecore.EReference reference) {
		return new EMFTypesResolver().doDeResolve(element, container);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
