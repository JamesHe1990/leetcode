package tree;

import java.util.Arrays;

public class SortedArrayToBST {
	
	public TreeNode sortedArrayToBST(int[] num) {
		int length = num.length;
		if (length == 0) return null;
		TreeNode root = new TreeNode(num[length/2]);
		root.left = sortedArrayToBST(Arrays.copyOfRange(num, 0, length/2 - 1));
		root.right = sortedArrayToBST(Arrays.copyOfRange(num, length/2 + 1, length - 1));
		return root;
    }
}
