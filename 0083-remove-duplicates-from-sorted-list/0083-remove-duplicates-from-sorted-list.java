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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp!=null){
            int d=temp.val;
            ListNode t=temp;
            while(t!=null && t.val==d){
                t=t.next;
            }
            temp.next=t;
            temp=temp.next;
        }
        return head;
    }
}