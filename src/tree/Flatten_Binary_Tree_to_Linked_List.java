package tree;

public class Flatten_Binary_Tree_to_Linked_List {
    public void flatten(TreeNode root) {
        flatRecur(root);
    }
    public TreeNode flatRecur(TreeNode root){
    	TreeNode leftEnd = null;
    	TreeNode rightEnd = null;
    	if (root.left == null && root.right == null) {
    		return root;
    	} else if(root.left == null) {
    		return flatRecur(root.right);
    	} else if(root.right == null) {
    		leftEnd = flatRecur(root.left);
    		root.right = root.left;
    		root.left = null;
    		return leftEnd;
    	} else{
    		leftEnd = flatRecur(root.left);
    		rightEnd = flatRecur(root.right);
    		leftEnd.right = root.right;
        	root.right = root.left;
        	root.left = null;
        	return rightEnd;
    	}
    }
}
