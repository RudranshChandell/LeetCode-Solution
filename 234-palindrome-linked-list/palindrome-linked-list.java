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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        ListNode rev=null;

        while(fast!=null && fast.next!=null){
            ListNode temp=slow;

            slow=slow.next;
            fast=fast.next.next;

            temp.next=rev;
            rev=temp;            
        }

        if(fast!=null )slow=slow.next;

        while(rev!=null && slow!=null && rev.val==slow.val){
            slow=slow.next;
            rev=rev.next;
        }

        return slow==null;
    }
}