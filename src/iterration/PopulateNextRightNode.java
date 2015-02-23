package iterration;

public class PopulateNextRightNode {
	public void connect(TreeLinkNode root) {
        TreeLinkNode head = root;
        TreeLinkNode cur = root;
        boolean flag = true;
        while (flag) {
            TreeLinkNode nextHead=null;
            TreeLinkNode first=null;
            
            while(cur != null) {
                if (cur.left != null && cur.right != null) {
                    if (nextHead == null) nextHead = cur.left;
                    cur.left.next = cur.right;
                    if (first != null) first.next = cur.left;
                    first = cur.right;
                } else if (cur.left != null) {
                    if (nextHead == null) nextHead = cur.left;
                    if (first != null) first.next = cur.left;
                    first = cur.left;
                } else if (cur.right != null) {
                    if (nextHead == null) nextHead = cur.right;
                    if (first != null) first.next = cur.right;
                    first = cur.right;
                }
                cur = cur.next;
            }
            if (first != null) first.next = null;
            if (nextHead == null) {
                flag = false;
            } else {
                flag = true;
                cur = nextHead;
            }
        }
    }
	
	public void connect1(TreeLinkNode root) {
        TreeLinkNode nextHead = root;
        TreeLinkNode cur = root;
        while(nextHead != null) {
            nextHead = null;
            TreeLinkNode first = null;
            while (cur != null) {
                if (cur.left != null) {
                    nextHead = nextHead == null ? cur.left : nextHead;
                    if (first != null) {
                        first.next = cur.left;
                        first = first.next;
                    } else {
                    	first = cur.left;
                    }
                }
                if (cur.right != null) {
                    nextHead = nextHead == null ? cur.right : nextHead;
                    if (first != null) {
                        first.next = cur.right;
                        first = first.next;
                    } else {
                    	first = cur.right;
                    }
                }
                cur = cur.next;
            }
            cur = nextHead;
        }
    }
}
