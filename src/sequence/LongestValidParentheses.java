package sequence;

public class LongestValidParentheses {
	public int longestValidParentheses(String s) {
        int cur = 0;
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                cur++;
            } else{
                cur--;
            }
            if(cur == 0) max = max > i-start+1 ? max: i-start+1;             
            if (cur < 0) {
            	cur = 0;
                start = i+1;  
            }
        }
        cur = 0;
        start = s.length()-1;
        for (int i = s.length()-1; i >=0 ; i--){
            if(s.charAt(i) == ')'){
                cur++;
            } else{
                cur--;
            }
            if(cur == 0) max = max > start-i+1 ? max: start-i+1;
            if (cur < 0) {
            	cur = 0;
                start = i-1;  
            }
        }
        return max;
    }
}
