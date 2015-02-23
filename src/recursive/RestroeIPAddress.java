package recursive;

import java.util.ArrayList;

public class RestroeIPAddress {
	public ArrayList<String> restoreIpAddresses(String s) {
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> cur = new ArrayList<Integer>();
        restoreHelper(s, 0, rst, cur);
        return parseToString(rst);
    }
    public void restoreHelper(String s, int pos, ArrayList<ArrayList<Integer>>rst, ArrayList<Integer>cur) {
        if (pos == s.length() && cur.size() == 4) {
            rst.add(new ArrayList<Integer>(cur));
            return;
        }
        for (int i = 0; i < 3 && i+pos < s.length(); i++) {
            int num = Integer.parseInt(s.substring(pos,pos+i+1));
            if (num >= 0 && num <=255 && s.substring(pos,pos+i+1).equals(""+num)) {
                cur.add(num);
                restoreHelper(s,pos+i+1,rst,cur);
                cur.remove(cur.size()-1);
            }
        }
    }
    
    public ArrayList<String> parseToString(ArrayList<ArrayList<Integer>>rst) {
        ArrayList<String> strRst = new ArrayList<String>();
        for (ArrayList<Integer> ans : rst) {
            String ansStr = "";
            for (int num: ans){
                ansStr = ansStr + num + ".";
            }
            strRst.add(ansStr.substring(0,ansStr.length()-1));
        }
        return strRst;
    }
}
