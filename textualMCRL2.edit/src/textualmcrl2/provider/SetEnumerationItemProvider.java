/**
 */
package textualmcrl2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import textualmcrl2.SetEnumeration;
import textualmcrl2.Textualmcrl2Factory;
import textualmcrl2.Textualmcrl2Package;

/**
 * This is the item provider adapter for a {@link textualmcrl2.SetEnumeration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SetEnumerationItemProvider
	extends CollectionItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetEnumerationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Textualmcrl2Package.Literals.SET_ENUMERATION__ELEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SetEnumeration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SetEnumeration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_SetEnumeration_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SetEnumeration.class)) {
			case Textualmcrl2Package.SET_ENUMERATION__ELEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.SET_ENUMERATION__ELEMENTS,
				 Textualmcrl2Factory.eINSTANCE.createIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.SET_ENUMERATION__ELEMENTS,
				 Textualmcrl2Factory.eINSTANCE.createNumber()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.SET_ENUMERATION__ELEMENTS,
				 Textualmcrl2Factory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.SET_ENUMERATION__ELEMENTS,
				 Textualmcrl2Factory.eINSTANCE.createSetEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.SET_ENUMERATION__ELEMENTS,
				 Textualmcrl2Factory.eINSTANCE.createListEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.SET_ENUMERATION__ELEMENTS,
				 Textualmcrl2Factory.eINSTANCE.createBagEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.SET_ENUMERATION__ELEMENTS,
				 Textualmcrl2Factory.eINSTANCE.createFunctionApplication()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.SET_ENUMERATION__ELEMENTS,
				 Textualmcrl2Factory.eINSTANCE.createMapAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.SET_ENUMERATION__ELEMENTS,
				 Textualmcrl2Factory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.SET_ENUMERATION__ELEMENTS,
				 Textualmcrl2Factory.eINSTANCE.createQuantification()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.SET_ENUMERATION__ELEMENTS,
				 Textualmcrl2Factory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.SET_ENUMERATION__ELEMENTS,
				 Textualmcrl2Factory.eINSTANCE.createLambda()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.SET_ENUMERATION__ELEMENTS,
				 Textualmcrl2Factory.eINSTANCE.createWhereClause()));
	}

}
