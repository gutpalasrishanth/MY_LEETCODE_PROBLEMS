class Solution {
    List<List<Integer>> a=new ArrayList<>();
    public void ans(int[] arr,int idx,List<Integer> al){
        if(idx>=arr.length){
            a.add(new ArrayList<>(al));
            return;
        }
        al.add(arr[idx]);
        ans(arr,idx+1,al);
        al.remove(al.size()-1);
        ans(arr,idx+1,al);
    }
    public List<List<Integer>> subsets(int[] nums) {
        ans(nums,0,new ArrayList<Integer>());
        return a;
    }
}