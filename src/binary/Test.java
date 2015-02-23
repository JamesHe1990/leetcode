package binary;

public class Test {
	public static void main (String args[]) {
		SearchForRange bbt = new SearchForRange();
		int A[] = {1};
		int rst[] = bbt.searchRange(A, 1);
		System.out.println(rst);
//		System.out.println(bbt.searchRange(A, 4));
	}
}
