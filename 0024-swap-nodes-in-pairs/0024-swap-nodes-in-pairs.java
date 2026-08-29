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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode prevleft = null;
        ListNode left = head;
        ListNode right = left.next;
        ListNode newhead = head.next;
        
        
        while(right!= null){
            ListNode nextleft = right.next;
                right.next = left;
                if(prevleft!= null){
                prevleft.next = right;
                }
               
                prevleft = left;
                left = nextleft; 
                if(left != null){
                  right = left.next;   
                }
                else{
                    right = null;
                }
            
        }
        if(right == null){
            prevleft.next = left;
        }
        return newhead;
        
    }
}