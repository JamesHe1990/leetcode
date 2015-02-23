package deduction;

import java.util.ArrayList;

public class Triangle {
	public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
		ArrayList<Integer> tmp = new ArrayList<Integer>(triangle.get(0));
		for (int i = 1; i < triangle.size(); i++) {
			int tmp0 = tmp.get(0);
			int tmp1 = tmp.get(tmp.size() - 1);
			int prev = tmp0;
			ArrayList<Integer> level = triangle.get(i);
			for (int j = 1; j < level.size() - 1; j++) {
				int newPre = tmp.get(j);
				tmp.set(j, Math.min(prev, tmp.get(j)) + level.get(j));
				prev = newPre;
			}
			tmp.set(0, tmp.get(0) + level.get(0));
			tmp.add(tmp1 + level.get(level.size() - 1));
		}
		int min = Integer.MAX_VALUE;
		for (int num : tmp)
			if (min > num)
				min = num;
		return min;
	}
}
