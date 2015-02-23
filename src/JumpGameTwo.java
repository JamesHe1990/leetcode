
public class JumpGameTwo {
	public int jump(int[] A) {
        int length = A.length;
        if (length == 0 || length == 1) return 0;
        int rst[] = new int[length];
        rst[0] = 0;
        for(int i = 1; i<length; i++){
            rst[i] = Integer.MAX_VALUE;
	        for (int j = 0; j <i; j++){
	            if (rst[j] != Integer.MAX_VALUE && A[j] + j >= i) {
	                rst[i] = rst[j] + 1;
	                break;
	            }
            }
        }
        return rst[length-1];
    }
}
