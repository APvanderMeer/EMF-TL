/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.ui;

public class TextAML3OutlinePageLexicalSortingAction extends org.emftext.language.textAML3.resource.textAML3.ui.AbstractTextAML3OutlinePageAction {
	
	public TextAML3OutlinePageLexicalSortingAction(org.emftext.language.textAML3.resource.textAML3.ui.TextAML3OutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
