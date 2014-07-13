/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class TextAML3ContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements org.emftext.language.textAML3.resource.textAML3.ITextAML3ContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public TextAML3ContextDependentURIFragmentFactory(org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public org.emftext.language.textAML3.resource.textAML3.ITextAML3ContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new org.emftext.language.textAML3.resource.textAML3.mopp.TextAML3ContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public org.emftext.language.textAML3.resource.textAML3.ITextAML3ReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
