package leetcode.algorithms;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Set<Integer> ln = new HashSet<Integer>();
		while(headA != null && headB != null){
			if(ln.add(headA.val)) headA = headA.next;
			else return headA;
			if(ln.add(headB.val)) headB = headB.next;
			else return headB;
		}
		while(headA != null) {
			if(ln.add(headA.val))
				headA = headA.next;
			else return headA;
		}
		while(headB != null) {
			if(ln.add(headB.val))
				headB = headB.next;
			else return headB;
		}
		return null;
    }
}
