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
        if(head==null || head.next==null){
            return head;
        }
        ListNode first=head;
        ListNode second=head;
        int size=1;
        while(first.next!=null){
            size++;
            first=first.next;
        }
        first=head;
        k=k%size;
        if(k==0){
            return head; 
        }
        for(int i=0;i<k;i++) { 
            first=first.next; 
        }
        while(first.next!=null){
            first=first.next;
            second=second.next;
        }
        ListNode newHead=second.next;
        second.next=null;
        first.next=head;
        return newHead;
    }
}