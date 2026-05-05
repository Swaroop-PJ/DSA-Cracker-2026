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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
         int length=0;
        ListNode ptr=head;
        while(ptr!=null){
            length++;
            ptr=ptr.next;
        }
        ListNode slow,fast;
        slow=fast=head;
        int inc;
        if((inc=k%length)==0) return head;
        while(fast!=null&&inc>0){
            fast=fast.next;
            inc--;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode tmp=head;
        head=slow.next;
        slow.next=null;
        fast.next=tmp;
        return head;

        
    }
}