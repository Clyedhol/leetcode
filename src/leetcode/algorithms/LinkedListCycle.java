package leetcode.algorithms;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        ListNode head1 = head;
        ListNode head2 = head;
        while(head1 != null&&head1.next != null){
        	if(head1.next == head2.next.next){
        		return true;
        	}else{
        		head1 = head1.next;
        		head2 = head2.next.next;
        	}
        }
		return false;
    }
}
