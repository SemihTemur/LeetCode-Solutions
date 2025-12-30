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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode dummy = head;
        int carry = 0;

        while (l1 != null && l2 != null) {
            int value = l1.val + l2.val + carry;
            if (value > 9)
                carry = 1;
            else
                carry = 0;
            dummy.val = value % 10;
            l1 = l1.next;
            l2 = l2.next;
            if (l1 != null || l2 != null || carry==1) {
                dummy.next = new ListNode();
                dummy = dummy.next;
            }
        }

        while (l1 != null) {
            int value = l1.val + carry;
            if (value > 9)
                carry = 1;
            else
                carry = 0;
            dummy.val = value % 10;
            l1 = l1.next;
            if(l1!=null || carry==1){
            dummy.next = new ListNode();
            dummy = dummy.next;
            }
        }

        while (l2 != null) {
            int value = l2.val + carry;
            if (value > 9)
                carry = 1;
            else
                carry = 0;
            dummy.val = value % 10;
            l2 = l2.next;
            if(l2!=null || carry==1){
                dummy.next = new ListNode();
                dummy = dummy.next;
            }
        }
        if (carry == 1)
            dummy.val = carry;

        return head;
    }
}