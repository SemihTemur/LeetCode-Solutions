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
    public ListNode deleteMiddle(ListNode head) {
        int count = 0;
        ListNode dummy = head;

        while(dummy!=null){
            count++;
            dummy = dummy.next;
        }

        if(count==1)
            return null;

        int index = count / 2;
        int i = 0;

        dummy = head;

        while(dummy!=null){
            if(i==index-1)
                dummy.next = dummy.next.next;

            dummy = dummy.next;
            i++;
        }

        return head;
    }
}