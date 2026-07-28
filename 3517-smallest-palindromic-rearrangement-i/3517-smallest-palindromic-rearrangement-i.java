class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        int[] arr=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        int i=0;
        int j=s.length()-1;
        int mid=(i+j)/2;
        char[] strs=new char[s.length()];
        for(int k=0;k<arr.length;k++){
            if(arr[k]==0){
                continue;
            }else{
                if(arr[k]%2!=0){
                    strs[mid]=(char)(k+'a');
                    arr[k]--;
                }
                while(arr[k]>0){
                    strs[i++]=(char)(k+'a');
                    strs[j--]=(char)(k+'a');
                    arr[k]-=2;
                }
            }
        }
        return new String(strs);
    }
}