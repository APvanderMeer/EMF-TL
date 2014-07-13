/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package constraints.provider;


import constraints.ConstraintsFactory;
import constraints.ConstraintsPackage;
import constraints.Operator;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link constraints.Operator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatorItemProvider
	extends ItemProviderAdapter
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
	public OperatorItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Operator_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Operator_name_feature", "_UI_Operator_type"),
				 ConstraintsPackage.Literals.OPERATOR__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(ConstraintsPackage.Literals.OPERATOR__LHS);
			childrenFeatures.add(ConstraintsPackage.Literals.OPERATOR__RHS);
			childrenFeatures.add(ConstraintsPackage.Literals.OPERATOR__CONSTRAINTS);
			childrenFeatures.add(ConstraintsPackage.Literals.OPERATOR__VARIABLES);
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
	 * This returns Operator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Operator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Operator)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Operator_type") :
			getString("_UI_Operator_type") + " " + label;
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

		switch (notification.getFeatureID(Operator.class)) {
			case ConstraintsPackage.OPERATOR__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ConstraintsPackage.OPERATOR__LHS:
			case ConstraintsPackage.OPERATOR__RHS:
			case ConstraintsPackage.OPERATOR__CONSTRAINTS:
			case ConstraintsPackage.OPERATOR__VARIABLES:
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
				(ConstraintsPackage.Literals.OPERATOR__LHS,
				 ConstraintsFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__LHS,
				 ConstraintsFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__LHS,
				 ConstraintsFactory.eINSTANCE.createListNode()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__LHS,
				 ConstraintsFactory.eINSTANCE.createObjectNode()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__LHS,
				 ConstraintsFactory.eINSTANCE.createSelectNode()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__LHS,
				 ConstraintsFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__LHS,
				 ConstraintsFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__LHS,
				 ConstraintsFactory.eINSTANCE.createBinaryNode()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__LHS,
				 ConstraintsFactory.eINSTANCE.createIndirectReference()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__LHS,
				 ConstraintsFactory.eINSTANCE.createUnaryNode()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__RHS,
				 ConstraintsFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__RHS,
				 ConstraintsFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__RHS,
				 ConstraintsFactory.eINSTANCE.createListNode()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__RHS,
				 ConstraintsFactory.eINSTANCE.createObjectNode()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__RHS,
				 ConstraintsFactory.eINSTANCE.createSelectNode()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__RHS,
				 ConstraintsFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__RHS,
				 ConstraintsFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__RHS,
				 ConstraintsFactory.eINSTANCE.createBinaryNode()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__RHS,
				 ConstraintsFactory.eINSTANCE.createIndirectReference()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__RHS,
				 ConstraintsFactory.eINSTANCE.createUnaryNode()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__CONSTRAINTS,
				 ConstraintsFactory.eINSTANCE.createEquationConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__CONSTRAINTS,
				 ConstraintsFactory.eINSTANCE.createFoldConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ConstraintsPackage.Literals.OPERATOR__VARIABLES,
				 ConstraintsFactory.eINSTANCE.createVariable()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ConstraintsPackage.Literals.OPERATOR__LHS ||
			childFeature == ConstraintsPackage.Literals.OPERATOR__RHS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ConstraintsEditPlugin.INSTANCE;
	}

}
