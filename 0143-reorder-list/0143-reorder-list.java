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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;

        while (fast.next!=null&&fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode rev=new ListNode(0);
        ListNode temp1=slow.next;
        ListNode ll=rev;

        slow.next=null;

        while (temp1!=null) {
            ll.next=new ListNode(temp1.val);
            ll=ll.next;
            temp1 =temp1.next;
        }

        rev = rev.next;

        ListNode curr=rev;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        rev=prev;

        ListNode first = head;
        ListNode second = rev;

        while (first != null && second != null) {
            ListNode next1 = first.next;
            ListNode next2 = second.next;

            first.next = second;
            second.next = next1;

            first = next1;
            second = next2;
        }
    }
}