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
    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        int c =0;
        while(cur!=null){
           c+=1;
           cur=cur.next;
        }
        cur = head;
        for(int i=0;i<(c/2);i++){
             cur = cur.next;
        }
        return cur;
        
    }
}