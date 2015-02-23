package Linear;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
	public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < num.length-3; i++){
        	if (i > 0 && num[i] == num[i-1]) continue;
            for (int j = i+1; j < num.length-2; j++){
            	if (j > i+1 && num[j] == num[j-1]) continue;
                int tmpTarget = target - num[i] - num[j];
                int start = j+1;
                int end = num.length-1;
                while(start < end){
                    if (tmpTarget == num[start] + num[end]){
                        ArrayList<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(num[i]);
                        tmp.add(num[j]);
                        tmp.add(num[start]);
                        tmp.add(num[end]);
                        rst.add(tmp);
                        do{start++;}
                        while(start < num.length-1 && num[start-1] == num[start]);
                        do{end--;}    
                        while(end >1 && num[end] == num[end+1]);
                    } else if(tmpTarget > num[start] + num[end]){
                    	do{start++;}
                        while(start < num.length-1 && num[start-1] == num[start]);
                    } else {
                    	do{end--;}    
                        while(end >1 && num[end] == num[end+1]);
                    }
                }
            }
        }
        return rst;
    }
}
