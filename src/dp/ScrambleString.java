package dp;

public class ScrambleString {
//	下标完全不明白
	public boolean isScramble(String s1, String s2) {
		if (s1 == null || s2 == null ||s1.length() != s2.length()) return false;
//		dp[n][i][j] = dp[k][i][j]&&dp[n-k-1][i+k+1][j+k+1] || dp[k][i][j+n-k]&&dp[n-k-1][i+k+1][j]  (1<=k<n)
		int lth = s1.length();
		boolean dp[][][] = new boolean [lth][lth][lth];
		for (int i = 0; i < lth; i++){
			for(int j = 0; j < lth; j++){
				dp[0][i][j] = s1.charAt(i) == s2.charAt(j);
			}
		}
		
		for (int n = 1; n < lth; n++){
			for (int i = 0; i < lth-n; i++){
				for (int j = 0; j < lth-n; j++){
					boolean flag = false;
					for (int k = 0; k < n; k++) {
						flag = flag ||(dp[k][i][j]&&dp[n-k-1][i+k+1][j+k+1]);
						flag = flag ||(dp[n-k-1][i][j+k+1]&&dp[k][i+n-k][j]);
						if (flag == true) {
							dp[n][i][j] = true;
							break;
						}
						if (flag == false) dp[n][i][j] = false;
					}
				}
			}
		}
		return dp[lth-1][0][0];
	}
}
