class Solution {
    public int minMovesToMakePalindrome(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        int ans1=0;

        while(i<j){
            int p=j;
            while(p>i&&arr[i]!=arr[p]){
                p--;
            }
            if(i==p) {
                char ch=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=ch;
                ans1++;
            }else{
                for(int k=p;k<j;k++){
                    char ch=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=ch;
                    ans1++;
                }
                i++;
                j--;
            }
        }
        return ans1;
    }
}