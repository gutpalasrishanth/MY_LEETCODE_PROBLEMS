class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> str=new ArrayList<>();
        int j=0;
        for(int i=1;i<=n && j<target.length;i++){
            str.add("Push");
            if(i==target[j]){
                j++;
            }else{
                str.add("Pop");
            }
        }
        return str;
    }
}