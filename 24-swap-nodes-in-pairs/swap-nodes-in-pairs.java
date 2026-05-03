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
        if(head==null||head.next==null) return head;
        ListNode ptr=head,pre=null;;
        head=head.next;
        while(ptr!=null&&ptr.next!=null){
            ListNode tmp=ptr.next;
            ptr.next=tmp.next;
            if(pre!=null) pre.next=tmp;
            tmp.next=ptr;
            pre=ptr;
            ptr=ptr.next;
        }
        return head;

        
    }
}