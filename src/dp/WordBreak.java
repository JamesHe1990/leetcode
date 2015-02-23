package dp;

import java.util.Set;

public class WordBreak {
	public boolean wordBreak(String s, Set<String> dict) {
        boolean dp[] = new boolean[s.length()+1];
        dp[0] = true;
        for(int i = 0; i < s.length(); i++){
            for (int j = 0; j <= i; j++){
                if(dict.contains(s.substring(j,i+1))){
                    dp[i+1] = dp[j+1];
                    if (dp[i+1] == true)break;
                } 
            }
        }
        return dp[s.length()];
    }
	
	
	
}
