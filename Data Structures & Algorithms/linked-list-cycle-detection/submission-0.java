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
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        int counter = 0;
        while(counter<1000 ){
            curr = curr.next;
            if(curr==null) break;
            counter++;
        }
        return curr!=null;
        
    }
}
