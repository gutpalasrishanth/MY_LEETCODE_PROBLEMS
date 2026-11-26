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
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode p=null;
        while(fast!=null&&fast.next!=null){
            p=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=slow;
        p.next=null;
        ListNode curr=head2;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head2=prev;
        while(head!=null && head2!=null){
            if(head.val!=head2.val){
                return false;
            }
            head=head.next;
            head2=head2.next;
        }
        // if(head!=null||head2!=null){
        //     return false;
        // }
        return true;
    }
}