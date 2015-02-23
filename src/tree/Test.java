package tree;

import java.util.ArrayList;
import java.util.HashSet;
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
	TreeNode aa = new TreeNode(2);
	
	public static void main (String args[]) {
		
		ArrayList<Integer> yy = new ArrayList<Integer>();
//		yy.add(1);yy.add(3);
//		yy.add(5); yy.add(7);
//		for (int i = 0; i< yy.size();i++){
//			yy.remove(i);
//		}
		String aa = "aa";
		String bb = "aa";
		boolean xx = (aa == bb);
		TreeNode a = new TreeNode(0);
		TreeNode b = new TreeNode(1);
		TreeNode c = new TreeNode(2);
		TreeNode d = new TreeNode(3);
		TreeNode e = new TreeNode(4);
		TreeNode f = new TreeNode(5);
		TreeNode g = new TreeNode(6);
		TreeNode h = new TreeNode(7);
//		a.left = b;
//		a.right = c;
//		b.left = d;
//		b.right = e;
//		c.left = f;
//		d.left = g;
//		g.left = h;
		e.left = c;
		e.right = g;
		c.left = b;
		c.right = d;
		g.left = f;
		g.right = h;
		d.val = 2;
		c.val = 3;
		Recover_Binary_Search_Tree bbt = new Recover_Binary_Search_Tree();
		Set<String> dict = new HashSet<String>();
		dict.add("a");dict.add("b");dict.add("c");
		bbt.recoverTree(e);
		System.out.print("");
//		TreeNode nn = null;
//		addOne(nn);
	}
	public static void addOne(TreeNode x){
		x = x.left;
	}
}
	
