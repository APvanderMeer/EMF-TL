/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.ui;

public class TextAML3OutlinePageTypeSortingAction extends org.emftext.language.textAML3.resource.textAML3.ui.AbstractTextAML3OutlinePageAction {
	
	public TextAML3OutlinePageTypeSortingAction(org.emftext.language.textAML3.resource.textAML3.ui.TextAML3OutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
