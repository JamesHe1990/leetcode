package tree;

import java.util.Arrays;

public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length != postorder.length || inorder.length == 0) return null;
        int len = inorder.length;
        TreeNode root = new TreeNode(postorder[len-1]);
        int i;
        for(i = 0; i < len; i++) {
            if (inorder[i] == postorder[len-1]) break; 
        }
        root.left = buildTree(Arrays.copyOfRange(inorder,0,i),Arrays.copyOfRange(postorder,0,i));
        root.right = buildTree(Arrays.copyOfRange(inorder,i+1,len),Arrays.copyOfRange(postorder,i,len-1));
        return root;
    }
}
