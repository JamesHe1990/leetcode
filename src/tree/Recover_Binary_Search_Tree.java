package tree;

public class Recover_Binary_Search_Tree {
	TreeNode firstElement = null;
	TreeNode secondElement = null;
	TreeNode last = new TreeNode(Integer.MIN_VALUE);
	public void recoverTree(TreeNode root) {
        recurRecover(root);
        firstElement.val += secondElement.val;
        secondElement.val = firstElement.val - secondElement.val;
        firstElement.val -= secondElement.val;
    }
	public void recurRecover(TreeNode root) {
		if(root == null) return;
		recurRecover(root.left);
		if (root.val < last.val) {
			if(firstElement == null) firstElement = last;
			if (firstElement != null) secondElement = root;
		}
		last = root;
		recurRecover(root.right);
	}
}
