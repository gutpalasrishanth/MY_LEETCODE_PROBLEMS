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
        if(head==null||head.next==null||k==0){
            return head;
        }
        ListNode t=head;
        int size=0;
        while(t!=null){
            size++;
            t=t.next;
        }
        if(k==size||k%size==0){
            return head;
        }
        k=k%size;
        ListNode prev=null;
        t=head;
        while(k>0&&t!=null){
            k--;
            t=t.next;
        }
        ListNode tt=head;
        while(t!=null){
            prev=tt;
            t=t.next;
            tt=tt.next;
        }
        prev.next=null;
        ListNode h=head;
        head=tt;
        ListNode p=tt;
        while(p!=null&&p.next!=null){
            p=p.next;
        }
        if(p!=null)
        p.next=h;
        return tt;
    }
}