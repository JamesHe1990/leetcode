package recursive;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationTwo {
	public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
	    Arrays.sort(num);
	    ArrayList<ArrayList<Integer>>rst = new ArrayList<ArrayList<Integer>>();
	    ArrayList<Integer> tmp = new ArrayList<Integer>();
	    boolean flag[] = new boolean[num.length];
	    helper(rst,tmp,num,flag);
	    return rst;
    }
    
    public void helper(ArrayList<ArrayList<Integer>> rst, ArrayList<Integer> tmp, int[]num,boolean[] flag){
        if(tmp.size() == num.length){
            rst.add(new ArrayList(tmp));
            return;
        }
        int prev = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++){
            if ((i != 0 && num[i] == prev) || flag[i] == true) continue;
            prev = num[i];
            tmp.add(num[i]);
            flag[i] = true;
            helper(rst,tmp,num,flag);
            flag[i] = false;
            tmp.remove(tmp.size()-1);
        }
    }
}
