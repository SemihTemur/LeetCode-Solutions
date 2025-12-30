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
        ListNode newHead = new ListNode();
        ListNode dummy = newHead;
        while(head!=null){
            if(val!=head.val){
                dummy.next = new ListNode(head.val);
                dummy = dummy.next;
            }
            head = head.next;
        }
       

        return newHead.next;
    }
}