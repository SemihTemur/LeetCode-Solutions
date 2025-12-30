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
    public ListNode oddEvenList(ListNode head) {
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        int index = 1;

        while (head != null) {
            if (index % 2 == 0)
                evenNumbers.add(head.val);
            else
                oddNumbers.add(head.val);
            index++;
            head = head.next;
        }

        List<Integer> result = new ArrayList<>(oddNumbers);
        result.addAll(evenNumbers);

        ListNode node = null;
        ListNode temp = null;
        if (result.size() > 0) {
            node = new ListNode();
            temp = node;
        }

        int i = 0;
        for (i = 0; i < result.size(); i++) {
            if (i != result.size() - 1) {
                temp.val = result.get(i);
                temp.next = new ListNode();
            } else
                temp.val = result.get(i);
            temp = temp.next;
        }

        return node;
    }
}