package leetcode.algorithms;

public class SwapNodesInPairs {
	public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){return head;}
        ListNode headtemp = head.next;
		ListNode temp = null;
		ListNode pre = null;
		while(head != null&&head.next != null){
		    if(pre != null){
		        pre.next = head.next;
		    }
			temp = head.next;
			head.next = temp.next;
			temp.next = head;
			pre = head;
			head = head.next;
		}
		return headtemp;
    }
}
