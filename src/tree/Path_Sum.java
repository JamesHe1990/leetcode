package tree;

public class Path_Sum {
	public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return hasPathSum1(root,sum);
    }
    public boolean hasPathSum1(TreeNode root, int sum) {
        if (sum < 0) return false;
        if (root == null) return sum ==0;
        return hasPathSum1(root.left,sum-root.val) && hasPathSum1(root.right, sum-root.val);
    }
}
