package tree;

import java.util.ArrayList;
import java.util.Stack;

public class Binary_Tree_Postorder_Traversal {
	public ArrayList<Integer> postorderTraversal(TreeNode root) {
	   ArrayList<Integer> rst = new ArrayList<Integer>();
	   TreeNode lastNode = null;
	   TreeNode curNode = null;
	   Stack<TreeNode> st = new Stack<TreeNode>();
	   if (root == null) return rst;
	   st.add(root);
	   while(!st.empty()){
		   curNode = st.peek();
		   if (lastNode == null || curNode == lastNode.left || curNode == lastNode.right) {
			   if (curNode.left != null){
				   st.add(curNode.left);
			   } else if(curNode.right != null) {
				   st.add(curNode.right);
			   }
		   } else {
			   if (lastNode == curNode.left) {
				   if (curNode.right != null) st.add(curNode.right);
			   } else {
				   rst.add(curNode.val);
				   st.pop();
			   }
		   }
		   lastNode = curNode;
	   }
	   return rst;
 	}
}
