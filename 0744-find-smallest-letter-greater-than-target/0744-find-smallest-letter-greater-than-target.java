class Solution {
    public char nextGreatestLetter(char[] l, char tar) {
        int len=l.length;
        if(l[len-1]<=tar)return l[0];
        int idx=0;
        int i=0;
        int j=l.length-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(l[mid]==tar){
                i=mid+1;
            }else if(tar>l[mid]){
                i=mid+1;
            }else{
                j=mid;
            }
        }
        return l[j];
    }
}