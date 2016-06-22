package leetcode.algorithms;

public class PalindromeLinkedList {public boolean isPalindrome(ListNode head) {
    if(head == null || head.next == null) return true;
    ListNode slow = head, fast = head;
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }
    ListNode newHead = reverse(slow, null);
    while(newHead != null){
        if(head.val != newHead.val) return false;
        head = head.next;
        newHead = newHead.next;
    }

    return newHead == null;
}
ListNode reverse(ListNode head, ListNode prev){
    if(head == null) return prev;
    ListNode next = head.next;
    head.next = prev;
    return reverse(next, head);
}}
