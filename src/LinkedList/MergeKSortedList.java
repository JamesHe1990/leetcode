package LinkedList;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedList {
	public ListNode mergeKLists(List<ListNode> lists) {
        if (lists.size() == 0) return null;
        Comparator<ListNode> comp = new Comparator<ListNode>(){
        	public int compare(ListNode nd1, ListNode nd2){
        		if (nd1 == null || nd2 == null) return 0;
        		return Integer.compare(nd2.val, nd1.val);
        	}
        };
        ListNode dummy = new ListNode(0);
        PriorityQueue<ListNode> que = new PriorityQueue<ListNode> (lists.size(), comp);
        ListNode cur = dummy;
        for (int i = 0; i < lists.size(); i++){
        	if (lists.get(i) != null) que.add(lists.get(i));
        }
        while(que.size() != 0){
        	ListNode small = que.poll();
        	cur.next = small;
        	cur = cur.next;
        	if (small != null && small.next != null) que.add(small.next);      	
        }
        return dummy.next;
    }
}
