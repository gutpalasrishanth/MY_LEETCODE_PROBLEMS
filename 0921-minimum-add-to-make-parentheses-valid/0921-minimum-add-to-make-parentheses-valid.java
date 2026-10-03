class Solution {
    public int minAddToMakeValid(String str) {
        int count=0;
        Stack<Character> s=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch=='('){
                count++;
                s.push(ch);
            }else{
                if(!s.isEmpty()&&s.peek()=='('){
                    s.pop();
                    count--;
                }else{
                    count++;
                }
            }
        }
        return Math.abs(count);
    }
}