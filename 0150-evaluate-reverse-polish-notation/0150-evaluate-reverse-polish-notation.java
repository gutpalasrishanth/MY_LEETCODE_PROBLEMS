class Solution {
    public int evalRPN(String[] t) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<t.length;i++){
            String str=t[i];
            if(str.equals("+")){
                int a=s.pop();
                int b=s.pop();
                s.push(b+a);
            }else if(str.equals("-")){
                int a=s.pop();
                int b=s.pop();
                s.push(b-a);
            }else if(str.equals("*")){
                int a=s.pop();
                int b=s.pop();
                s.push(b*a);
            }else if(str.equals("/")){
                int a=s.pop();
                int b=s.pop();
                s.push(b/a);
            }else{
                s.push((int)Integer.parseInt(str));
            }
        }
        return s.pop();
    }
}