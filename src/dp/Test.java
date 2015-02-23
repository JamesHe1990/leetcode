package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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
//		ArrayList<Integer> x = new ArrayList();
//		x.add(0);
//		for (int i = 0; i < x.size();i++){
//			x.add(i+1);
//		}
//		System.out.println(x);
		PalindromePartitionTwo ed =  new PalindromePartitionTwo();
		char board[][] = new char[1][2];
		board[0][0] = 'a';board[0][1] = 'a';
		int flag = ed.minCut("bba");
		System.out.println(flag);
//		int a[] = {2,100,2,2,2,2};
//		int b[] = {1,1};
//		int c[][] = {a};
////		Arrays.sort(a);
////		ArrayList<String[]> rst = ed.solveNQueens(4);
//		String x1 = "u";
//		String x2 = "uuuuuuuu";
//		HashSet<String> dict = new HashSet<String>();
//		dict.add("aa");dict.add("aaaa");
//		
//		System.out.println(ed.minDistance(x2, x1));
	}
}
	
