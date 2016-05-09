package leetcode.algorithms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		Set<Integer> s4Nodes = new HashSet<Integer>();
		ListNode headtemp = head;
		s4Nodes.add(headtemp.val);
		while(headtemp != null){
			if(headtemp.next !=null){
				if(s4Nodes.contains(headtemp.next.val)){
					headtemp.next = headtemp.next.next;
				}else{
					headtemp = headtemp.next;
					s4Nodes.add(headtemp.val);
				}
			}
		}
        return head;
    }
}
