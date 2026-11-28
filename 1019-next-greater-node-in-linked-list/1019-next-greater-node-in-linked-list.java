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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int[] arr=new int[size];
        temp=head;
        int k=0;
        while(temp!=null){
            arr[k++]=temp.val;
            temp=temp.next;
        }
        Stack<Integer> s=new Stack<>();
        int[] ans=new int[size];
        for(int i=size-1;i>=0;i--){
            while(!s.isEmpty()&&arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=0;
            }else{
                ans[i]=arr[s.peek()];
            }
            s.push(i);
        }
        return ans;
    }
}