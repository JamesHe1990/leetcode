package LinkedList;

public class ReorderList {
	public void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return;
        ListNode fst = head;
        ListNode scnd = head;
        while(scnd != null && scnd.next != null){
            fst = fst.next;
            scnd = scnd.next.next;
        }
        ListNode cut1 = fst;
        ListNode cut2 = fst.next;
        ListNode cur = fst.next;
        while(cur != null && cur.next != null){
            ListNode nxt = cur.next;
            cur.next = fst;
            fst = cur;
            cur = nxt;
        }
        cut1.next = null;
        cut2.next = null;
        ListNode tmpHead = head;
        while(head != null && cur != null){
            ListNode tmp1 = head.next;
            ListNode tmp2 = cur.next;
            head.next = cur;
            cur.next = tmp1;
            head = tmp1;
            cur = tmp2;
        }
        head = tmpHead;
    }
}
