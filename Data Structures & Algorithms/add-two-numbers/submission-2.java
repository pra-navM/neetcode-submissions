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
        ListNode dummy = new ListNode();
        dummy = l1;
        ListNode endNode = new ListNode(0);
        //ListNode carry = new ListNode(1);
        int carry = 0;
        while(true){
            //System.out.println(carry);

            // add the numbers
            l1.val = l1.val+l2.val + carry;
            if(l1.val>9){
                l1.val-=10;
                carry=1;
            }
            else carry = 0;
            
            
            if(l1.next==null&&l2.next==null){
                System.out.println(carry);
                if(carry!=0){
                    endNode.val = carry; 
                    l1.next = endNode;
                }
                
                
                return dummy;
            }
            else if(l1.next==null){
                if(carry==1){
                    l1.next = new ListNode(1);
                    carry = 0;
                }
                else{
                    l1.next = new ListNode(0);
                }
            }
            else if(l2.next==null){
                if(carry==1){
                    l2.next = new ListNode(1);
                    carry = 0;
                }
                else{
                    l2.next = new ListNode(0);
                }
                
            }

            //set carry for next iteration
            

            l1 = l1.next;
            l2 = l2.next;
        }
        
    }
}
