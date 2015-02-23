package tree;

import java.util.ArrayList;
import java.util.List;

public class Path_Sum_Two {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<List<Integer>> rst = new ArrayList<List<Integer>>();
        ArrayList<Integer> path = new ArrayList<Integer>();
        if(root == null) return rst;
        pathSum1(rst,path,root,sum);
        return rst;
    }
    public void pathSum1(ArrayList<List<Integer>> rst, ArrayList<Integer>path, TreeNode root, int sum) {
        if (sum < 0) return;
        if (root.left == null && root.right == null) {
            if (sum == root.val) {
            	ArrayList<Integer> tmp = new ArrayList(path);
            	tmp.add(root.val);
            	rst.add(tmp);
            }
            return;
        }
        int length = path.size();
        path.add(root.val);
        if(root.left != null) pathSum1(rst,path,root.left,sum-root.val);
        if(root.right != null) pathSum1(rst,path,root.right,sum-root.val);
        path.remove(length);
        return;
    }

}
