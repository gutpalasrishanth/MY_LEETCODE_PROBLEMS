class Solution {
    public boolean checkString(String s) {
        int a=s.lastIndexOf('a');
        int b=s.indexOf('b');
        if(b==-1||a==-1){
            return true;
        }
        if(a>b){
            return false;
        }
        return true;
    }
}