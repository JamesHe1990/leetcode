package LinkedList;


import java.util.ArrayList;
import java.util.Arrays;
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
		ReorderList ed =  new ReorderList();
		int a[] = {1,2,3,4,5};
		ListNode root = new ListNode(a);
		
//		int a[] = {7,8,0,1,2};
//		int c[][] = {a};
//		Arrays.sort(a);
//		ArrayList<String[]> rst = ed.solveNQueens(4);
		RandomListNode l = new RandomListNode(-1);
		RandomListNode l1 = new RandomListNode(1);
		l.next = l1;
		String x = "123";
		String y = x.substring(0,1);
		ed.reorderList(root);
		printList(root);
	}
	
	
	public static void printList(ListNode a){
		while (a != null){
			System.out.print(a.val + " -> ");
			a = a.next;
		}
		System.out.print("null");
	}
}
	
