package dp;

public class DistinctSubSequence {
//	if char i = char j, dp[i][j] = dp[i-1][j-1] + dp[i-1][j]  else dp[i][j] = dp[i-1][j]
	public int numDistincts(String S, String T) {
		if (S.length() < T.length() || S == null) return 0;
		if (S.length() == 0 && T.length() == 0) return 1;
		int dp[][] = new int[S.length()][T.length()];
		dp[0][0] = (S.charAt(0) == T.charAt(0)) ? 1:0;
		for (int i = 1; i < S.length(); i++){
			dp[i][0] = (S.charAt(i) == T.charAt(0)) ? dp[i-1][0]+1 : dp[i-1][0];
		}
		for (int j = 1; j < T.length(); j++){
			dp[0][j] = 0;
		}
		for (int i = 1; i < S.length(); i++) {
			for (int j = 1; j < T.length(); j++){
				dp[i][j] = (S.charAt(i) == T.charAt(j))? dp[i-1][j-1] + dp[i-1][j] : dp[i-1][j];	
			}
		}
		return dp[S.length()-1][T.length()-1];
	}
	
}
