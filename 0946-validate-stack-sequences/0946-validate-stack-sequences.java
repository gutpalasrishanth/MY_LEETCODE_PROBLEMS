class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length!=popped.length){
            return false;
        }
        Stack<Integer> s=new Stack<>();
        int k=0;
        for(int i=0;i<pushed.length;i++){
            s.push(pushed[i]);
            while(!s.isEmpty()&&s.peek()==popped[k]){
                s.pop();
                k++;
            }
        }
        while(!s.isEmpty()){
            if(s.peek()!=popped[k++]){
                return false;
            }
            s.pop();
        }
        return true;
    }
}