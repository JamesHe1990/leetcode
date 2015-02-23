package recursive;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
	public List<String[]> solveNQueens(int n) {
        ArrayList<ArrayList<Integer>>rst = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
        helper(n,cur,rst);
        return(draw(rst,n));
    }
    public void helper(int n, ArrayList<Integer> cur, ArrayList<ArrayList<Integer>>rst) {
        if (cur.size() == n) {
            rst.add(new ArrayList<Integer>(cur));
            return;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < cur.size(); j++) {
                if (i == cur.get(j) || Math.abs(i-cur.get(j)) == Math.abs(cur.size()-j)){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                cur.add(i);
                helper(n,cur,rst);
                cur.remove((Integer)i);
            }
        }
    }
    public ArrayList<String[]> draw(ArrayList<ArrayList<Integer>> rst, int n){
        ArrayList<String[]>drwRst = new ArrayList<String[]>();
        for (ArrayList<Integer> sol: rst) {
            String[] tmp = new String[n];
            for (int i = 0; i < sol.size(); i++){
            	tmp[i]  = "";
                int pos = sol.get(i);
                for(int j = 0; j < n; j++) {
                    if (j == pos) {
                        tmp[i] = tmp[i]+"Q";
                    } else {
                        tmp[i] = tmp[i]+".";
                    }
                }
            }
            drwRst.add(tmp);
        }
        return drwRst;
    }
}
