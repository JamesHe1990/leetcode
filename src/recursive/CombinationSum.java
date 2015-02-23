package recursive;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        Arrays.sort(candidates);
        helper(candidates,target,0, rst, tmp);
        return rst;
    }
    public void helper(int[] candidates, int target, int startPos, ArrayList<ArrayList<Integer>>rst, ArrayList<Integer>tmp){
        
        if (target == 0) {
            rst.add(new ArrayList<Integer>(tmp));
            return;
        }
        if (startPos > candidates.length || candidates[startPos] > target) return;  //这里是为了combination 2，当startPos+1的时候可能溢出
        int prev = -1;
        for (int i = startPos; i < candidates.length; i++){
            if (candidates[i] > target) break;
            if (prev != -1 && prev == candidates[i]) continue;
            tmp.add(candidates[i]);
            helper(candidates, target - candidates[i], i, rst, tmp);
            tmp.remove(tmp.size()-1);
            prev = candidates[i];
        }
    }
}
