/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode current=head;
        while(current!=null) {
            len++;
            current=current.next;
        }
        n=len-n+1;
        if(n==1) return head.next;
        current=head;
        int count=1;
        while(count!=n-1){
            current=current.next;
            count++;
        }
        current.next=current.next.next;
        return head;
    }
}