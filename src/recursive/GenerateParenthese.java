package recursive;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthese { // space O(n), time O(2^n)
	public ArrayList<String> generateParenthesis(int n) {
		ArrayList<String> rst = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		generateHelper(rst,sb,n,n);
		return rst;
	}
	public void generateHelper(ArrayList<String>rst, StringBuilder sb, int front, int back){
		if (front == 0 && back == 0) rst.add(sb.toString());
		if(front < 0 || back < 0 || front > back) return;
		sb.append('(');
		generateHelper(rst,sb,front-1,back);
		sb.replace(sb.length()-1, sb.length(), ")");
		generateHelper(rst,sb,front,back-1);
		sb.delete(sb.length()-1, sb.length());
	}
}
