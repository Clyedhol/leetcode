package leetcode.algorithms;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){return l2;}
        if(l2 == null){return l1;}
        if(l1.val<l2.val){ MergeTwoList(l1,l2);return l1;}
        else{ MergeTwoList(l2,l1);return l2;}
        }
	public void MergeTwoList(ListNode listNodeTemp1, ListNode listNodeTemp2){
        while(listNodeTemp1 != null){
            if(listNodeTemp1.val <= listNodeTemp2.val && (listNodeTemp1.next == null||listNodeTemp1.next.val >= listNodeTemp2.val)){
                 ListNode temp1 = listNodeTemp1.next;
            	 listNodeTemp1.next = new ListNode(listNodeTemp2.val);
            	 listNodeTemp1.next.next = temp1;
            	 listNodeTemp1 = listNodeTemp1.next;
            	 listNodeTemp2 = listNodeTemp2.next;
            }else{
            	listNodeTemp1 = listNodeTemp1.next;
            }
            if(listNodeTemp2 == null){
                break;
            }
        }
	}
}
