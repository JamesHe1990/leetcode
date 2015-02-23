import java.util.ArrayList;


public class PascaTriangle {
	 public ArrayList<ArrayList<Integer>> generate(int numRows) {
	        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
	        if(numRows == 0) return rst;
	        ArrayList<Integer> first = new ArrayList<Integer>();
	        first.add(1);
	        rst.add(first);
	        for (int i = 0; i < numRows-1; i++){
	            ArrayList<Integer> last = rst.get(i);
	            ArrayList<Integer> next = new ArrayList<Integer>();
	                       
	            for (int j = 0; j <= last.size(); j++){
	            	if(j == 0){
	            		next.add(0,last.get(0));
	            	} else if (j == last.size()){
	            		next.add(last.size(), last.get(last.size()-1));
	            	} else{
	            		next.add(j,last.get(j-1)+last.get(j));
	            	}
	                
	            }
	            rst.add(next);
	        }
	        return rst;
	    }
}
