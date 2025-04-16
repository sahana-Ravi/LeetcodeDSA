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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null;
        ListNode cur = head;
        int l =0;
        while(cur!=null){
            l+=1;
            cur = cur.next;
        }
        cur = head;
        int i=0;
        if(l==1 && n==1){
            head=null;
        }
        while(cur!=null && cur.next!=null){
            if(i==(l-n)){
                if(prev==null){
                    head = cur.next;
                }
                else{
                prev.next = cur.next;
                }
                return head;
            }
            prev = cur;
            cur = cur.next;
            i+=1;
        }
        if(prev!=null && cur.next==null && i==(l-n)){
            prev.next = null;
        }
        return head;
    }
}