package tree;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList al = new ArrayList<Integer>();
        return traverse(root, al);
    }
	public List<Integer> traverse(TreeNode root, List<Integer> tmp) {
		if (root == null) return tmp;
		tmp.add(root.val);
		traverse(root.left, tmp);
		traverse(root.right,tmp);
		return tmp;
	}
}
