package tree;
/***
 * Given a binary tree, determine if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined
 * as a binary tree in which the depth of the two subtrees
 *  of every node never differ by more than 1.
 *  */
public class Balanced_Binary_Tree {
    public boolean isBalanced(TreeNode root) {
    	if(root.left == null && root.right == null) {
    		root.val = 1;
    		return true;
    	}
    	else if (root.left == null) {
    		if (!isBalanced(root.right)) return false;
    		root.val = root.right.val + 1;
    		return (root.right.val <= 1);
    	}
    	else if (root.right == null) {
    		if (!isBalanced(root.left)) return false;
    		root.val = root.left.val + 1;
    		return (root.left.val <= 1);
    	}
    	else{
    		if (!(isBalanced(root.left) && isBalanced(root.right))) return false;
    		root.val = Math.max(root.left.val,root.right.val) + 1;
    		return (Math.abs(root.left.val - root.right.val) <= 1);
    	}
    }
}
