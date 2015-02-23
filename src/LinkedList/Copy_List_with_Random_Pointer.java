package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class Copy_List_with_Random_Pointer {
	public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode cur = head;
        while(cur != null) {
            RandomListNode copy = new RandomListNode(cur.label);
            RandomListNode next = cur.next;
            cur.next = copy;
            copy.next = next;
            cur = next;
        }
        cur = head;
        while(cur != null){
            RandomListNode next = cur.next;
            if(cur.random != null) next.random = cur.random.next;
            else next.random = null;
            cur = next.next;
        }
        cur = head;
        RandomListNode rst = new RandomListNode(0);
        RandomListNode rstPtr = rst;
        while(cur != null){
            RandomListNode next = cur.next;
            rstPtr.next = next;
            rstPtr = rstPtr.next;
            cur.next = next.next;
            cur = cur.next;
        }
        Set<String> dict = new HashSet<String>();
//        for(String x :dict){
//        	
//        }
        return rst.next;
    }
	
	
}


