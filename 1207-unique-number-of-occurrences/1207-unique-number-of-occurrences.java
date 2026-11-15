class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        int i=0;
        while(i<arr.length){
            int n=arr[i];
            int c=0;
            while(i<arr.length && arr[i]==n){
                i++;
                c++;
            }
            if(!set.add(c)){
                return false;
            }
        }
        return true;
    }
}