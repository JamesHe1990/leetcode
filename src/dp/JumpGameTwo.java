package dp;

public class JumpGameTwo {
	 public int jump(int[] A) {
		 
	        int[] steps = new int[A.length];
	        
	        steps[0] = 0;
	        for (int i = 1; i < A.length; i++) {
	            steps[i] = Integer.MAX_VALUE;
	            for (int j = 0; j < i; j++) {
	                if (steps[j] != Integer.MAX_VALUE && j + A[j] >= i) {
	                    steps[i] = steps[j] + 1;
	                    break;  //有一个前提的  当i<j, 一定有step[i] < step[j]
	                }
	            }
	        }
	        
	        return steps[A.length - 1];
	    }
}
