package leetcode.algorithms_middle;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
    	ListNode odd = head;
    	if(head == null||head.next == null) return odd;
    	ListNode init = new ListNode(head.val);
    	ListNode temp = init;
    	ListNode even = head.next;
    	while(odd.next != null){
    		odd = odd.next.next;
    		if(odd != null){
    		    init.next = new ListNode(odd.val);
    		    init = init.next;
    		}else break;
    	}
    	init.next = new ListNode(even.val);
    	init = init.next;
    	while(even.next != null){
    		even = even.next.next;
    		if(even != null){
    		    init.next = new ListNode(even.val);
    		    init = init.next;
    		}else break;
    	}
        return temp;
    }
}
