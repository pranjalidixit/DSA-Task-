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
    public ListNode reverseList(ListNode head) {
        ListNode a = new ListNode();
        ListNode b = head;
        while(b != null){
            ListNode next = b.next;
            b.next = a.next;
            a.next = b;
            b = next;
        }
        return a.next;
    }
}