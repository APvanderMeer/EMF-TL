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

import textualmcrl2.Atom;
import textualmcrl2.Textualmcrl2Factory;
import textualmcrl2.Textualmcrl2Package;

/**
 * This is the item provider adapter for a {@link textualmcrl2.Atom} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomItemProvider
	extends NameableItemProvider
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
	public AtomItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Textualmcrl2Package.Literals.ATOM__TYPE);
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
	 * This returns Atom.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Atom"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Atom)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Atom_type") :
			getString("_UI_Atom_type") + " " + label;
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

		switch (notification.getFeatureID(Atom.class)) {
			case Textualmcrl2Package.ATOM__TYPE:
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
				(Textualmcrl2Package.Literals.ATOM__TYPE,
				 Textualmcrl2Factory.eINSTANCE.createBool()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.ATOM__TYPE,
				 Textualmcrl2Factory.eINSTANCE.createPos()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.ATOM__TYPE,
				 Textualmcrl2Factory.eINSTANCE.createNat()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.ATOM__TYPE,
				 Textualmcrl2Factory.eINSTANCE.createInt()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.ATOM__TYPE,
				 Textualmcrl2Factory.eINSTANCE.createReal()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.ATOM__TYPE,
				 Textualmcrl2Factory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.ATOM__TYPE,
				 Textualmcrl2Factory.eINSTANCE.createSet()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.ATOM__TYPE,
				 Textualmcrl2Factory.eINSTANCE.createBag()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.ATOM__TYPE,
				 Textualmcrl2Factory.eINSTANCE.createSortRef()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.ATOM__TYPE,
				 Textualmcrl2Factory.eINSTANCE.createHigherOrder()));
	}

}
