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
        ListNode current=head;
        StringBuilder sb=new StringBuilder();
        while(current!=null){
            sb.append(String.valueOf(current.val));
            current=current.next;
        }
        if(sb.toString().equals(sb.reverse().toString())) return true;
        return false;
        
    }
}