class Solution {
    public String removeDuplicates(String str) {
        Stack<Character> s=new Stack<>();
        for(char ch:str.toCharArray()){
            if(!s.isEmpty()&&s.peek()==ch){
                s.pop();
            }else{
                s.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            sb.insert(0,s.pop());
        }
        return sb.toString();
    }
}