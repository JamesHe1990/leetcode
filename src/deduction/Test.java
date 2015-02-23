package deduction;

import java.util.ArrayList;

public class Test {
	public static void main (String args[]) {
		Triangle ti = new Triangle();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		ArrayList<Integer> d = new ArrayList<Integer>();
		a.add(2);
		b.add(3);b.add(4);
		c.add(6);c.add(5);c.add(7);
		d.add(4);d.add(1);d.add(8);d.add(3);
		ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
		triangle.add(a);triangle.add(b);triangle.add(c);triangle.add(d);
		int rst = ti.minimumTotal(triangle);
		System.out.println(rst);
	}
}
