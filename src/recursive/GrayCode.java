package recursive;

import java.util.ArrayList;

public class GrayCode {
	public ArrayList<Integer> grayCode(int n) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		if (n < 1) return al;
		if (n == 1) {
			al.add(0);
			al.add(1);
			return al;
		} else {
			al = grayCode(n-1);
			int addNum = (int) Math.pow(2, n-1);
			int lth = al.size();
			for (int i = lth-1; i >= 0; i--) {
				al.add(al.get(i) + addNum);
			}
			return al;
		}		
	}
}
