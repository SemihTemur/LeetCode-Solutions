/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode dummy = head;
        List<ListNode> arrayList = new ArrayList<>();

        while(dummy!=null && dummy.next!=null){
            if(arrayList.contains(dummy)){
                return dummy;
            }
            arrayList.add(dummy);
            dummy = dummy.next; 
        }

        return null;

    }
}