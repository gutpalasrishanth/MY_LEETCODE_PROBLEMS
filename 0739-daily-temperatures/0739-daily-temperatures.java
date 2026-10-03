class Solution {
    public int[] dailyTemperatures(int[] temps) {
        Stack<Integer> s=new Stack<>();
        int[] arr=new int[temps.length];
        for(int i=temps.length-1;i>=0;i--){
            while(!s.isEmpty()&&temps[s.peek()]<=temps[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                arr[i]=s.peek()-i;
            }
            s.push(i);
        }
        return arr;
    }
}