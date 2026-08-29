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
    void reverse(ListNode node,int times){
        ListNode curr = node;
        ListNode prev = null;
        for(int i=0;i<times;i++){
            ListNode store = curr.next;
            curr.next = prev;
            prev  = curr;
            curr = store;
        }
        return;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1){
            return head;
        }
        ListNode left = head;
        ListNode prevleft = null;
        ListNode nextleft = null;
        ListNode res = null;
        ListNode right;
        while(true){
            right = left;
            for(int i=0;i<k-1;i++){
                if(right == null){
                 break;
                }
                right = right.next;
            }
            if(right != null){
              nextleft = right.next;
              reverse(left,k);
              if(prevleft != null){
                prevleft.next = right;
              }
              if(res == null){
                res = right;
              }
              prevleft = left;
              left.next = nextleft;
              left = nextleft;
            }
            else{
            
                    prevleft.next = left;
                break;
            }
        }
        return res;

    }
}