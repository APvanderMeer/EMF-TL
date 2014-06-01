/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.ui;

public class TextAML3OutlinePageCollapseAllAction extends org.emftext.language.textAML3.resource.textAML3.ui.AbstractTextAML3OutlinePageAction {
	
	public TextAML3OutlinePageCollapseAllAction(org.emftext.language.textAML3.resource.textAML3.ui.TextAML3OutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Collapse all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/collapse_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().collapseAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
