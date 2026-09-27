class Solution {
    public String reverseParentheses(String str) {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==')'){
                StringBuilder ss=new StringBuilder("");
                while(s.peek()!='('){
                    ss.append(s.pop());
                }
                s.pop();
                for(int j=0;j<ss.length();j++){
                    s.push(ss.charAt(j));
                }
            }else{
                s.push(ch);
            }
        }
        StringBuilder ss=new StringBuilder("");
        while(!s.isEmpty()){
            ss.insert(0,s.pop());
        }
        return ss.toString();
    }
}