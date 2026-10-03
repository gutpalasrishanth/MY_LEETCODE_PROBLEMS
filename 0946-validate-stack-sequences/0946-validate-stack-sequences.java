class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length!=popped.length){
            return false;
        }
        Stack<Integer> s=new Stack<>();
        int j=0;
        for(int i=0;i<pushed.length&&j<popped.length;i++){
            s.push(pushed[i]);
            if(!s.isEmpty()&&s.peek()==popped[j]){
                while(!s.isEmpty()&&j<popped.length&&s.peek()==popped[j]){
                    j++;
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }
}