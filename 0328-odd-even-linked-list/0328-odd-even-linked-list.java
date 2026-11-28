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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null){
            return head;
        }
        ListNode last=head;
        while(last.next!=null){
            last=last.next;
        }
        ListNode l=last;
        ListNode temp=head;
        int i=0;
        while(temp.next!=l&&temp.next!=null){
            if(i%2==0){
               ListNode p=temp.next;
                temp.next=p.next;
                last.next=p;
                last=p;
                last.next=null;
            }else{
                temp=temp.next;
            }
            i++;
        }
        if(i%2==0 && temp.next==l){
            temp.next=l.next;
            last.next=l;
            l.next=null;
        }
        return head;
    }
}