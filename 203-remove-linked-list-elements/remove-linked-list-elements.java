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
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans=new ListNode();
        ListNode newhead=ans;

        ListNode current=head;
        while(current!=null){
            if(current.val!=val){
                ans.next=new ListNode(current.val);
                ans=ans.next;
            }
            current=current.next;
        }
        return newhead.next;
    }
}