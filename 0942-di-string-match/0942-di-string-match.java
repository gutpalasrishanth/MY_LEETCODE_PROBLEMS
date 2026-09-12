class Solution {
    public int[] diStringMatch(String s) {
        int i=0;
        int j=s.length()-1;
        int perm[]=new int[s.length()+1];
        int k=0;
        for(char ch:s.toCharArray()){
            if(ch=='I'){
                perm[k]=i;
                i++;k++;
            }else{
                perm[k]=j+1;
                j--;k++;
            }
        }
        perm[k]=i;
        return perm;
    }
}