class Solution {
    List<List<Integer>> a=new ArrayList<>();
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void ans(int idx,int[] nums){
        if(idx==nums.length){
            ArrayList<Integer> al = new ArrayList<>();
            for(int i: nums) al.add(i);
            a.add(al);
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,idx,i);
            ans(idx+1,nums);
            swap(nums,idx,i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        ans(0,nums);
        return a;
    }
}