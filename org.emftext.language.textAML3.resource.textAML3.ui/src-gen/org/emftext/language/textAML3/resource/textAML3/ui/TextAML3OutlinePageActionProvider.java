/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.ui;

public class TextAML3OutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(org.emftext.language.textAML3.resource.textAML3.ui.TextAML3OutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new org.emftext.language.textAML3.resource.textAML3.ui.TextAML3OutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new org.emftext.language.textAML3.resource.textAML3.ui.TextAML3OutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new org.emftext.language.textAML3.resource.textAML3.ui.TextAML3OutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new org.emftext.language.textAML3.resource.textAML3.ui.TextAML3OutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new org.emftext.language.textAML3.resource.textAML3.ui.TextAML3OutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new org.emftext.language.textAML3.resource.textAML3.ui.TextAML3OutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
