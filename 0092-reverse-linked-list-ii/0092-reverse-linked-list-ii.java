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
        if(left==right){
            return head;
        }
        ListNode curr=head;
        ListNode p=null;
        int pos=1;
        while(pos<left){
            p=curr;
            pos++;
            curr=curr.next;
        }
        ListNode st=curr;
        ListNode prev=null;
        ListNode next;
        while(pos<=right){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            pos++;
        }
        st.next=curr;
        if(p==null){
            head=prev;
        }else{
            p.next=prev;
        }

        return head;
    }
}