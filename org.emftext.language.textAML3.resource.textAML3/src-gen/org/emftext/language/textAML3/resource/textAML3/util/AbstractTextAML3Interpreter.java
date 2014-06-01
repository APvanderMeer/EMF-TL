/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractTextAML3Interpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<org.emftext.language.textAML3.resource.textAML3.ITextAML3InterpreterListener> listeners = new java.util.ArrayList<org.emftext.language.textAML3.resource.textAML3.ITextAML3InterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof org.emftext.language.textAML3.TypeSystemDec) {
			result = interprete_org_emftext_language_textAML3_TypeSystemDec((org.emftext.language.textAML3.TypeSystemDec) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.TypeDec) {
			result = interprete_org_emftext_language_textAML3_TypeDec((org.emftext.language.textAML3.TypeDec) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.PackageElement) {
			result = interprete_org_emftext_language_textAML3_PackageElement((org.emftext.language.textAML3.PackageElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.ModelElement) {
			result = interprete_org_emftext_language_textAML3_ModelElement((org.emftext.language.textAML3.ModelElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.TypeRelation) {
			result = interprete_org_emftext_language_textAML3_TypeRelation((org.emftext.language.textAML3.TypeRelation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.ModelElementRelation) {
			result = interprete_org_emftext_language_textAML3_ModelElementRelation((org.emftext.language.textAML3.ModelElementRelation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.Relation) {
			result = interprete_org_emftext_language_textAML3_Relation((org.emftext.language.textAML3.Relation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.TypeRelationReference) {
			result = interprete_org_emftext_language_textAML3_TypeRelationReference((org.emftext.language.textAML3.TypeRelationReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.TypeRelationReferenceElement) {
			result = interprete_org_emftext_language_textAML3_TypeRelationReferenceElement((org.emftext.language.textAML3.TypeRelationReferenceElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.TypeAttribute) {
			result = interprete_org_emftext_language_textAML3_TypeAttribute((org.emftext.language.textAML3.TypeAttribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.TypeRule) {
			result = interprete_org_emftext_language_textAML3_TypeRule((org.emftext.language.textAML3.TypeRule) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.RuleElementExpression) {
			result = interprete_org_emftext_language_textAML3_RuleElementExpression((org.emftext.language.textAML3.RuleElementExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.RuleElementAttribute) {
			result = interprete_org_emftext_language_textAML3_RuleElementAttribute((org.emftext.language.textAML3.RuleElementAttribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.Variable) {
			result = interprete_org_emftext_language_textAML3_Variable((org.emftext.language.textAML3.Variable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.ComparisonCondition) {
			result = interprete_org_emftext_language_textAML3_ComparisonCondition((org.emftext.language.textAML3.ComparisonCondition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.FoldCondition) {
			result = interprete_org_emftext_language_textAML3_FoldCondition((org.emftext.language.textAML3.FoldCondition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.Condition) {
			result = interprete_org_emftext_language_textAML3_Condition((org.emftext.language.textAML3.Condition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.Generator) {
			result = interprete_org_emftext_language_textAML3_Generator((org.emftext.language.textAML3.Generator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.VariableReference) {
			result = interprete_org_emftext_language_textAML3_VariableReference((org.emftext.language.textAML3.VariableReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.Number) {
			result = interprete_org_emftext_language_textAML3_Number((org.emftext.language.textAML3.Number) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.SetExpression) {
			result = interprete_org_emftext_language_textAML3_SetExpression((org.emftext.language.textAML3.SetExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.BinaryExpression) {
			result = interprete_org_emftext_language_textAML3_BinaryExpression((org.emftext.language.textAML3.BinaryExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.UnaryExpression) {
			result = interprete_org_emftext_language_textAML3_UnaryExpression((org.emftext.language.textAML3.UnaryExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.TypeReference) {
			result = interprete_org_emftext_language_textAML3_TypeReference((org.emftext.language.textAML3.TypeReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.AttributeReference) {
			result = interprete_org_emftext_language_textAML3_AttributeReference((org.emftext.language.textAML3.AttributeReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.FunctionReference) {
			result = interprete_org_emftext_language_textAML3_FunctionReference((org.emftext.language.textAML3.FunctionReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.ModelElementExpression) {
			result = interprete_org_emftext_language_textAML3_ModelElementExpression((org.emftext.language.textAML3.ModelElementExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.Expression) {
			result = interprete_org_emftext_language_textAML3_Expression((org.emftext.language.textAML3.Expression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.TypeReferenceElement) {
			result = interprete_org_emftext_language_textAML3_TypeReferenceElement((org.emftext.language.textAML3.TypeReferenceElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.NestedExpression) {
			result = interprete_org_emftext_language_textAML3_NestedExpression((org.emftext.language.textAML3.NestedExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.AttributeExpression) {
			result = interprete_org_emftext_language_textAML3_AttributeExpression((org.emftext.language.textAML3.AttributeExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.StringLiteral) {
			result = interprete_org_emftext_language_textAML3_StringLiteral((org.emftext.language.textAML3.StringLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.NullLiteral) {
			result = interprete_org_emftext_language_textAML3_NullLiteral((org.emftext.language.textAML3.NullLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.ErrorRule) {
			result = interprete_org_emftext_language_textAML3_ErrorRule((org.emftext.language.textAML3.ErrorRule) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.emftext.language.textAML3.ContainmentVariable) {
			result = interprete_org_emftext_language_textAML3_ContainmentVariable((org.emftext.language.textAML3.ContainmentVariable) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_TypeSystemDec(org.emftext.language.textAML3.TypeSystemDec typeSystemDec, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_TypeDec(org.emftext.language.textAML3.TypeDec typeDec, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_PackageElement(org.emftext.language.textAML3.PackageElement packageElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_ModelElement(org.emftext.language.textAML3.ModelElement modelElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_Relation(org.emftext.language.textAML3.Relation relation, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_TypeRelation(org.emftext.language.textAML3.TypeRelation typeRelation, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_ModelElementRelation(org.emftext.language.textAML3.ModelElementRelation modelElementRelation, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_TypeRelationReference(org.emftext.language.textAML3.TypeRelationReference typeRelationReference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_TypeRelationReferenceElement(org.emftext.language.textAML3.TypeRelationReferenceElement typeRelationReferenceElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_TypeAttribute(org.emftext.language.textAML3.TypeAttribute typeAttribute, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_TypeRule(org.emftext.language.textAML3.TypeRule typeRule, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_RuleElementExpression(org.emftext.language.textAML3.RuleElementExpression ruleElementExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_RuleElementAttribute(org.emftext.language.textAML3.RuleElementAttribute ruleElementAttribute, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_Variable(org.emftext.language.textAML3.Variable variable, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_Condition(org.emftext.language.textAML3.Condition condition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_ComparisonCondition(org.emftext.language.textAML3.ComparisonCondition comparisonCondition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_FoldCondition(org.emftext.language.textAML3.FoldCondition foldCondition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_Generator(org.emftext.language.textAML3.Generator generator, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_Expression(org.emftext.language.textAML3.Expression expression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_VariableReference(org.emftext.language.textAML3.VariableReference variableReference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_Number(org.emftext.language.textAML3.Number number, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_SetExpression(org.emftext.language.textAML3.SetExpression setExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_BinaryExpression(org.emftext.language.textAML3.BinaryExpression binaryExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_UnaryExpression(org.emftext.language.textAML3.UnaryExpression unaryExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_TypeReference(org.emftext.language.textAML3.TypeReference typeReference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_TypeReferenceElement(org.emftext.language.textAML3.TypeReferenceElement typeReferenceElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_AttributeReference(org.emftext.language.textAML3.AttributeReference attributeReference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_FunctionReference(org.emftext.language.textAML3.FunctionReference functionReference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_ModelElementExpression(org.emftext.language.textAML3.ModelElementExpression modelElementExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_NestedExpression(org.emftext.language.textAML3.NestedExpression nestedExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_AttributeExpression(org.emftext.language.textAML3.AttributeExpression attributeExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_StringLiteral(org.emftext.language.textAML3.StringLiteral stringLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_NullLiteral(org.emftext.language.textAML3.NullLiteral nullLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_ErrorRule(org.emftext.language.textAML3.ErrorRule errorRule, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_emftext_language_textAML3_ContainmentVariable(org.emftext.language.textAML3.ContainmentVariable containmentVariable, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (org.emftext.language.textAML3.resource.textAML3.ITextAML3InterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(org.emftext.language.textAML3.resource.textAML3.ITextAML3InterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(org.emftext.language.textAML3.resource.textAML3.ITextAML3InterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
