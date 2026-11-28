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
    int gcd(int a,int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        while(temp!=null&& temp.next!=null){
            int a=temp.val;
            int b=temp.next.val;
            ListNode n=new ListNode(gcd(a,b));
            n.next=temp.next;
            temp.next=n;
            temp=n.next;
        }
        return head;
    }
}