class Solution {
    public boolean checkValidString(String str) {
        int left=0;
        int right=0;

        for(char ch:str.toCharArray()){
            if(ch=='('){
                left++;
                right++;
            }else if(ch==')'){
                left--;
                right--;
            }else{
                left--;
                right++;
            }

            if(right<0){
                return false;
            }

            if(left<0){
                left=0;
            }
        }

        return left==0;
    }
}