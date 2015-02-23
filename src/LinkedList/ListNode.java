package LinkedList;


public class ListNode {
	int val;
	public ListNode next;
	public ListNode(int x) { val = x; next = null; }
	ListNode(int array[]){
		if (array.length != 0) this.val = array[0];
		ListNode cur = this;
		for (int i = 1; i < array.length; i++) {
			cur.next = new ListNode(array[i]);
			cur = cur.next;
		}
	}
}