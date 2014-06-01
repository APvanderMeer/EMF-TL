/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.textAML3.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftext.language.textAML3.AttributeExpression;
import org.emftext.language.textAML3.AttributeReference;
import org.emftext.language.textAML3.BinaryExpression;
import org.emftext.language.textAML3.BinaryOperator;
import org.emftext.language.textAML3.ComparisonCondition;
import org.emftext.language.textAML3.ComparisonOperator;
import org.emftext.language.textAML3.ContainmentVariable;
import org.emftext.language.textAML3.ErrorRule;
import org.emftext.language.textAML3.FoldCondition;
import org.emftext.language.textAML3.FunctionReference;
import org.emftext.language.textAML3.Generator;
import org.emftext.language.textAML3.ModelElement;
import org.emftext.language.textAML3.ModelElementConnection;
import org.emftext.language.textAML3.ModelElementExpression;
import org.emftext.language.textAML3.ModelElementRelation;
import org.emftext.language.textAML3.NestedExpression;
import org.emftext.language.textAML3.NullLiteral;
import org.emftext.language.textAML3.PackageElement;
import org.emftext.language.textAML3.RuleElementAttribute;
import org.emftext.language.textAML3.RuleElementExpression;
import org.emftext.language.textAML3.SetExpression;
import org.emftext.language.textAML3.StringLiteral;
import org.emftext.language.textAML3.TextAML3Factory;
import org.emftext.language.textAML3.TextAML3Package;
import org.emftext.language.textAML3.TypeAttribute;
import org.emftext.language.textAML3.TypeDec;
import org.emftext.language.textAML3.TypeReference;
import org.emftext.language.textAML3.TypeReferenceElement;
import org.emftext.language.textAML3.TypeRelation;
import org.emftext.language.textAML3.TypeRelationReference;
import org.emftext.language.textAML3.TypeRelationReferenceElement;
import org.emftext.language.textAML3.TypeRule;
import org.emftext.language.textAML3.TypeSystemDec;
import org.emftext.language.textAML3.UnaryExpression;
import org.emftext.language.textAML3.UnaryOperator;
import org.emftext.language.textAML3.Variable;
import org.emftext.language.textAML3.VariableReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextAML3FactoryImpl extends EFactoryImpl implements TextAML3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextAML3Factory init() {
		try {
			TextAML3Factory theTextAML3Factory = (TextAML3Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.emftext.org/language/textAML3"); 
			if (theTextAML3Factory != null) {
				return theTextAML3Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TextAML3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAML3FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TextAML3Package.TYPE_SYSTEM_DEC: return createTypeSystemDec();
			case TextAML3Package.TYPE_DEC: return createTypeDec();
			case TextAML3Package.PACKAGE_ELEMENT: return createPackageElement();
			case TextAML3Package.MODEL_ELEMENT: return createModelElement();
			case TextAML3Package.TYPE_RELATION: return createTypeRelation();
			case TextAML3Package.MODEL_ELEMENT_RELATION: return createModelElementRelation();
			case TextAML3Package.TYPE_RELATION_REFERENCE: return createTypeRelationReference();
			case TextAML3Package.TYPE_RELATION_REFERENCE_ELEMENT: return createTypeRelationReferenceElement();
			case TextAML3Package.TYPE_ATTRIBUTE: return createTypeAttribute();
			case TextAML3Package.TYPE_RULE: return createTypeRule();
			case TextAML3Package.RULE_ELEMENT_EXPRESSION: return createRuleElementExpression();
			case TextAML3Package.RULE_ELEMENT_ATTRIBUTE: return createRuleElementAttribute();
			case TextAML3Package.VARIABLE: return createVariable();
			case TextAML3Package.COMPARISON_CONDITION: return createComparisonCondition();
			case TextAML3Package.FOLD_CONDITION: return createFoldCondition();
			case TextAML3Package.GENERATOR: return createGenerator();
			case TextAML3Package.VARIABLE_REFERENCE: return createVariableReference();
			case TextAML3Package.NUMBER: return createNumber();
			case TextAML3Package.SET_EXPRESSION: return createSetExpression();
			case TextAML3Package.BINARY_EXPRESSION: return createBinaryExpression();
			case TextAML3Package.UNARY_EXPRESSION: return createUnaryExpression();
			case TextAML3Package.TYPE_REFERENCE: return createTypeReference();
			case TextAML3Package.TYPE_REFERENCE_ELEMENT: return createTypeReferenceElement();
			case TextAML3Package.ATTRIBUTE_REFERENCE: return createAttributeReference();
			case TextAML3Package.FUNCTION_REFERENCE: return createFunctionReference();
			case TextAML3Package.MODEL_ELEMENT_EXPRESSION: return createModelElementExpression();
			case TextAML3Package.NESTED_EXPRESSION: return createNestedExpression();
			case TextAML3Package.ATTRIBUTE_EXPRESSION: return createAttributeExpression();
			case TextAML3Package.STRING_LITERAL: return createStringLiteral();
			case TextAML3Package.NULL_LITERAL: return createNullLiteral();
			case TextAML3Package.ERROR_RULE: return createErrorRule();
			case TextAML3Package.CONTAINMENT_VARIABLE: return createContainmentVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TextAML3Package.COMPARISON_OPERATOR:
				return createComparisonOperatorFromString(eDataType, initialValue);
			case TextAML3Package.BINARY_OPERATOR:
				return createBinaryOperatorFromString(eDataType, initialValue);
			case TextAML3Package.UNARY_OPERATOR:
				return createUnaryOperatorFromString(eDataType, initialValue);
			case TextAML3Package.MODEL_ELEMENT_CONNECTION:
				return createModelElementConnectionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TextAML3Package.COMPARISON_OPERATOR:
				return convertComparisonOperatorToString(eDataType, instanceValue);
			case TextAML3Package.BINARY_OPERATOR:
				return convertBinaryOperatorToString(eDataType, instanceValue);
			case TextAML3Package.UNARY_OPERATOR:
				return convertUnaryOperatorToString(eDataType, instanceValue);
			case TextAML3Package.MODEL_ELEMENT_CONNECTION:
				return convertModelElementConnectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSystemDec createTypeSystemDec() {
		TypeSystemDecImpl typeSystemDec = new TypeSystemDecImpl();
		return typeSystemDec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDec createTypeDec() {
		TypeDecImpl typeDec = new TypeDecImpl();
		return typeDec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageElement createPackageElement() {
		PackageElementImpl packageElement = new PackageElementImpl();
		return packageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement createModelElement() {
		ModelElementImpl modelElement = new ModelElementImpl();
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRelation createTypeRelation() {
		TypeRelationImpl typeRelation = new TypeRelationImpl();
		return typeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementRelation createModelElementRelation() {
		ModelElementRelationImpl modelElementRelation = new ModelElementRelationImpl();
		return modelElementRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRelationReference createTypeRelationReference() {
		TypeRelationReferenceImpl typeRelationReference = new TypeRelationReferenceImpl();
		return typeRelationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRelationReferenceElement createTypeRelationReferenceElement() {
		TypeRelationReferenceElementImpl typeRelationReferenceElement = new TypeRelationReferenceElementImpl();
		return typeRelationReferenceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAttribute createTypeAttribute() {
		TypeAttributeImpl typeAttribute = new TypeAttributeImpl();
		return typeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRule createTypeRule() {
		TypeRuleImpl typeRule = new TypeRuleImpl();
		return typeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleElementExpression createRuleElementExpression() {
		RuleElementExpressionImpl ruleElementExpression = new RuleElementExpressionImpl();
		return ruleElementExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleElementAttribute createRuleElementAttribute() {
		RuleElementAttributeImpl ruleElementAttribute = new RuleElementAttributeImpl();
		return ruleElementAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonCondition createComparisonCondition() {
		ComparisonConditionImpl comparisonCondition = new ComparisonConditionImpl();
		return comparisonCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoldCondition createFoldCondition() {
		FoldConditionImpl foldCondition = new FoldConditionImpl();
		return foldCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator createGenerator() {
		GeneratorImpl generator = new GeneratorImpl();
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableReference createVariableReference() {
		VariableReferenceImpl variableReference = new VariableReferenceImpl();
		return variableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.emftext.language.textAML3.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetExpression createSetExpression() {
		SetExpressionImpl setExpression = new SetExpressionImpl();
		return setExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference createTypeReference() {
		TypeReferenceImpl typeReference = new TypeReferenceImpl();
		return typeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReferenceElement createTypeReferenceElement() {
		TypeReferenceElementImpl typeReferenceElement = new TypeReferenceElementImpl();
		return typeReferenceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeReference createAttributeReference() {
		AttributeReferenceImpl attributeReference = new AttributeReferenceImpl();
		return attributeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionReference createFunctionReference() {
		FunctionReferenceImpl functionReference = new FunctionReferenceImpl();
		return functionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementExpression createModelElementExpression() {
		ModelElementExpressionImpl modelElementExpression = new ModelElementExpressionImpl();
		return modelElementExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedExpression createNestedExpression() {
		NestedExpressionImpl nestedExpression = new NestedExpressionImpl();
		return nestedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeExpression createAttributeExpression() {
		AttributeExpressionImpl attributeExpression = new AttributeExpressionImpl();
		return attributeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringLiteral createStringLiteral() {
		StringLiteralImpl stringLiteral = new StringLiteralImpl();
		return stringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullLiteral createNullLiteral() {
		NullLiteralImpl nullLiteral = new NullLiteralImpl();
		return nullLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorRule createErrorRule() {
		ErrorRuleImpl errorRule = new ErrorRuleImpl();
		return errorRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainmentVariable createContainmentVariable() {
		ContainmentVariableImpl containmentVariable = new ContainmentVariableImpl();
		return containmentVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator createComparisonOperatorFromString(EDataType eDataType, String initialValue) {
		ComparisonOperator result = ComparisonOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator createBinaryOperatorFromString(EDataType eDataType, String initialValue) {
		BinaryOperator result = BinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator createUnaryOperatorFromString(EDataType eDataType, String initialValue) {
		UnaryOperator result = UnaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElementConnection createModelElementConnectionFromString(EDataType eDataType, String initialValue) {
		ModelElementConnection result = ModelElementConnection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelElementConnectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAML3Package getTextAML3Package() {
		return (TextAML3Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TextAML3Package getPackage() {
		return TextAML3Package.eINSTANCE;
	}

} //TextAML3FactoryImpl
