class Solution {
    public boolean isValid(String str) {
        Stack<Character> s=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch=='('||ch=='['||ch=='{'){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if(ch==')'&&s.peek()!='('||ch==']'&&s.peek()!='['||ch=='}'&&s.peek()!='{'){
                    return false;
                }
                s.pop();
            }
        }
        return s.isEmpty();
    }
}