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
    public boolean isPalindrome(ListNode head) {
        List<Integer> arrayList = new ArrayList<>();
        int i;
        ListNode dummy = head;
        while(dummy!=null){
            arrayList.add(dummy.val);
            dummy = dummy.next;
        }
        
        int j = arrayList.size()-1;
        for(i=0;i<arrayList.size();i++){
            if(arrayList.get(i)!=arrayList.get(j))
                return false;
            j--;
        }
        return true;
    }
}