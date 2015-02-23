package Linear;

import java.util.ArrayList;

public class Test {
	public static void main(String args[]){
		FourSum ll = new FourSum();
		int num[] = {-1,0,-5,-2,-2,-4,0,1,-2};
		ArrayList<ArrayList<Integer>> rst = ll.fourSum(num, -9);
		System.out.print(rst);
	}
}

