class Solution {
    List<String> ans=new ArrayList<>();
    void ans(int ob,int cb,String str){
        if(ob<=0&&cb<=0){
            ans.add(new String(str));
            return;
        }
        if(ob>0){
            ans(ob-1,cb,str+'(');
        }
        if(cb>ob){
            ans(ob,cb-1,str+')');
        }
    }
    public List<String> generateParenthesis(int n) {
        ans(n,n,"");
        return ans;
    }
}