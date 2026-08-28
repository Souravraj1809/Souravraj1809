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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       int pos = 1;
       ListNode t = head;
       ListNode before =null;
       if(head == null){
        return null;
       }
       if(left== right){
        return head;
       }
        while(pos < left ){
           before = t;
           t = t.next;
           pos++;
           continue;
        }
        int time = right - left + 1;
       ListNode curr = t;
       ListNode prev = null;
       for(int i=0; i<time;i++){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
       }
       
      t.next = curr;
      if(before == null){
      return prev;
      }
      before.next = prev;
      return head;
       
       
       
        
    }
}