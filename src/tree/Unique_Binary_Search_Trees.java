package tree;

import java.util.ArrayList;

public class Unique_Binary_Search_Trees {
	public int numTrees(int n) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i=1; i<=n; i++) numbers.add(i);
        return recurNums(numbers);
    }
    public int recurNums(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) return 1;
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++){
            ArrayList<Integer> left = new ArrayList(numbers.subList(0, i));
            ArrayList<Integer> right = new ArrayList(numbers.subList(i+1, numbers.size()));
            sum += recurNums(left)*recurNums(right);
        }
        return sum;
    }
}
