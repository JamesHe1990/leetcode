package iterration;

import java.util.ArrayList;
import java.util.List;

public class Combination {
	    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
	        ArrayList<ArrayList<Integer>>rst = new ArrayList<ArrayList<Integer>>();
	        ArrayList<Integer> cur = new ArrayList<Integer>();
	        dfs(1,n,k,cur,rst);
	        return rst;
	    }
	    
	    public void dfs(int start, int n,int k, ArrayList<Integer>cur, ArrayList<ArrayList<Integer>>rst){
	        if (cur.size() == k) {
	            rst.add(new ArrayList<Integer>(cur));
	            return;
	        }
	        for(int i = start; i <= n-(k-cur.size()) + 1; i++){
	        	int kk = n-(k-cur.size()) + 1;
	            cur.add(i);
	            dfs(i+1,n,k,cur,rst);
	            boolean flag = cur.remove((Integer)i);
	        }
	    }
}
