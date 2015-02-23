package dp;

import java.util.ArrayList;

public class PalindromePartitionTwo {
	public int minCut(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n][n];
        for (int i = 0; i < n; i++) 
            dp[i][i] = true;
        for (int i = 1; i < n; i++){
            for (int j = 0; j+i < n; j++){
                if (s.charAt(j) == s.charAt(j+i)){
                    dp[j][j+i] = i==1 ? true: dp[j+1][j+i-1];
                }
            }
        }
        int cuts[] = new int[n];
        for (int i = 0; i < n; i++)
            cuts[i] = i;
        for (int i = 1; i < n; i++) {
            if (dp[0][i]){
                cuts[i] = 0;
                continue;
            }
            for (int j = 0; j < i; j++){
                if (dp[j+1][i] && cuts[j]+1 < cuts[i]) cuts[i] = cuts[j]+1;
            }
        }
        return cuts[n-1];
    }
}
