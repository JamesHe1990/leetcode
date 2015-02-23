package tree;

import java.util.ArrayList;
import java.util.List;

public class Unique_Binary_Search_Trees_Two {
	public List<TreeNode> generateTrees(int n) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i=1; i<=n; i++) numbers.add(i);
        ArrayList<TreeNode> rst = recurNums(numbers);
        if (rst.get(0).val == 0) rst.remove(0);
        return rst;
    }
    public ArrayList<TreeNode> recurNums(ArrayList<Integer> numbers) {
        ArrayList<TreeNode> rst = new ArrayList<TreeNode>();
        for (int i = 0; i < numbers.size(); i++){
            ArrayList<Integer> left = new ArrayList(numbers.subList(0, i));
            ArrayList<Integer> right = new ArrayList(numbers.subList(i+1, numbers.size()));
            ArrayList<TreeNode> leftRst = recurNums(left);
            ArrayList<TreeNode> rightRst = recurNums(right);
            for (TreeNode l : leftRst) {
            	for (TreeNode r : rightRst){
            		TreeNode root = new TreeNode(numbers.get(i));
            		if(l.val != 0) root.left = l;
            		if(r.val != 0) root.right = r;
            		rst.add(root);
            	}
            }
        }
        if (rst.size()==0) rst.add(new TreeNode(0));
        return rst;
    }
}
