package leetcode.algorithms;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
//链表翻转
public class ListNodeReverse {
	//
    public ListNode reverseListRec(ListNode head) {
    	if(head==null||head.next==null)return head;  
    	ListNode reHead = reverseList(head.next);  
        head.next.next=head;  
        head.next=null;  
        return reHead; 
    }
    public static ListNode reverseList(ListNode head){  
        if(head==null||head.next==null)return head;  
        ListNode pre=null;  
        ListNode nex=null;  
        while(head!=null){  
            nex=head.next;  
            head.next=pre;  
            pre=head;  
            head=nex;  
        }  
        return pre;  
    } 
}
