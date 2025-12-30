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
    public ListNode middleNode(ListNode head) {
        ListNode dummy = head;
        ListNode middleNode = head;
        int count = -1;

        while (dummy != null) {
            count++;
            dummy = dummy.next;
        }

        int middlePoint = count % 2 == 0 ? count / 2 : count / 2 + 1;
        count = -1;

        while (middleNode != null) {
            count++;
            if (middlePoint == count)
                return middleNode;
            middleNode = middleNode.next;
        }

        return middleNode;
    }
}