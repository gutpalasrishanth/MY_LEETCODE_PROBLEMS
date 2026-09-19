class Solution {
    public List<String> buildArray(int[] target, int n) {
       List<String> a=new ArrayList<>();
       int j=0;
       for(int i=1;i<=n&&j<target.length;i++){
            a.add("Push");
            if(i==target[j]){
                j++;
            }else{
                a.add("Pop");
            }
       }
       return a;
    }
}