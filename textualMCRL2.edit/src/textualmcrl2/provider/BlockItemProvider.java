/**
 */
package textualmcrl2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import textualmcrl2.Block;
import textualmcrl2.Textualmcrl2Factory;
import textualmcrl2.Textualmcrl2Package;

/**
 * This is the item provider adapter for a {@link textualmcrl2.Block} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockItemProvider
	extends ProcessExprItemProvider
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
	public BlockItemProvider(AdapterFactory adapterFactory) {
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

			addAtomnamesPropertyDescriptor(object);
			addLinksPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Atomnames feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAtomnamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Block_atomnames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Block_atomnames_feature", "_UI_Block_type"),
				 Textualmcrl2Package.Literals.BLOCK__ATOMNAMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Links feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Block_links_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Block_links_feature", "_UI_Block_type"),
				 Textualmcrl2Package.Literals.BLOCK__LINKS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(Textualmcrl2Package.Literals.BLOCK__CHILD);
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
	 * This returns Block.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Block"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Block_type");
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

		switch (notification.getFeatureID(Block.class)) {
			case Textualmcrl2Package.BLOCK__ATOMNAMES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Textualmcrl2Package.BLOCK__CHILD:
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
				(Textualmcrl2Package.Literals.BLOCK__CHILD,
				 Textualmcrl2Factory.eINSTANCE.createAtomicAction()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.BLOCK__CHILD,
				 Textualmcrl2Factory.eINSTANCE.createDeadlock()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.BLOCK__CHILD,
				 Textualmcrl2Factory.eINSTANCE.createTau()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.BLOCK__CHILD,
				 Textualmcrl2Factory.eINSTANCE.createSummation()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.BLOCK__CHILD,
				 Textualmcrl2Factory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.BLOCK__CHILD,
				 Textualmcrl2Factory.eINSTANCE.createAllow()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.BLOCK__CHILD,
				 Textualmcrl2Factory.eINSTANCE.createHide()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.BLOCK__CHILD,
				 Textualmcrl2Factory.eINSTANCE.createRename()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.BLOCK__CHILD,
				 Textualmcrl2Factory.eINSTANCE.createCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.BLOCK__CHILD,
				 Textualmcrl2Factory.eINSTANCE.createSynchronization()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.BLOCK__CHILD,
				 Textualmcrl2Factory.eINSTANCE.createTimedAction()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.BLOCK__CHILD,
				 Textualmcrl2Factory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.BLOCK__CHILD,
				 Textualmcrl2Factory.eINSTANCE.createImplication()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.BLOCK__CHILD,
				 Textualmcrl2Factory.eINSTANCE.createBoundedInitialisation()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.BLOCK__CHILD,
				 Textualmcrl2Factory.eINSTANCE.createParallelism()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.BLOCK__CHILD,
				 Textualmcrl2Factory.eINSTANCE.createLeftMerge()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.BLOCK__CHILD,
				 Textualmcrl2Factory.eINSTANCE.createChoice()));
	}

}
