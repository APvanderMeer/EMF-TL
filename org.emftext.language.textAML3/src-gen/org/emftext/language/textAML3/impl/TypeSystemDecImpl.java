/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.textAML3.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.textAML3.ErrorRule;
import org.emftext.language.textAML3.PackageElement;
import org.emftext.language.textAML3.Relation;
import org.emftext.language.textAML3.TextAML3Package;
import org.emftext.language.textAML3.TypeDec;
import org.emftext.language.textAML3.TypeRelation;
import org.emftext.language.textAML3.TypeRule;
import org.emftext.language.textAML3.TypeSystemDec;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type System Dec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.textAML3.impl.TypeSystemDecImpl#getTypevalues <em>Typevalues</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.impl.TypeSystemDecImpl#getRulesystem <em>Rulesystem</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.impl.TypeSystemDecImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.impl.TypeSystemDecImpl#getWidening <em>Widening</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.impl.TypeSystemDecImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.impl.TypeSystemDecImpl#getBaseclass <em>Baseclass</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.impl.TypeSystemDecImpl#getStrategytarget <em>Strategytarget</em>}</li>
 *   <li>{@link org.emftext.language.textAML3.impl.TypeSystemDecImpl#getErrorrules <em>Errorrules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSystemDecImpl extends EObjectImpl implements TypeSystemDec {
	/**
	 * The cached value of the '{@link #getTypevalues() <em>Typevalues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypevalues()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDec> typevalues;

	/**
	 * The cached value of the '{@link #getRulesystem() <em>Rulesystem</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRulesystem()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRule> rulesystem;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> strategy;

	/**
	 * The cached value of the '{@link #getWidening() <em>Widening</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidening()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> widening;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageElement> packages;

	/**
	 * The cached value of the '{@link #getBaseclass() <em>Baseclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseclass()
	 * @generated
	 * @ordered
	 */
	protected EClass baseclass;

	/**
	 * The cached value of the '{@link #getStrategytarget() <em>Strategytarget</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategytarget()
	 * @generated
	 * @ordered
	 */
	protected EList<EStructuralFeature> strategytarget;

	/**
	 * The cached value of the '{@link #getErrorrules() <em>Errorrules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorrules()
	 * @generated
	 * @ordered
	 */
	protected EList<ErrorRule> errorrules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSystemDecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextAML3Package.Literals.TYPE_SYSTEM_DEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDec> getTypevalues() {
		if (typevalues == null) {
			typevalues = new EObjectContainmentEList<TypeDec>(TypeDec.class, this, TextAML3Package.TYPE_SYSTEM_DEC__TYPEVALUES);
		}
		return typevalues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRule> getRulesystem() {
		if (rulesystem == null) {
			rulesystem = new EObjectContainmentEList<TypeRule>(TypeRule.class, this, TextAML3Package.TYPE_SYSTEM_DEC__RULESYSTEM);
		}
		return rulesystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getStrategy() {
		if (strategy == null) {
			strategy = new EObjectContainmentEList<Relation>(Relation.class, this, TextAML3Package.TYPE_SYSTEM_DEC__STRATEGY);
		}
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getWidening() {
		if (widening == null) {
			widening = new EObjectContainmentEList<Relation>(Relation.class, this, TextAML3Package.TYPE_SYSTEM_DEC__WIDENING);
		}
		return widening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageElement> getPackages() {
		if (packages == null) {
			packages = new EObjectContainmentEList<PackageElement>(PackageElement.class, this, TextAML3Package.TYPE_SYSTEM_DEC__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseclass() {
		if (baseclass != null && baseclass.eIsProxy()) {
			InternalEObject oldBaseclass = (InternalEObject)baseclass;
			baseclass = (EClass)eResolveProxy(oldBaseclass);
			if (baseclass != oldBaseclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextAML3Package.TYPE_SYSTEM_DEC__BASECLASS, oldBaseclass, baseclass));
			}
		}
		return baseclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetBaseclass() {
		return baseclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseclass(EClass newBaseclass) {
		EClass oldBaseclass = baseclass;
		baseclass = newBaseclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextAML3Package.TYPE_SYSTEM_DEC__BASECLASS, oldBaseclass, baseclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStructuralFeature> getStrategytarget() {
		if (strategytarget == null) {
			strategytarget = new EObjectResolvingEList<EStructuralFeature>(EStructuralFeature.class, this, TextAML3Package.TYPE_SYSTEM_DEC__STRATEGYTARGET);
		}
		return strategytarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ErrorRule> getErrorrules() {
		if (errorrules == null) {
			errorrules = new EObjectContainmentEList<ErrorRule>(ErrorRule.class, this, TextAML3Package.TYPE_SYSTEM_DEC__ERRORRULES);
		}
		return errorrules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextAML3Package.TYPE_SYSTEM_DEC__TYPEVALUES:
				return ((InternalEList<?>)getTypevalues()).basicRemove(otherEnd, msgs);
			case TextAML3Package.TYPE_SYSTEM_DEC__RULESYSTEM:
				return ((InternalEList<?>)getRulesystem()).basicRemove(otherEnd, msgs);
			case TextAML3Package.TYPE_SYSTEM_DEC__STRATEGY:
				return ((InternalEList<?>)getStrategy()).basicRemove(otherEnd, msgs);
			case TextAML3Package.TYPE_SYSTEM_DEC__WIDENING:
				return ((InternalEList<?>)getWidening()).basicRemove(otherEnd, msgs);
			case TextAML3Package.TYPE_SYSTEM_DEC__PACKAGES:
				return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
			case TextAML3Package.TYPE_SYSTEM_DEC__ERRORRULES:
				return ((InternalEList<?>)getErrorrules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextAML3Package.TYPE_SYSTEM_DEC__TYPEVALUES:
				return getTypevalues();
			case TextAML3Package.TYPE_SYSTEM_DEC__RULESYSTEM:
				return getRulesystem();
			case TextAML3Package.TYPE_SYSTEM_DEC__STRATEGY:
				return getStrategy();
			case TextAML3Package.TYPE_SYSTEM_DEC__WIDENING:
				return getWidening();
			case TextAML3Package.TYPE_SYSTEM_DEC__PACKAGES:
				return getPackages();
			case TextAML3Package.TYPE_SYSTEM_DEC__BASECLASS:
				if (resolve) return getBaseclass();
				return basicGetBaseclass();
			case TextAML3Package.TYPE_SYSTEM_DEC__STRATEGYTARGET:
				return getStrategytarget();
			case TextAML3Package.TYPE_SYSTEM_DEC__ERRORRULES:
				return getErrorrules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TextAML3Package.TYPE_SYSTEM_DEC__TYPEVALUES:
				getTypevalues().clear();
				getTypevalues().addAll((Collection<? extends TypeDec>)newValue);
				return;
			case TextAML3Package.TYPE_SYSTEM_DEC__RULESYSTEM:
				getRulesystem().clear();
				getRulesystem().addAll((Collection<? extends TypeRule>)newValue);
				return;
			case TextAML3Package.TYPE_SYSTEM_DEC__STRATEGY:
				getStrategy().clear();
				getStrategy().addAll((Collection<? extends Relation>)newValue);
				return;
			case TextAML3Package.TYPE_SYSTEM_DEC__WIDENING:
				getWidening().clear();
				getWidening().addAll((Collection<? extends Relation>)newValue);
				return;
			case TextAML3Package.TYPE_SYSTEM_DEC__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends PackageElement>)newValue);
				return;
			case TextAML3Package.TYPE_SYSTEM_DEC__BASECLASS:
				setBaseclass((EClass)newValue);
				return;
			case TextAML3Package.TYPE_SYSTEM_DEC__STRATEGYTARGET:
				getStrategytarget().clear();
				getStrategytarget().addAll((Collection<? extends EStructuralFeature>)newValue);
				return;
			case TextAML3Package.TYPE_SYSTEM_DEC__ERRORRULES:
				getErrorrules().clear();
				getErrorrules().addAll((Collection<? extends ErrorRule>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TextAML3Package.TYPE_SYSTEM_DEC__TYPEVALUES:
				getTypevalues().clear();
				return;
			case TextAML3Package.TYPE_SYSTEM_DEC__RULESYSTEM:
				getRulesystem().clear();
				return;
			case TextAML3Package.TYPE_SYSTEM_DEC__STRATEGY:
				getStrategy().clear();
				return;
			case TextAML3Package.TYPE_SYSTEM_DEC__WIDENING:
				getWidening().clear();
				return;
			case TextAML3Package.TYPE_SYSTEM_DEC__PACKAGES:
				getPackages().clear();
				return;
			case TextAML3Package.TYPE_SYSTEM_DEC__BASECLASS:
				setBaseclass((EClass)null);
				return;
			case TextAML3Package.TYPE_SYSTEM_DEC__STRATEGYTARGET:
				getStrategytarget().clear();
				return;
			case TextAML3Package.TYPE_SYSTEM_DEC__ERRORRULES:
				getErrorrules().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TextAML3Package.TYPE_SYSTEM_DEC__TYPEVALUES:
				return typevalues != null && !typevalues.isEmpty();
			case TextAML3Package.TYPE_SYSTEM_DEC__RULESYSTEM:
				return rulesystem != null && !rulesystem.isEmpty();
			case TextAML3Package.TYPE_SYSTEM_DEC__STRATEGY:
				return strategy != null && !strategy.isEmpty();
			case TextAML3Package.TYPE_SYSTEM_DEC__WIDENING:
				return widening != null && !widening.isEmpty();
			case TextAML3Package.TYPE_SYSTEM_DEC__PACKAGES:
				return packages != null && !packages.isEmpty();
			case TextAML3Package.TYPE_SYSTEM_DEC__BASECLASS:
				return baseclass != null;
			case TextAML3Package.TYPE_SYSTEM_DEC__STRATEGYTARGET:
				return strategytarget != null && !strategytarget.isEmpty();
			case TextAML3Package.TYPE_SYSTEM_DEC__ERRORRULES:
				return errorrules != null && !errorrules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeSystemDecImpl
