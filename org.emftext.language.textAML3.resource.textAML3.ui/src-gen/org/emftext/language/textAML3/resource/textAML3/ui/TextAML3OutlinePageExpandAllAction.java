/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.ui;

public class TextAML3OutlinePageExpandAllAction extends org.emftext.language.textAML3.resource.textAML3.ui.AbstractTextAML3OutlinePageAction {
	
	public TextAML3OutlinePageExpandAllAction(org.emftext.language.textAML3.resource.textAML3.ui.TextAML3OutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
