class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> al=new ArrayList<>();
        int min=nums[0];
        int i=0;
        while(i<nums.length){
            if(nums[i]!=min){
                al.add(min);
                min++;
            }else{
                min++;
                i++;
            }
        }
        return al;
    }
}