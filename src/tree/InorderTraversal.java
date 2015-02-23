package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList al = new ArrayList<Integer>();
        return traverse(root, al);
    }
	public List<Integer> traverse(TreeNode root, List<Integer> tmp) {
		if (root == null) return tmp;
		traverse(root.left, tmp);
		tmp.add(root.val);
		traverse(root.right,tmp);
		return tmp;
	}
// iteration method: pop two nodes from stack and if node1's right son is node2, 
//	then it means this is node1's second time out stack and we should output 
//	it this time.	
	public List<Integer> inorderTraversal1(TreeNode root) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Stack<TreeNode> st = new Stack<TreeNode>();
		st.add(root);
		traverse1(st,al);
		return al;
	}
	public void traverse1(Stack<TreeNode> st, List<Integer> tmp) {
		while(!st.isEmpty()) {
			TreeNode root = st.pop();
			if (root == null) continue;
			if (st.isEmpty()) {
				st.push(root.right);
				st.push(root);
				st.push(root.left);
			}
			else {
				TreeNode last = st.pop();
				if (last != root.right) {
					st.push(last);
					st.push(root.right);
					st.push(root);
					st.push(root.left);
				} else{
					if (root != null) tmp.add(root.val);
					st.push(last);
				}
			}
		}
	}

}
