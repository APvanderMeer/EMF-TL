/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.grammar;

public class TextAML3Containment extends org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Terminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public TextAML3Containment(org.eclipse.emf.ecore.EStructuralFeature feature, org.emftext.language.textAML3.resource.textAML3.grammar.TextAML3Cardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = org.emftext.language.textAML3.resource.textAML3.util.TextAML3StringUtil.explode(allowedTypes, ", ", new org.emftext.language.textAML3.resource.textAML3.ITextAML3Function1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
