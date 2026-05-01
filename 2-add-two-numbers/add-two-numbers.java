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
        ListNode dummyNode=new ListNode(-1,null);
        ListNode l3=dummyNode;
        int carry=0;int sum=-1;
        while(l1!=null||l2!=null){
            if(l1!=null&&l2!=null){
                sum=(l1.val+l2.val+carry)%10;
                carry=(l1.val+l2.val+carry)/10;
            }
            else if(l1==null){
                sum=(l2.val+carry)%10;
                carry=(l2.val+carry)/10;
                
            }
            else{
                sum=(l1.val+carry)%10;
                carry=(l1.val+carry)/10;

            }
            l3.next=new ListNode(sum,null);
            l3=l3.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next; 
            
        }
        if(carry!=0) l3.next=new ListNode(carry,null);
        return dummyNode.next;
    }
}