class Solution {
    List<List<Integer>> a=new ArrayList<>();
    void ans(int idx,int[] arr,ArrayList<Integer> al){
        if(idx>=arr.length){
            a.add(new ArrayList<>(al));
            return;
        }
        al.add(arr[idx]);
        ans(idx+1,arr,al);
        al.remove(al.size()-1);
        ans(idx+1,arr,al);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ans(0,nums,new ArrayList<>());
        return a;
    }
}