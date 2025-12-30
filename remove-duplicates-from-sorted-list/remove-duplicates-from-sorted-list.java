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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;
        ListNode slowly = head;
        ListNode fastly = head.next;

        while (fastly != null) {
            if (slowly.val == fastly.val) {
                if (fastly.next == null) {
                    slowly.next = null;
                    break;
                }
                slowly.next = fastly.next;
                fastly = fastly.next;
            } else {
                slowly = slowly.next;
                fastly = fastly.next;
            }
           
        }
        return head;
    }
}