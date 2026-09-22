class Solution {
    public String decodeString(String s) {
        Stack<Integer> is = new Stack<>();
        Stack<String> ss = new Stack<>();
        String cur = "";
        int i = 0;
        while (i < s.length()) {
            char ch=s.charAt(i);
            if (ch>='0' && ch<='9') {
                int n=0;
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    n = n*10+(s.charAt(i)-'0');
                    i++;
                }
                is.push(n);
            }
            else if(ch=='[') {
                ss.push(cur);
                cur = "";
                i++;
            }
            else if(ch==']') {
                int itr=is.pop();
                String rep="";
                for (int j=0;j<itr;j++) {
                    rep+=cur;
                }
                cur=ss.pop()+rep;
                i++;
            }
            else {
                cur+=ch;
                i++;
            }
        }
        return cur;
    }
}