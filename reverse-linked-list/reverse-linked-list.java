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
        ListNode dummy = head;
        ListNode newNode = null;
        List<Integer> list = new ArrayList<>();
        int i;

        while (dummy != null) {
            list.add(dummy.val);
            dummy = dummy.next;
        }
        if (list.size() > 0) {
            newNode = new ListNode();
            dummy = newNode;
        }
        for (i = list.size() - 1; i >= 0; i--) {
            dummy.val = list.get(i);
            if (i == 0)
                dummy.next = null;
            else
                dummy.next = new ListNode();
            dummy = dummy.next;
        }
        return newNode;
    }
}