package dp;

public class EditDistance {
	public int minDistance(String word1, String word2) {
        int leng1 = word1.length();
        int leng2 = word2.length();
        int dp[][] = new int[leng1+1][leng2+1];
        for (int i=0; i <= leng1; i++) {
            dp[i][0] = i;
        }
        for (int j =0; j <= leng2; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= leng1; i++) {
            for (int j = 1; j <= leng2; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
                }
            }
        }
        return dp[leng1][leng2];
        
        
    }
	
	public int minDistance1(String word1, String word2) {
        if (word1.equals(word2)) return 0;
        if(word1.length() == 0) return word2.length();
        if (word2.length() == 0) return word1.length();
        int lth1 = word1.length();
        int lth2 = word2.length();
        int dp[][] = new int[lth1][lth2];
        dp[0][0] = word1.charAt(0) == word2.charAt(0) ? 0 : 1;
        for (int i = 1; i < lth1; i++){
            dp[i][0] = word1.charAt(i) == word2.charAt(0) && dp[i-1][0] != i-1 ? dp[i-1][0] : dp[i-1][0]+1;
        }
        for (int i = 1; i < lth2; i++){
            dp[0][i] = word1.charAt(0) == word2.charAt(i) && dp[0][i-1] != i-1 ? dp[0][i-1] : dp[0][i-1]+1;
        }
        for (int i = 1; i < lth1; i++){
            for (int j = 1; j < lth2; j++){
                if (word1.charAt(i) == word2.charAt(j)){
                    dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1])+1);
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]) + 1;
                }
            }
        }
        // System.out.print(dp[lth1-1][lth2-1]);
        return dp[lth1-1][lth2-1];
    }
}
