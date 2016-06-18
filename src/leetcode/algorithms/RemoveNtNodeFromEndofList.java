package leetcode.algorithms;

import java.util.LinkedList;

public class RemoveNtNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(head.next == null) return null;
		LinkedList<ListNode> ln = new LinkedList<ListNode>();
        while(head != null){
        	ln.addFirst(head);
        	head = head.next;
        }
        if(n != 1){
        	while(n != 0){
            	head = ln.pollFirst();
            	n--;
            }
            head.val = head.next.val;
            head.next = head.next.next;
            if(ln.isEmpty()) return head;
            return ln.peekLast();
        }
        n++;
        while(n!=0){
        	head = ln.pollFirst();
        	n--;
        }
        head.next = null;
        if(ln.isEmpty()) return head;
        return ln.peekLast();
    }
	
	public ListNode removeNthFromEnd2(ListNode head, int n) {
		if(head.next == null) return null;
		ListNode ln1 = head;
		ListNode ln2 = head;
		while(n != 0){
			ln2 = ln2.next;
			n--;
		}
		if(n != 1){
			while(ln2 != null){
				ln1 = ln1.next;
				ln2 = ln2.next;
			}
			ln1.val = ln1.next.val;
			ln1.next = ln1.next.next;
		}else{
			while(ln2.next != null){
				ln1 = ln1.next;
				ln2 = ln2.next;
			}
			ln1.next = null;
		}
		return head;
	}
}
