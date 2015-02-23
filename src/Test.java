

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

import queue.Word_Ladder;
import recursive.NQueens;

/*
a 	b	d	g	h
		e
	c	f
	*/
public class Test {
	public static void main (String args[]) {
//		int x[] = new int[5];
//		PascaTriangle ed =  new PascaTriangle();
//		Interval a = new Interval(1,4);
//		Interval b = new Interval(5,6);
//		ArrayList<Interval> xx = new ArrayList<Interval>();
//		xx.add(a);
//		xx.add(b);
//		int a[] = {7,8,0,1,2};
//		int c[][] = {a};
//		Arrays.sort(a);
//		ArrayList<String[]> rst = ed.solveNQueens(4);
		
		HashMap<ArrayList<Integer>, Integer> hm = new HashMap<ArrayList<Integer>,Integer>();
		HashSet<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();
		Node x = new Node(2);
		Node y = new Node(3);
		Node z = new Node(2);
//		hs.add(x);
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(2);
//		int b[] = {1,2};
		hm.put(a,2);
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(hm.containsKey(b));
//		System.out.println(hs.contains(z));
		
//		List rst = ed.generate(5);
//		System.out.println(rst);
	}
}

class Node{
	int num;
	public Node(int n){
		this.num = n;
	}
	@Override
	public int hashCode(){
		return num;
	}
	
	@Override
	public boolean equals(Object n1){
		return this.hashCode() == n1.hashCode();
	}
}
	
