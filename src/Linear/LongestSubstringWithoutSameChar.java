package Linear;

import java.util.HashMap;

public class LongestSubstringWithoutSameChar {
	public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
        int maxLength = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++){
            if (hm.containsKey(s.charAt(i))){
                maxLength = maxLength > (i-start) ? maxLength: i-start;
                for(int j = start; j < i; j++){
                    hm.remove(s.charAt(j));
                }
                start = hm.get(s.charAt(i))+1;
            } 
            hm.put(s.charAt(i),i);
        }
        maxLength = maxLength > (s.length()-start) ? maxLength: s.length()-start;
        return maxLength;
    }
}
