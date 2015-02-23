package iterration;

import java.util.ArrayList;

public class ValidParlindrom {
	public boolean isPalindrome(String s) {
        ArrayList<Character> str = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <='Z') str.add(s.charAt(i));  
        }
        for (int i = 0; i <str.size()/2; i++){
            if (Character.toLowerCase(str.get(i))!=Character.toLowerCase(str.get(str.size()-1-i))) return false;
        }
        return true;
    }
}
