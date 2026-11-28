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
        ArrayList<Integer> al=new ArrayList<>();
        while(temp!=null){
            int k=temp.val;
            int c=0;
            while(temp!= null&& temp.val==k){
                c++;
                temp=temp.next;
            }
            if(c==1){
                al.add(k);
            }
        }
        int i=0;
        ListNode dum=new ListNode(-1);
        ListNode tt=dum;
        while(i<al.size()){
            ListNode tp=new ListNode(al.get(i));
            tt.next=tp;
            tt=tt.next;
            i++;
        }
        return dum.next;
    }
}