package recursive;

import iterration.PopulateNextRightNode;
import iterration.TreeLinkNode;
import iterration.ValidParlindrom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

import queue.Word_Ladder;

/*
a 	b	d	g	h
		e
	c	f
	*/
public class Test {
	
	public static void main (String args[]) {
		TreeLinkNode a = new TreeLinkNode(1);
		TreeLinkNode b = new TreeLinkNode(2);
		TreeLinkNode c = new TreeLinkNode(3);
		a.left = b;
		a.right = c;
		
//		Permutation bbt = new Permutation();
////		int[] a  = {2,2,1,1};
//		System.out.println(bbt.permuteUnique(a));
		
		PermutationTwo x = new PermutationTwo();
		int board1[] = {0,1,0,0,9};
//		char board[][] = {board1,board1};
		String L[] = {"a","a"};
		int A[] = {1,2,3,4};
		int B[] = {-2,-1};
		//String xxx[] = {"a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"};
		HashSet<String>bbc = new HashSet<String>();
		bbc.add("a"); bbc.add("aa"); bbc.add("aaa");
		ArrayList rst  = x.permuteUnique(board1);
		System.out.println(rst);
	}
}
	
