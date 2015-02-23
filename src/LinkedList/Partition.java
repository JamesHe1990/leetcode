package LinkedList;

public class Partition {
	 public ListNode partition(ListNode head, int x) {
	        ListNode fst = new ListNode(0);
	        ListNode fpoint = fst;
	        ListNode scd = new ListNode(0);
	        ListNode spoint = scd;
	        while(head != null){
	        	ListNode tmp = head.next;
	        	head.next = null;
	            if (head.val < x){
	                fpoint.next = head;
	                fpoint = fpoint.next;
	            } else{
	                spoint.next = head;
	                spoint = spoint.next;
	            }
	            head = tmp;
	        }
	        fpoint.next = scd.next;
	        return fst.next;
	    }
}
