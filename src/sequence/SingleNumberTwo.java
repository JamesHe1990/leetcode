package sequence;

public class SingleNumberTwo {
	public int singleNumber(int[] A) {
        if (A == null || A.length == 0) return -1;
        int bits[] = new int[32];
        for (int i = 0; i < A.length; i++){
            int num = A[i];
            for(int j = 0; j < 32; j++){
                if (num == 0) break;
                bits[j] += num & 1;
                num = num >> 1;
            }
        }
        int rst = 0;
        for (int i = 0; i < 32; i++){
            if (bits[i] % 3 != 0) rst += Math.pow(2,i);
        }
        return rst;
    }
}
