class Solution {
    public int minAddToMakeValid(String str) {
        int count=0;
        Stack<Character> s=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch=='('){
                s.push(ch);
            }else{
                if(!s.isEmpty()&&s.peek()=='('){
                    s.pop();
                }else{
                    s.push(ch);
                }
            }
        }
        while(!s.isEmpty()){
            count++;
            s.pop();
        }
        return (count);
    }
}