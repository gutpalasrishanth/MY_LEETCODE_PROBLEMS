class Solution {
    public boolean doesAliceWin(String s) {
        int count=0;
        String str="aeiou";
        for(char ch:s.toCharArray()){
            if(str.indexOf(ch)!=-1){
                count++;
            }
        }
        return count>0;
    }
}