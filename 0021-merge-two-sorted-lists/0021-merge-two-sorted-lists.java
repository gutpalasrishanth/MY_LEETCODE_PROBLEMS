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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dum=new ListNode(-1);
        ListNode t=dum;
        ListNode temp1=list1;
        ListNode temp2=list2;
        while(temp1!=null && temp2!=null){
            if(temp1.val>temp2.val){
                ListNode tt=new ListNode(temp2.val);
                t.next=tt;
                temp2=temp2.next;
            }else{
                ListNode tt=new ListNode(temp1.val);
                t.next=tt;
                temp1=temp1.next;
            }
            t=t.next;
        }
        while(temp1!=null){
            ListNode tt=new ListNode(temp1.val);
            t.next=tt;
            temp1=temp1.next;
            t=t.next;
        }
        while(temp2!=null){
            ListNode tt=new ListNode(temp2.val);
            t.next=tt;
            temp2=temp2.next;
            t=t.next;
        }
        return dum.next;
    }
}