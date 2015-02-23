package binary;

public class SearchForRange {
	 public int[] searchRange(int[] A, int target) {//0.5
	        int rst[] = new int[2];
	        rst[0] = searchLo(A,target-0.5)+1;
	        rst[1] = searchLo(A,target+0.5);
	        if (rst[1] < 0 || rst[0] >= A.length || rst[1] < rst[0]){// search([1],0) || search([1],2) || search([1,5],4)
	            rst[0] = -1;
	            rst[1] = -1;
	        } 
	        return rst;
	    }
	    public int searchLo(int[]A, double target){
	        int hi = A.length-1;
	        int lo = 0;
	        while(lo <= hi){
	            int mid = lo+(hi-lo)/2;
	            if (A[mid] < target){
	                lo = mid+1;
	            } else {
	                hi = mid -1;
	            }
	        }
	        return hi;
	    }
}
