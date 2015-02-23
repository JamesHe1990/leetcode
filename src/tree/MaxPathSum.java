package tree;

public class MaxPathSum {
	int max = Integer.MIN_VALUE;
	public int maxPathSum(TreeNode root) {
        findMax(root);
		return max;
    }
	public int findMax(TreeNode root){//return only one longest branch from this root
		if (root == null) {
			return 0;
		}else {
			int left = findMax(root.left);
			int right = findMax(root.right);
			int tmp = left + right + root.val;
			max = max > tmp ? max : tmp;
			return root.val + (left > right ? left : right);
		}
	}
}
