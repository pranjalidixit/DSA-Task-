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
        ListNode a = new ListNode(-1,head);
        ListNode b = a;
        while(b.next != null){
            if(b.next.val != val){
                b = b.next;
            }
            else{
                b.next=b.next.next;
            }
        }
        return a.next;
    }
}