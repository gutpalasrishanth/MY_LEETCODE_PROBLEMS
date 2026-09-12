class Solution {
    public String reverseVowels(String s) {
        String str="aeiouAEIOU";
        int i=0;
        int j=s.length()-1;
        char[] cc=s.toCharArray();
        while(i<j){
            while( i < j && str.indexOf(cc[i])==-1){
                i++;
            }
            while(i < j && str.indexOf(cc[j])==-1){
                j--;
            }
            char temp=cc[i];
            cc[i]=cc[j];
            cc[j]=temp;
            i++;
            j--;
        }
        return new String(cc);
    }
}