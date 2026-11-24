class Solution {
    public int lastStoneWeight(int[] st) {
        //priority Queue
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<st.length;i++){
            q.add(st[i]);
        }
        while(q.size()>1){
            int n1=q.poll();
            int n2=q.poll();
            if(n1!=n2){
                n2=n1-n2;
                q.offer(n2);
            }
        }
        if(q.isEmpty()){
            return 0;
        }
        return q.poll();
    }
}