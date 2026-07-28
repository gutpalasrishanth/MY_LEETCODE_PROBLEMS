class Solution {
    public int clumsy(int n) {
        if(n==1||n==2){
            return n;
        }
        Stack<Integer> s=new Stack<>();
        s.push(n--);
        int oper=0;
        while(n!=0){
            if(oper==0){
                s.push(s.pop()*n);
            }else if(oper==1){
                s.push(s.pop()/n);
            }else if(oper==2){
                s.push(n);
            }else if(oper==3){
                s.push(-n);
            }
            oper=(oper+1)%4;
            n--;
        }
        int ans=0;
        while(!s.isEmpty()){
            ans+=s.pop();
        }
        return ans;
    }
}