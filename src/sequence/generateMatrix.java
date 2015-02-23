package sequence;

public class generateMatrix {
	public int[][] generateMatrix(int n) {
        int rst[][] = new int[n][n];
        int start = 1;
        for (int i = 0; i < n/2; i++){
            for (int j = i; j < n-1-i; j++){
                rst[i][j] = start;
                rst[j][n-1-i] = start + (n-1-i);
                rst[n-1-i][n-1-j] = start + (n-1-i)*2;
                rst[n-1-j][i] = start + (n-1-i)*3;
                start++;
            }
            start = n*n - (n-2*i-2)*(n-2*i-2) + 1;
        }
        if (n % 2 == 1) rst[n/2][n/2] = n*n;
        return rst;
    }
}
