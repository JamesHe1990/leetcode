package LinkedList;


public class ReverseNodesinKGroup {
	 public ListNode reverseKGroup(ListNode head, int k) {
	        ListNode dummy = new ListNode(0);
	        dummy.next = head;
	        ListNode front = dummy;
	        ListNode cur = dummy.next;
	        int index = -1;
	        while(cur.next != null) {
	           ListNode next = cur.next;
	           index++;
	           if (index % k == 0 ) {
	        	   if (index == 0) continue;
	               front = cur;
	               cur = next;
	           }else {
	              cur.next = next.next;
	              next.next = front.next;
	              front.next = next;
	           }
	        }
	        return dummy.next;
	    }
}
