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

import textualmcrl2.Implication;
import textualmcrl2.Textualmcrl2Factory;
import textualmcrl2.Textualmcrl2Package;

/**
 * This is the item provider adapter for a {@link textualmcrl2.Implication} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImplicationItemProvider
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
	public ImplicationItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Textualmcrl2Package.Literals.IMPLICATION__CONDITION);
			childrenFeatures.add(Textualmcrl2Package.Literals.IMPLICATION__ACTION);
			childrenFeatures.add(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION);
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
	 * This returns Implication.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Implication"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Implication_type");
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

		switch (notification.getFeatureID(Implication.class)) {
			case Textualmcrl2Package.IMPLICATION__CONDITION:
			case Textualmcrl2Package.IMPLICATION__ACTION:
			case Textualmcrl2Package.IMPLICATION__ELSE_ACTION:
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
				(Textualmcrl2Package.Literals.IMPLICATION__CONDITION,
				 Textualmcrl2Factory.eINSTANCE.createIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__CONDITION,
				 Textualmcrl2Factory.eINSTANCE.createNumber()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__CONDITION,
				 Textualmcrl2Factory.eINSTANCE.createBooleanLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__CONDITION,
				 Textualmcrl2Factory.eINSTANCE.createSetEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__CONDITION,
				 Textualmcrl2Factory.eINSTANCE.createListEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__CONDITION,
				 Textualmcrl2Factory.eINSTANCE.createBagEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__CONDITION,
				 Textualmcrl2Factory.eINSTANCE.createFunctionApplication()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__CONDITION,
				 Textualmcrl2Factory.eINSTANCE.createMapAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__CONDITION,
				 Textualmcrl2Factory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__CONDITION,
				 Textualmcrl2Factory.eINSTANCE.createQuantification()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__CONDITION,
				 Textualmcrl2Factory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__CONDITION,
				 Textualmcrl2Factory.eINSTANCE.createLambda()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__CONDITION,
				 Textualmcrl2Factory.eINSTANCE.createWhereClause()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ACTION,
				 Textualmcrl2Factory.eINSTANCE.createAtomicAction()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ACTION,
				 Textualmcrl2Factory.eINSTANCE.createDeadlock()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ACTION,
				 Textualmcrl2Factory.eINSTANCE.createTau()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ACTION,
				 Textualmcrl2Factory.eINSTANCE.createSummation()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ACTION,
				 Textualmcrl2Factory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ACTION,
				 Textualmcrl2Factory.eINSTANCE.createAllow()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ACTION,
				 Textualmcrl2Factory.eINSTANCE.createHide()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ACTION,
				 Textualmcrl2Factory.eINSTANCE.createRename()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ACTION,
				 Textualmcrl2Factory.eINSTANCE.createCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ACTION,
				 Textualmcrl2Factory.eINSTANCE.createSynchronization()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ACTION,
				 Textualmcrl2Factory.eINSTANCE.createTimedAction()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ACTION,
				 Textualmcrl2Factory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ACTION,
				 Textualmcrl2Factory.eINSTANCE.createImplication()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ACTION,
				 Textualmcrl2Factory.eINSTANCE.createBoundedInitialisation()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ACTION,
				 Textualmcrl2Factory.eINSTANCE.createParallelism()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ACTION,
				 Textualmcrl2Factory.eINSTANCE.createLeftMerge()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ACTION,
				 Textualmcrl2Factory.eINSTANCE.createChoice()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION,
				 Textualmcrl2Factory.eINSTANCE.createAtomicAction()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION,
				 Textualmcrl2Factory.eINSTANCE.createDeadlock()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION,
				 Textualmcrl2Factory.eINSTANCE.createTau()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION,
				 Textualmcrl2Factory.eINSTANCE.createSummation()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION,
				 Textualmcrl2Factory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION,
				 Textualmcrl2Factory.eINSTANCE.createAllow()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION,
				 Textualmcrl2Factory.eINSTANCE.createHide()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION,
				 Textualmcrl2Factory.eINSTANCE.createRename()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION,
				 Textualmcrl2Factory.eINSTANCE.createCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION,
				 Textualmcrl2Factory.eINSTANCE.createSynchronization()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION,
				 Textualmcrl2Factory.eINSTANCE.createTimedAction()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION,
				 Textualmcrl2Factory.eINSTANCE.createSequence()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION,
				 Textualmcrl2Factory.eINSTANCE.createImplication()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION,
				 Textualmcrl2Factory.eINSTANCE.createBoundedInitialisation()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION,
				 Textualmcrl2Factory.eINSTANCE.createParallelism()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION,
				 Textualmcrl2Factory.eINSTANCE.createLeftMerge()));

		newChildDescriptors.add
			(createChildParameter
				(Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION,
				 Textualmcrl2Factory.eINSTANCE.createChoice()));
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
			childFeature == Textualmcrl2Package.Literals.IMPLICATION__ACTION ||
			childFeature == Textualmcrl2Package.Literals.IMPLICATION__ELSE_ACTION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
