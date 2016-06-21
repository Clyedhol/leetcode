package leetcode.algorithms;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
    	if(head == null) return null;
    	ListNode temp = head;
    	ListNode prehead = null;
    	while(head.next != null){
    		if(head.val == val){
    			head.val = head.next.val;
    			head.next = head.next.next;
    		}else{
    			prehead = head;
    			head = head.next;
    		}
    	}
    	if(head.val == val && prehead == null) return null;
    	if(head.val != val && prehead == null) return temp;
    	if(head.val == val && prehead != null) prehead.next = null;
        return temp;
    }
    
}
