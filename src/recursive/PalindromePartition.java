package recursive;

import java.util.ArrayList;

public class PalindromePartition {
	 public ArrayList<ArrayList<String>> partition(String s) {
	        ArrayList<ArrayList<String>> rst = new ArrayList<ArrayList<String>>();
	        ArrayList<String> tmp = new ArrayList<String>();
	        partHelper(s,rst,tmp,0);
	        return rst;
	    }
	    public void partHelper(String s, ArrayList<ArrayList<String>>rst, ArrayList<String>tmp, int startPos){
	        if (startPos == s.length()){
	            rst.add(new ArrayList<String>(tmp));
	            return;
	        }
	        for (int i = startPos; i < s.length(); i++){
	            if (!isParlindrome(s.substring(startPos,i+1))) continue;
	            tmp.add(s.substring(startPos,i+1));
	            partHelper(s,rst,tmp,i+1);
	            tmp.remove(tmp.size()-1);
	        }
	    }
	    public boolean isParlindrome(String s){
	        int i = 0;
	        while(i < s.length()/2){
	            if (s.charAt(i) != s.charAt(s.length()-1-i)) return false;
	            i++;
	        }
	        return true;
	    }
}
