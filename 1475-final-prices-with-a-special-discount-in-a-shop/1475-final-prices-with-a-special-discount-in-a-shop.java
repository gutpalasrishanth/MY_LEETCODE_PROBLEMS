class Solution {
    public int[] finalPrices(int[] prices) {
        int arr[]=new int[prices.length];
        Stack<Integer>s=new Stack<>();
        for(int i=prices.length-1;i>=0;i--){
            while(!s.isEmpty()&&prices[s.peek()]>prices[i]){
                s.pop();
            }
            if(s.isEmpty()){
                arr[i]=prices[i];
            }else{
                arr[i]=prices[i]-prices[s.peek()];
            }
            s.push(i);
        }
        return arr;
    }
}