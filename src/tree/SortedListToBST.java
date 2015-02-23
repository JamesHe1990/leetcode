package tree;

public class SortedListToBST {
	ListNode cur;
    public TreeNode sortedListToBST(ListNode head) {
        int length = 0;
        ListNode tmp = head;
        while(tmp != null){
            length +=1;
            tmp = tmp.next;
        }
        cur = head;
        return getTree(0,length-1);
    }
    public TreeNode getTree(int start, int end){
        if(end < start) return null;
        int mid = start + (end-start)/2;
        TreeNode left = getTree(start, mid-1);
        TreeNode root = new TreeNode(cur.val);
        root.left = left;
        cur = cur.next;
        root.right = getTree(mid+1, end);
        return root;
    }
}
