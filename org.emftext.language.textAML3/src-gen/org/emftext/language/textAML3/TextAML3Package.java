/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.textAML3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftext.language.textAML3.TextAML3Factory
 * @model kind="package"
 * @generated
 */
public interface TextAML3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "textAML3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.emftext.org/language/textAML3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "textAML3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TextAML3Package eINSTANCE = org.emftext.language.textAML3.impl.TextAML3PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.TypeSystemDecImpl <em>Type System Dec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.TypeSystemDecImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeSystemDec()
	 * @generated
	 */
	int TYPE_SYSTEM_DEC = 0;

	/**
	 * The feature id for the '<em><b>Typevalues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM_DEC__TYPEVALUES = 0;

	/**
	 * The feature id for the '<em><b>Rulesystem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM_DEC__RULESYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM_DEC__STRATEGY = 2;

	/**
	 * The feature id for the '<em><b>Widening</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM_DEC__WIDENING = 3;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM_DEC__PACKAGES = 4;

	/**
	 * The feature id for the '<em><b>Baseclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM_DEC__BASECLASS = 5;

	/**
	 * The feature id for the '<em><b>Strategytarget</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM_DEC__STRATEGYTARGET = 6;

	/**
	 * The feature id for the '<em><b>Errorrules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM_DEC__ERRORRULES = 7;

	/**
	 * The number of structural features of the '<em>Type System Dec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_SYSTEM_DEC_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.TypeDecImpl <em>Type Dec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.TypeDecImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeDec()
	 * @generated
	 */
	int TYPE_DEC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEC__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEC__REPRESENTATION = 2;

	/**
	 * The number of structural features of the '<em>Type Dec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.PackageElementImpl <em>Package Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.PackageElementImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getPackageElement()
	 * @generated
	 */
	int PACKAGE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Targetpackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT__TARGETPACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Package Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.ModelElementImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Targetclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TARGETCLASS = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__RELATION = 2;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.RelationImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 4;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OPERATOR = 1;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.TypeRelationImpl <em>Type Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.TypeRelationImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeRelation()
	 * @generated
	 */
	int TYPE_RELATION = 5;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATION__CONDITIONS = RELATION__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATION__OPERATOR = RELATION__OPERATOR;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATION__LHS = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATION__RHS = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.ModelElementRelationImpl <em>Model Element Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.ModelElementRelationImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getModelElementRelation()
	 * @generated
	 */
	int MODEL_ELEMENT_RELATION = 6;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_RELATION__CONDITIONS = RELATION__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_RELATION__OPERATOR = RELATION__OPERATOR;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_RELATION__LHS = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_RELATION__RHS = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Element Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.TypeRelationReferenceImpl <em>Type Relation Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.TypeRelationReferenceImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeRelationReference()
	 * @generated
	 */
	int TYPE_RELATION_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATION_REFERENCE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATION_REFERENCE__ARGUMENTS = 1;

	/**
	 * The number of structural features of the '<em>Type Relation Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATION_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.TypeRelationReferenceElementImpl <em>Type Relation Reference Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.TypeRelationReferenceElementImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeRelationReferenceElement()
	 * @generated
	 */
	int TYPE_RELATION_REFERENCE_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Typeattribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATION_REFERENCE_ELEMENT__TYPEATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATION_REFERENCE_ELEMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Type Relation Reference Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATION_REFERENCE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.TypeAttributeImpl <em>Type Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.TypeAttributeImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeAttribute()
	 * @generated
	 */
	int TYPE_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ATTRIBUTE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Type Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.TypeRuleImpl <em>Type Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.TypeRuleImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeRule()
	 * @generated
	 */
	int TYPE_RULE = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RULE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RULE__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RULE__VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RULE__CONDITIONS = 3;

	/**
	 * The feature id for the '<em><b>Containments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RULE__CONTAINMENTS = 4;

	/**
	 * The number of structural features of the '<em>Type Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RULE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.RuleElementExpressionImpl <em>Rule Element Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.RuleElementExpressionImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getRuleElementExpression()
	 * @generated
	 */
	int RULE_ELEMENT_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Baseclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT_EXPRESSION__BASECLASS = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT_EXPRESSION__ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Rule Element Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.RuleElementAttributeImpl <em>Rule Element Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.RuleElementAttributeImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getRuleElementAttribute()
	 * @generated
	 */
	int RULE_ELEMENT_ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Myattribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT_ATTRIBUTE__MYATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT_ATTRIBUTE__VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Rule Element Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ELEMENT_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.VariableImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 13;

	/**
	 * The feature id for the '<em><b>Varname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VARNAME = 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.ConditionImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 14;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.ComparisonConditionImpl <em>Comparison Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.ComparisonConditionImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getComparisonCondition()
	 * @generated
	 */
	int COMPARISON_CONDITION = 15;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITION__LEFT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITION__RIGHT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITION__OPERATOR = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comparison Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.FoldConditionImpl <em>Fold Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.FoldConditionImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getFoldCondition()
	 * @generated
	 */
	int FOLD_CONDITION = 16;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLD_CONDITION__GENERATOR = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLD_CONDITION__CONDITION = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fold Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLD_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.GeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.GeneratorImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getGenerator()
	 * @generated
	 */
	int GENERATOR = 17;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.ExpressionImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 18;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.VariableReferenceImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getVariableReference()
	 * @generated
	 */
	int VARIABLE_REFERENCE = 19;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE__TARGET = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.NumberImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.SetExpressionImpl <em>Set Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.SetExpressionImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getSetExpression()
	 * @generated
	 */
	int SET_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION__VALUES = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.BinaryExpressionImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.UnaryExpressionImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.TypeReferenceImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 24;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__TARGET = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.TypeReferenceElementImpl <em>Type Reference Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.TypeReferenceElementImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeReferenceElement()
	 * @generated
	 */
	int TYPE_REFERENCE_ELEMENT = 25;

	/**
	 * The feature id for the '<em><b>Typeattribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_ELEMENT__TYPEATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_ELEMENT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Type Reference Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.AttributeReferenceImpl <em>Attribute Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.AttributeReferenceImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getAttributeReference()
	 * @generated
	 */
	int ATTRIBUTE_REFERENCE = 26;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE__TARGET = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.FunctionReferenceImpl <em>Function Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.FunctionReferenceImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getFunctionReference()
	 * @generated
	 */
	int FUNCTION_REFERENCE = 27;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REFERENCE__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.ModelElementExpressionImpl <em>Model Element Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.ModelElementExpressionImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getModelElementExpression()
	 * @generated
	 */
	int MODEL_ELEMENT_EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Baseclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_EXPRESSION__BASECLASS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_EXPRESSION__ATTRIBUTES = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Element Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.NestedExpressionImpl <em>Nested Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.NestedExpressionImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getNestedExpression()
	 * @generated
	 */
	int NESTED_EXPRESSION = 29;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nested Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.AttributeExpressionImpl <em>Attribute Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.AttributeExpressionImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getAttributeExpression()
	 * @generated
	 */
	int ATTRIBUTE_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Myattribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_EXPRESSION__MYATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_EXPRESSION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Attribute Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.StringLiteralImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.NullLiteralImpl <em>Null Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.NullLiteralImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getNullLiteral()
	 * @generated
	 */
	int NULL_LITERAL = 32;

	/**
	 * The number of structural features of the '<em>Null Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.ErrorRuleImpl <em>Error Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.ErrorRuleImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getErrorRule()
	 * @generated
	 */
	int ERROR_RULE = 33;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RULE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RULE__VARIABLES = 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RULE__CONDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RULE__MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RULE__POSITION = 4;

	/**
	 * The number of structural features of the '<em>Error Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RULE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.impl.ContainmentVariableImpl <em>Containment Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.impl.ContainmentVariableImpl
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getContainmentVariable()
	 * @generated
	 */
	int CONTAINMENT_VARIABLE = 34;

	/**
	 * The feature id for the '<em><b>Varname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_VARIABLE__VARNAME = VARIABLE__VARNAME;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_VARIABLE__CONTAINER = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Containment Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.ComparisonOperator
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 35;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.BinaryOperator
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 36;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.UnaryOperator <em>Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.UnaryOperator
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 37;

	/**
	 * The meta object id for the '{@link org.emftext.language.textAML3.ModelElementConnection <em>Model Element Connection</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.emftext.language.textAML3.ModelElementConnection
	 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getModelElementConnection()
	 * @generated
	 */
	int MODEL_ELEMENT_CONNECTION = 38;


	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.TypeSystemDec <em>Type System Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type System Dec</em>'.
	 * @see org.emftext.language.textAML3.TypeSystemDec
	 * @generated
	 */
	EClass getTypeSystemDec();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.TypeSystemDec#getTypevalues <em>Typevalues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Typevalues</em>'.
	 * @see org.emftext.language.textAML3.TypeSystemDec#getTypevalues()
	 * @see #getTypeSystemDec()
	 * @generated
	 */
	EReference getTypeSystemDec_Typevalues();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.TypeSystemDec#getRulesystem <em>Rulesystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rulesystem</em>'.
	 * @see org.emftext.language.textAML3.TypeSystemDec#getRulesystem()
	 * @see #getTypeSystemDec()
	 * @generated
	 */
	EReference getTypeSystemDec_Rulesystem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.TypeSystemDec#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategy</em>'.
	 * @see org.emftext.language.textAML3.TypeSystemDec#getStrategy()
	 * @see #getTypeSystemDec()
	 * @generated
	 */
	EReference getTypeSystemDec_Strategy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.TypeSystemDec#getWidening <em>Widening</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widening</em>'.
	 * @see org.emftext.language.textAML3.TypeSystemDec#getWidening()
	 * @see #getTypeSystemDec()
	 * @generated
	 */
	EReference getTypeSystemDec_Widening();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.TypeSystemDec#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see org.emftext.language.textAML3.TypeSystemDec#getPackages()
	 * @see #getTypeSystemDec()
	 * @generated
	 */
	EReference getTypeSystemDec_Packages();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.textAML3.TypeSystemDec#getBaseclass <em>Baseclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Baseclass</em>'.
	 * @see org.emftext.language.textAML3.TypeSystemDec#getBaseclass()
	 * @see #getTypeSystemDec()
	 * @generated
	 */
	EReference getTypeSystemDec_Baseclass();

	/**
	 * Returns the meta object for the reference list '{@link org.emftext.language.textAML3.TypeSystemDec#getStrategytarget <em>Strategytarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Strategytarget</em>'.
	 * @see org.emftext.language.textAML3.TypeSystemDec#getStrategytarget()
	 * @see #getTypeSystemDec()
	 * @generated
	 */
	EReference getTypeSystemDec_Strategytarget();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.TypeSystemDec#getErrorrules <em>Errorrules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Errorrules</em>'.
	 * @see org.emftext.language.textAML3.TypeSystemDec#getErrorrules()
	 * @see #getTypeSystemDec()
	 * @generated
	 */
	EReference getTypeSystemDec_Errorrules();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.TypeDec <em>Type Dec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Dec</em>'.
	 * @see org.emftext.language.textAML3.TypeDec
	 * @generated
	 */
	EClass getTypeDec();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.textAML3.TypeDec#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftext.language.textAML3.TypeDec#getName()
	 * @see #getTypeDec()
	 * @generated
	 */
	EAttribute getTypeDec_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.TypeDec#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.emftext.language.textAML3.TypeDec#getAttributes()
	 * @see #getTypeDec()
	 * @generated
	 */
	EReference getTypeDec_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.TypeDec#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Representation</em>'.
	 * @see org.emftext.language.textAML3.TypeDec#getRepresentation()
	 * @see #getTypeDec()
	 * @generated
	 */
	EReference getTypeDec_Representation();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.PackageElement <em>Package Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Element</em>'.
	 * @see org.emftext.language.textAML3.PackageElement
	 * @generated
	 */
	EClass getPackageElement();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.textAML3.PackageElement#getTargetpackage <em>Targetpackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Targetpackage</em>'.
	 * @see org.emftext.language.textAML3.PackageElement#getTargetpackage()
	 * @see #getPackageElement()
	 * @generated
	 */
	EReference getPackageElement_Targetpackage();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.emftext.language.textAML3.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.textAML3.ModelElement#getTargetclass <em>Targetclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Targetclass</em>'.
	 * @see org.emftext.language.textAML3.ModelElement#getTargetclass()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Targetclass();

	/**
	 * Returns the meta object for the reference list '{@link org.emftext.language.textAML3.ModelElement#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see org.emftext.language.textAML3.ModelElement#getAttributes()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.textAML3.ModelElement#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation</em>'.
	 * @see org.emftext.language.textAML3.ModelElement#getRelation()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Relation();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see org.emftext.language.textAML3.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.Relation#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see org.emftext.language.textAML3.Relation#getConditions()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Conditions();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.textAML3.Relation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.emftext.language.textAML3.Relation#getOperator()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Operator();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.TypeRelation <em>Type Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Relation</em>'.
	 * @see org.emftext.language.textAML3.TypeRelation
	 * @generated
	 */
	EClass getTypeRelation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.TypeRelation#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.emftext.language.textAML3.TypeRelation#getLhs()
	 * @see #getTypeRelation()
	 * @generated
	 */
	EReference getTypeRelation_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.TypeRelation#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.emftext.language.textAML3.TypeRelation#getRhs()
	 * @see #getTypeRelation()
	 * @generated
	 */
	EReference getTypeRelation_Rhs();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.ModelElementRelation <em>Model Element Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Relation</em>'.
	 * @see org.emftext.language.textAML3.ModelElementRelation
	 * @generated
	 */
	EClass getModelElementRelation();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.ModelElementRelation#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.emftext.language.textAML3.ModelElementRelation#getLhs()
	 * @see #getModelElementRelation()
	 * @generated
	 */
	EReference getModelElementRelation_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.ModelElementRelation#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.emftext.language.textAML3.ModelElementRelation#getRhs()
	 * @see #getModelElementRelation()
	 * @generated
	 */
	EReference getModelElementRelation_Rhs();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.TypeRelationReference <em>Type Relation Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Relation Reference</em>'.
	 * @see org.emftext.language.textAML3.TypeRelationReference
	 * @generated
	 */
	EClass getTypeRelationReference();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.textAML3.TypeRelationReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.emftext.language.textAML3.TypeRelationReference#getTarget()
	 * @see #getTypeRelationReference()
	 * @generated
	 */
	EReference getTypeRelationReference_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.TypeRelationReference#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.emftext.language.textAML3.TypeRelationReference#getArguments()
	 * @see #getTypeRelationReference()
	 * @generated
	 */
	EReference getTypeRelationReference_Arguments();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.TypeRelationReferenceElement <em>Type Relation Reference Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Relation Reference Element</em>'.
	 * @see org.emftext.language.textAML3.TypeRelationReferenceElement
	 * @generated
	 */
	EClass getTypeRelationReferenceElement();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.textAML3.TypeRelationReferenceElement#getTypeattribute <em>Typeattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Typeattribute</em>'.
	 * @see org.emftext.language.textAML3.TypeRelationReferenceElement#getTypeattribute()
	 * @see #getTypeRelationReferenceElement()
	 * @generated
	 */
	EReference getTypeRelationReferenceElement_Typeattribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.TypeRelationReferenceElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.emftext.language.textAML3.TypeRelationReferenceElement#getValue()
	 * @see #getTypeRelationReferenceElement()
	 * @generated
	 */
	EReference getTypeRelationReferenceElement_Value();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.TypeAttribute <em>Type Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Attribute</em>'.
	 * @see org.emftext.language.textAML3.TypeAttribute
	 * @generated
	 */
	EClass getTypeAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.textAML3.TypeAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.emftext.language.textAML3.TypeAttribute#getName()
	 * @see #getTypeAttribute()
	 * @generated
	 */
	EAttribute getTypeAttribute_Name();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.TypeRule <em>Type Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Rule</em>'.
	 * @see org.emftext.language.textAML3.TypeRule
	 * @generated
	 */
	EClass getTypeRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.TypeRule#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.emftext.language.textAML3.TypeRule#getSource()
	 * @see #getTypeRule()
	 * @generated
	 */
	EReference getTypeRule_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.TypeRule#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.emftext.language.textAML3.TypeRule#getTarget()
	 * @see #getTypeRule()
	 * @generated
	 */
	EReference getTypeRule_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.TypeRule#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.emftext.language.textAML3.TypeRule#getVariables()
	 * @see #getTypeRule()
	 * @generated
	 */
	EReference getTypeRule_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.TypeRule#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see org.emftext.language.textAML3.TypeRule#getConditions()
	 * @see #getTypeRule()
	 * @generated
	 */
	EReference getTypeRule_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.TypeRule#getContainments <em>Containments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containments</em>'.
	 * @see org.emftext.language.textAML3.TypeRule#getContainments()
	 * @see #getTypeRule()
	 * @generated
	 */
	EReference getTypeRule_Containments();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.RuleElementExpression <em>Rule Element Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Element Expression</em>'.
	 * @see org.emftext.language.textAML3.RuleElementExpression
	 * @generated
	 */
	EClass getRuleElementExpression();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.textAML3.RuleElementExpression#getBaseclass <em>Baseclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Baseclass</em>'.
	 * @see org.emftext.language.textAML3.RuleElementExpression#getBaseclass()
	 * @see #getRuleElementExpression()
	 * @generated
	 */
	EReference getRuleElementExpression_Baseclass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.RuleElementExpression#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.emftext.language.textAML3.RuleElementExpression#getAttributes()
	 * @see #getRuleElementExpression()
	 * @generated
	 */
	EReference getRuleElementExpression_Attributes();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.RuleElementAttribute <em>Rule Element Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Element Attribute</em>'.
	 * @see org.emftext.language.textAML3.RuleElementAttribute
	 * @generated
	 */
	EClass getRuleElementAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.textAML3.RuleElementAttribute#getMyattribute <em>Myattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Myattribute</em>'.
	 * @see org.emftext.language.textAML3.RuleElementAttribute#getMyattribute()
	 * @see #getRuleElementAttribute()
	 * @generated
	 */
	EReference getRuleElementAttribute_Myattribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.RuleElementAttribute#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see org.emftext.language.textAML3.RuleElementAttribute#getVariable()
	 * @see #getRuleElementAttribute()
	 * @generated
	 */
	EReference getRuleElementAttribute_Variable();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.emftext.language.textAML3.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.textAML3.Variable#getVarname <em>Varname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varname</em>'.
	 * @see org.emftext.language.textAML3.Variable#getVarname()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Varname();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.emftext.language.textAML3.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.ComparisonCondition <em>Comparison Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Condition</em>'.
	 * @see org.emftext.language.textAML3.ComparisonCondition
	 * @generated
	 */
	EClass getComparisonCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.ComparisonCondition#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.emftext.language.textAML3.ComparisonCondition#getLeft()
	 * @see #getComparisonCondition()
	 * @generated
	 */
	EReference getComparisonCondition_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.ComparisonCondition#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.emftext.language.textAML3.ComparisonCondition#getRight()
	 * @see #getComparisonCondition()
	 * @generated
	 */
	EReference getComparisonCondition_Right();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.textAML3.ComparisonCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.emftext.language.textAML3.ComparisonCondition#getOperator()
	 * @see #getComparisonCondition()
	 * @generated
	 */
	EAttribute getComparisonCondition_Operator();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.FoldCondition <em>Fold Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fold Condition</em>'.
	 * @see org.emftext.language.textAML3.FoldCondition
	 * @generated
	 */
	EClass getFoldCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.FoldCondition#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generator</em>'.
	 * @see org.emftext.language.textAML3.FoldCondition#getGenerator()
	 * @see #getFoldCondition()
	 * @generated
	 */
	EReference getFoldCondition_Generator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.FoldCondition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see org.emftext.language.textAML3.FoldCondition#getCondition()
	 * @see #getFoldCondition()
	 * @generated
	 */
	EReference getFoldCondition_Condition();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see org.emftext.language.textAML3.Generator
	 * @generated
	 */
	EClass getGenerator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.Generator#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see org.emftext.language.textAML3.Generator#getVariable()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.Generator#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see org.emftext.language.textAML3.Generator#getContainer()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_Container();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.emftext.language.textAML3.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.VariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Reference</em>'.
	 * @see org.emftext.language.textAML3.VariableReference
	 * @generated
	 */
	EClass getVariableReference();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.textAML3.VariableReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.emftext.language.textAML3.VariableReference#getTarget()
	 * @see #getVariableReference()
	 * @generated
	 */
	EReference getVariableReference_Target();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see org.emftext.language.textAML3.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.textAML3.Number#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.textAML3.Number#getValue()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_Value();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.SetExpression <em>Set Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Expression</em>'.
	 * @see org.emftext.language.textAML3.SetExpression
	 * @generated
	 */
	EClass getSetExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.SetExpression#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.emftext.language.textAML3.SetExpression#getValues()
	 * @see #getSetExpression()
	 * @generated
	 */
	EReference getSetExpression_Values();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see org.emftext.language.textAML3.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.emftext.language.textAML3.BinaryExpression#getLeft()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.emftext.language.textAML3.BinaryExpression#getRight()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.textAML3.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.emftext.language.textAML3.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see org.emftext.language.textAML3.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.UnaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.emftext.language.textAML3.UnaryExpression#getLeft()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Left();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.textAML3.UnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.emftext.language.textAML3.UnaryExpression#getOperator()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference</em>'.
	 * @see org.emftext.language.textAML3.TypeReference
	 * @generated
	 */
	EClass getTypeReference();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.textAML3.TypeReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.emftext.language.textAML3.TypeReference#getTarget()
	 * @see #getTypeReference()
	 * @generated
	 */
	EReference getTypeReference_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.TypeReference#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see org.emftext.language.textAML3.TypeReference#getArguments()
	 * @see #getTypeReference()
	 * @generated
	 */
	EReference getTypeReference_Arguments();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.TypeReferenceElement <em>Type Reference Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference Element</em>'.
	 * @see org.emftext.language.textAML3.TypeReferenceElement
	 * @generated
	 */
	EClass getTypeReferenceElement();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.textAML3.TypeReferenceElement#getTypeattribute <em>Typeattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Typeattribute</em>'.
	 * @see org.emftext.language.textAML3.TypeReferenceElement#getTypeattribute()
	 * @see #getTypeReferenceElement()
	 * @generated
	 */
	EReference getTypeReferenceElement_Typeattribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.TypeReferenceElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.emftext.language.textAML3.TypeReferenceElement#getValue()
	 * @see #getTypeReferenceElement()
	 * @generated
	 */
	EReference getTypeReferenceElement_Value();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.AttributeReference <em>Attribute Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Reference</em>'.
	 * @see org.emftext.language.textAML3.AttributeReference
	 * @generated
	 */
	EClass getAttributeReference();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.textAML3.AttributeReference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.emftext.language.textAML3.AttributeReference#getTarget()
	 * @see #getAttributeReference()
	 * @generated
	 */
	EReference getAttributeReference_Target();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.FunctionReference <em>Function Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Reference</em>'.
	 * @see org.emftext.language.textAML3.FunctionReference
	 * @generated
	 */
	EClass getFunctionReference();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.textAML3.FunctionReference#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.emftext.language.textAML3.FunctionReference#getFunction()
	 * @see #getFunctionReference()
	 * @generated
	 */
	EAttribute getFunctionReference_Function();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.ModelElementExpression <em>Model Element Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element Expression</em>'.
	 * @see org.emftext.language.textAML3.ModelElementExpression
	 * @generated
	 */
	EClass getModelElementExpression();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.textAML3.ModelElementExpression#getBaseclass <em>Baseclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Baseclass</em>'.
	 * @see org.emftext.language.textAML3.ModelElementExpression#getBaseclass()
	 * @see #getModelElementExpression()
	 * @generated
	 */
	EReference getModelElementExpression_Baseclass();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.ModelElementExpression#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.emftext.language.textAML3.ModelElementExpression#getAttributes()
	 * @see #getModelElementExpression()
	 * @generated
	 */
	EReference getModelElementExpression_Attributes();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.NestedExpression <em>Nested Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Expression</em>'.
	 * @see org.emftext.language.textAML3.NestedExpression
	 * @generated
	 */
	EClass getNestedExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.NestedExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.emftext.language.textAML3.NestedExpression#getExpression()
	 * @see #getNestedExpression()
	 * @generated
	 */
	EReference getNestedExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.AttributeExpression <em>Attribute Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Expression</em>'.
	 * @see org.emftext.language.textAML3.AttributeExpression
	 * @generated
	 */
	EClass getAttributeExpression();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.textAML3.AttributeExpression#getMyattribute <em>Myattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Myattribute</em>'.
	 * @see org.emftext.language.textAML3.AttributeExpression#getMyattribute()
	 * @see #getAttributeExpression()
	 * @generated
	 */
	EReference getAttributeExpression_Myattribute();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.AttributeExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.emftext.language.textAML3.AttributeExpression#getValue()
	 * @see #getAttributeExpression()
	 * @generated
	 */
	EReference getAttributeExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see org.emftext.language.textAML3.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.textAML3.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.emftext.language.textAML3.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.NullLiteral <em>Null Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Literal</em>'.
	 * @see org.emftext.language.textAML3.NullLiteral
	 * @generated
	 */
	EClass getNullLiteral();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.ErrorRule <em>Error Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Rule</em>'.
	 * @see org.emftext.language.textAML3.ErrorRule
	 * @generated
	 */
	EClass getErrorRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.ErrorRule#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.emftext.language.textAML3.ErrorRule#getSource()
	 * @see #getErrorRule()
	 * @generated
	 */
	EReference getErrorRule_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.ErrorRule#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see org.emftext.language.textAML3.ErrorRule#getVariables()
	 * @see #getErrorRule()
	 * @generated
	 */
	EReference getErrorRule_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.emftext.language.textAML3.ErrorRule#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see org.emftext.language.textAML3.ErrorRule#getConditions()
	 * @see #getErrorRule()
	 * @generated
	 */
	EReference getErrorRule_Conditions();

	/**
	 * Returns the meta object for the attribute '{@link org.emftext.language.textAML3.ErrorRule#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.emftext.language.textAML3.ErrorRule#getMessage()
	 * @see #getErrorRule()
	 * @generated
	 */
	EAttribute getErrorRule_Message();

	/**
	 * Returns the meta object for the containment reference '{@link org.emftext.language.textAML3.ErrorRule#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.emftext.language.textAML3.ErrorRule#getPosition()
	 * @see #getErrorRule()
	 * @generated
	 */
	EReference getErrorRule_Position();

	/**
	 * Returns the meta object for class '{@link org.emftext.language.textAML3.ContainmentVariable <em>Containment Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment Variable</em>'.
	 * @see org.emftext.language.textAML3.ContainmentVariable
	 * @generated
	 */
	EClass getContainmentVariable();

	/**
	 * Returns the meta object for the reference '{@link org.emftext.language.textAML3.ContainmentVariable#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see org.emftext.language.textAML3.ContainmentVariable#getContainer()
	 * @see #getContainmentVariable()
	 * @generated
	 */
	EReference getContainmentVariable_Container();

	/**
	 * Returns the meta object for enum '{@link org.emftext.language.textAML3.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator</em>'.
	 * @see org.emftext.language.textAML3.ComparisonOperator
	 * @generated
	 */
	EEnum getComparisonOperator();

	/**
	 * Returns the meta object for enum '{@link org.emftext.language.textAML3.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see org.emftext.language.textAML3.BinaryOperator
	 * @generated
	 */
	EEnum getBinaryOperator();

	/**
	 * Returns the meta object for enum '{@link org.emftext.language.textAML3.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operator</em>'.
	 * @see org.emftext.language.textAML3.UnaryOperator
	 * @generated
	 */
	EEnum getUnaryOperator();

	/**
	 * Returns the meta object for enum '{@link org.emftext.language.textAML3.ModelElementConnection <em>Model Element Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Element Connection</em>'.
	 * @see org.emftext.language.textAML3.ModelElementConnection
	 * @generated
	 */
	EEnum getModelElementConnection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TextAML3Factory getTextAML3Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.TypeSystemDecImpl <em>Type System Dec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.TypeSystemDecImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeSystemDec()
		 * @generated
		 */
		EClass TYPE_SYSTEM_DEC = eINSTANCE.getTypeSystemDec();

		/**
		 * The meta object literal for the '<em><b>Typevalues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SYSTEM_DEC__TYPEVALUES = eINSTANCE.getTypeSystemDec_Typevalues();

		/**
		 * The meta object literal for the '<em><b>Rulesystem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SYSTEM_DEC__RULESYSTEM = eINSTANCE.getTypeSystemDec_Rulesystem();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SYSTEM_DEC__STRATEGY = eINSTANCE.getTypeSystemDec_Strategy();

		/**
		 * The meta object literal for the '<em><b>Widening</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SYSTEM_DEC__WIDENING = eINSTANCE.getTypeSystemDec_Widening();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SYSTEM_DEC__PACKAGES = eINSTANCE.getTypeSystemDec_Packages();

		/**
		 * The meta object literal for the '<em><b>Baseclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SYSTEM_DEC__BASECLASS = eINSTANCE.getTypeSystemDec_Baseclass();

		/**
		 * The meta object literal for the '<em><b>Strategytarget</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SYSTEM_DEC__STRATEGYTARGET = eINSTANCE.getTypeSystemDec_Strategytarget();

		/**
		 * The meta object literal for the '<em><b>Errorrules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_SYSTEM_DEC__ERRORRULES = eINSTANCE.getTypeSystemDec_Errorrules();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.TypeDecImpl <em>Type Dec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.TypeDecImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeDec()
		 * @generated
		 */
		EClass TYPE_DEC = eINSTANCE.getTypeDec();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_DEC__NAME = eINSTANCE.getTypeDec_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEC__ATTRIBUTES = eINSTANCE.getTypeDec_Attributes();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEC__REPRESENTATION = eINSTANCE.getTypeDec_Representation();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.PackageElementImpl <em>Package Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.PackageElementImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getPackageElement()
		 * @generated
		 */
		EClass PACKAGE_ELEMENT = eINSTANCE.getPackageElement();

		/**
		 * The meta object literal for the '<em><b>Targetpackage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_ELEMENT__TARGETPACKAGE = eINSTANCE.getPackageElement_Targetpackage();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.ModelElementImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Targetclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__TARGETCLASS = eINSTANCE.getModelElement_Targetclass();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__ATTRIBUTES = eINSTANCE.getModelElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__RELATION = eINSTANCE.getModelElement_Relation();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.RelationImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__CONDITIONS = eINSTANCE.getRelation_Conditions();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__OPERATOR = eINSTANCE.getRelation_Operator();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.TypeRelationImpl <em>Type Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.TypeRelationImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeRelation()
		 * @generated
		 */
		EClass TYPE_RELATION = eINSTANCE.getTypeRelation();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_RELATION__LHS = eINSTANCE.getTypeRelation_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_RELATION__RHS = eINSTANCE.getTypeRelation_Rhs();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.ModelElementRelationImpl <em>Model Element Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.ModelElementRelationImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getModelElementRelation()
		 * @generated
		 */
		EClass MODEL_ELEMENT_RELATION = eINSTANCE.getModelElementRelation();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_RELATION__LHS = eINSTANCE.getModelElementRelation_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_RELATION__RHS = eINSTANCE.getModelElementRelation_Rhs();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.TypeRelationReferenceImpl <em>Type Relation Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.TypeRelationReferenceImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeRelationReference()
		 * @generated
		 */
		EClass TYPE_RELATION_REFERENCE = eINSTANCE.getTypeRelationReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_RELATION_REFERENCE__TARGET = eINSTANCE.getTypeRelationReference_Target();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_RELATION_REFERENCE__ARGUMENTS = eINSTANCE.getTypeRelationReference_Arguments();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.TypeRelationReferenceElementImpl <em>Type Relation Reference Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.TypeRelationReferenceElementImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeRelationReferenceElement()
		 * @generated
		 */
		EClass TYPE_RELATION_REFERENCE_ELEMENT = eINSTANCE.getTypeRelationReferenceElement();

		/**
		 * The meta object literal for the '<em><b>Typeattribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_RELATION_REFERENCE_ELEMENT__TYPEATTRIBUTE = eINSTANCE.getTypeRelationReferenceElement_Typeattribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_RELATION_REFERENCE_ELEMENT__VALUE = eINSTANCE.getTypeRelationReferenceElement_Value();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.TypeAttributeImpl <em>Type Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.TypeAttributeImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeAttribute()
		 * @generated
		 */
		EClass TYPE_ATTRIBUTE = eINSTANCE.getTypeAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ATTRIBUTE__NAME = eINSTANCE.getTypeAttribute_Name();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.TypeRuleImpl <em>Type Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.TypeRuleImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeRule()
		 * @generated
		 */
		EClass TYPE_RULE = eINSTANCE.getTypeRule();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_RULE__SOURCE = eINSTANCE.getTypeRule_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_RULE__TARGET = eINSTANCE.getTypeRule_Target();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_RULE__VARIABLES = eINSTANCE.getTypeRule_Variables();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_RULE__CONDITIONS = eINSTANCE.getTypeRule_Conditions();

		/**
		 * The meta object literal for the '<em><b>Containments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_RULE__CONTAINMENTS = eINSTANCE.getTypeRule_Containments();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.RuleElementExpressionImpl <em>Rule Element Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.RuleElementExpressionImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getRuleElementExpression()
		 * @generated
		 */
		EClass RULE_ELEMENT_EXPRESSION = eINSTANCE.getRuleElementExpression();

		/**
		 * The meta object literal for the '<em><b>Baseclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_ELEMENT_EXPRESSION__BASECLASS = eINSTANCE.getRuleElementExpression_Baseclass();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_ELEMENT_EXPRESSION__ATTRIBUTES = eINSTANCE.getRuleElementExpression_Attributes();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.RuleElementAttributeImpl <em>Rule Element Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.RuleElementAttributeImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getRuleElementAttribute()
		 * @generated
		 */
		EClass RULE_ELEMENT_ATTRIBUTE = eINSTANCE.getRuleElementAttribute();

		/**
		 * The meta object literal for the '<em><b>Myattribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_ELEMENT_ATTRIBUTE__MYATTRIBUTE = eINSTANCE.getRuleElementAttribute_Myattribute();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_ELEMENT_ATTRIBUTE__VARIABLE = eINSTANCE.getRuleElementAttribute_Variable();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.VariableImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Varname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VARNAME = eINSTANCE.getVariable_Varname();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.ConditionImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.ComparisonConditionImpl <em>Comparison Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.ComparisonConditionImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getComparisonCondition()
		 * @generated
		 */
		EClass COMPARISON_CONDITION = eINSTANCE.getComparisonCondition();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_CONDITION__LEFT = eINSTANCE.getComparisonCondition_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_CONDITION__RIGHT = eINSTANCE.getComparisonCondition_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_CONDITION__OPERATOR = eINSTANCE.getComparisonCondition_Operator();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.FoldConditionImpl <em>Fold Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.FoldConditionImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getFoldCondition()
		 * @generated
		 */
		EClass FOLD_CONDITION = eINSTANCE.getFoldCondition();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLD_CONDITION__GENERATOR = eINSTANCE.getFoldCondition_Generator();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLD_CONDITION__CONDITION = eINSTANCE.getFoldCondition_Condition();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.GeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.GeneratorImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getGenerator()
		 * @generated
		 */
		EClass GENERATOR = eINSTANCE.getGenerator();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__VARIABLE = eINSTANCE.getGenerator_Variable();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__CONTAINER = eINSTANCE.getGenerator_Container();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.ExpressionImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.VariableReferenceImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getVariableReference()
		 * @generated
		 */
		EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_REFERENCE__TARGET = eINSTANCE.getVariableReference_Target();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.NumberImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__VALUE = eINSTANCE.getNumber_Value();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.SetExpressionImpl <em>Set Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.SetExpressionImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getSetExpression()
		 * @generated
		 */
		EClass SET_EXPRESSION = eINSTANCE.getSetExpression();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_EXPRESSION__VALUES = eINSTANCE.getSetExpression_Values();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.BinaryExpressionImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.UnaryExpressionImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__LEFT = eINSTANCE.getUnaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OPERATOR = eINSTANCE.getUnaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.TypeReferenceImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeReference()
		 * @generated
		 */
		EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REFERENCE__TARGET = eINSTANCE.getTypeReference_Target();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REFERENCE__ARGUMENTS = eINSTANCE.getTypeReference_Arguments();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.TypeReferenceElementImpl <em>Type Reference Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.TypeReferenceElementImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getTypeReferenceElement()
		 * @generated
		 */
		EClass TYPE_REFERENCE_ELEMENT = eINSTANCE.getTypeReferenceElement();

		/**
		 * The meta object literal for the '<em><b>Typeattribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REFERENCE_ELEMENT__TYPEATTRIBUTE = eINSTANCE.getTypeReferenceElement_Typeattribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REFERENCE_ELEMENT__VALUE = eINSTANCE.getTypeReferenceElement_Value();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.AttributeReferenceImpl <em>Attribute Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.AttributeReferenceImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getAttributeReference()
		 * @generated
		 */
		EClass ATTRIBUTE_REFERENCE = eINSTANCE.getAttributeReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_REFERENCE__TARGET = eINSTANCE.getAttributeReference_Target();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.FunctionReferenceImpl <em>Function Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.FunctionReferenceImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getFunctionReference()
		 * @generated
		 */
		EClass FUNCTION_REFERENCE = eINSTANCE.getFunctionReference();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_REFERENCE__FUNCTION = eINSTANCE.getFunctionReference_Function();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.ModelElementExpressionImpl <em>Model Element Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.ModelElementExpressionImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getModelElementExpression()
		 * @generated
		 */
		EClass MODEL_ELEMENT_EXPRESSION = eINSTANCE.getModelElementExpression();

		/**
		 * The meta object literal for the '<em><b>Baseclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_EXPRESSION__BASECLASS = eINSTANCE.getModelElementExpression_Baseclass();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT_EXPRESSION__ATTRIBUTES = eINSTANCE.getModelElementExpression_Attributes();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.NestedExpressionImpl <em>Nested Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.NestedExpressionImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getNestedExpression()
		 * @generated
		 */
		EClass NESTED_EXPRESSION = eINSTANCE.getNestedExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_EXPRESSION__EXPRESSION = eINSTANCE.getNestedExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.AttributeExpressionImpl <em>Attribute Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.AttributeExpressionImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getAttributeExpression()
		 * @generated
		 */
		EClass ATTRIBUTE_EXPRESSION = eINSTANCE.getAttributeExpression();

		/**
		 * The meta object literal for the '<em><b>Myattribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_EXPRESSION__MYATTRIBUTE = eINSTANCE.getAttributeExpression_Myattribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_EXPRESSION__VALUE = eINSTANCE.getAttributeExpression_Value();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.StringLiteralImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.NullLiteralImpl <em>Null Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.NullLiteralImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getNullLiteral()
		 * @generated
		 */
		EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.ErrorRuleImpl <em>Error Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.ErrorRuleImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getErrorRule()
		 * @generated
		 */
		EClass ERROR_RULE = eINSTANCE.getErrorRule();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_RULE__SOURCE = eINSTANCE.getErrorRule_Source();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_RULE__VARIABLES = eINSTANCE.getErrorRule_Variables();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_RULE__CONDITIONS = eINSTANCE.getErrorRule_Conditions();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_RULE__MESSAGE = eINSTANCE.getErrorRule_Message();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_RULE__POSITION = eINSTANCE.getErrorRule_Position();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.impl.ContainmentVariableImpl <em>Containment Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.impl.ContainmentVariableImpl
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getContainmentVariable()
		 * @generated
		 */
		EClass CONTAINMENT_VARIABLE = eINSTANCE.getContainmentVariable();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINMENT_VARIABLE__CONTAINER = eINSTANCE.getContainmentVariable_Container();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.ComparisonOperator
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.BinaryOperator
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.UnaryOperator <em>Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.UnaryOperator
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getUnaryOperator()
		 * @generated
		 */
		EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '{@link org.emftext.language.textAML3.ModelElementConnection <em>Model Element Connection</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.emftext.language.textAML3.ModelElementConnection
		 * @see org.emftext.language.textAML3.impl.TextAML3PackageImpl#getModelElementConnection()
		 * @generated
		 */
		EEnum MODEL_ELEMENT_CONNECTION = eINSTANCE.getModelElementConnection();

	}

} //TextAML3Package
