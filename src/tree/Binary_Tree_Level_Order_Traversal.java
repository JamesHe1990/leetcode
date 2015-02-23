package tree;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Level_Order_Traversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> rst = new ArrayList<List<Integer>>();
        ArrayList<TreeNode> nodeTmp = new ArrayList<TreeNode>();
        if (root == null){
        	return rst;
        }
        nodeTmp.add(root);
        while(!nodeTmp.isEmpty()){
        	ArrayList<Integer> tmp = new ArrayList<Integer>();
        	ArrayList<TreeNode> nextTmp = new ArrayList<TreeNode>();
        	for(TreeNode node : nodeTmp) {
        		tmp.add(node.val);
        		if(node.left != null) nextTmp.add(node.left);
        		if(node.right != null) nextTmp.add(node.right);
        	}
        	rst.add(0,tmp);
        	nodeTmp = nextTmp;
        }
        return rst;
    }
}
