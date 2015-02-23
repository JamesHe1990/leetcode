package recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
	public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if (num.length == 0) return rst;
        Arrays.sort(num);
        ArrayList<Integer> cur = new ArrayList<Integer>();
        int visited[] = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            visited[i] = 0;
        }
        permuHelper(num,visited, cur, rst);
        return rst;
    }
    
    public void permuHelper(int[]num, int[]visited, ArrayList<Integer>cur, ArrayList<ArrayList<Integer>>rst){
        if (cur.size() == num.length) {
            rst.add(new ArrayList<Integer>(cur));
            return;
        }
        
        for (int i = 0; i < num.length;i++ ) {
            if (visited[i] == 1 || (i >= 1 && visited[i-1] == 0 && num[i-1] == num[i])) {
                continue;
            }
            cur.add(num[i]);
            visited[i] = 1;
            permuHelper(num,visited,cur,rst);
            visited[i] = 0;
            cur.remove(cur.size() - 1);
        }
    }
}
