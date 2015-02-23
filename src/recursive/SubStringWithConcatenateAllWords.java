package recursive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubStringWithConcatenateAllWords {
	public List<Integer> findSubstring(String S, String[] L) {
        int totalLength = 0;
        for(int i = 0; i < L.length; i++){
            totalLength += L[i].length();
        }
        HashMap<String, Integer> hmp = new HashMap<String,Integer>();
        for(String x:L){
        	if (hmp.containsKey(x)){
        		hmp.put(x, hmp.get(x)+1);
        	}else{
                hmp.put(x, 1);
        	}
        }
        int eachLength = L[0].length();
        ArrayList<Integer> rst = new ArrayList<Integer>();
        if (L.length == 0 || totalLength > S.length()) return rst;
        for (int i = 0; i <= S.length()-L[0].length(); i++) {
            findSubHelper(i,i,eachLength,S,hmp,rst);
        }
        return rst;
    }
    public void findSubHelper(int start, int cur, int eachLength,String S, HashMap<String,Integer>hmp, List<Integer>rst){        
        if (hmp.keySet().size() == 0) {
            rst.add(start);
            return;
        }
        if (cur + eachLength > S.length()) return;
        if (hmp.containsKey(S.substring(cur, cur + eachLength))){
        	String tmp = S.substring(cur, cur + eachLength);
        	if (hmp.get(tmp) == 1) {
        		hmp.remove(tmp);
        	}else {
        		hmp.put(tmp, hmp.get(tmp)-1);
        	}
        	findSubHelper(start,cur+eachLength,eachLength,S,hmp,rst);
        	if (hmp.containsKey(tmp)){
        		hmp.put(tmp, hmp.get(tmp)+1);
        	} else {
        		hmp.put(tmp, 1);
        	}
        }
//        ArrayList<Integer> xx = new ArrayList<Integer>();
//        xx.indexOf(o)
    }
}
