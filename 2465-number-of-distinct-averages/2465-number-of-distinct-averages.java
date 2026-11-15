class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Double> h=new HashSet<>();
        Arrays.sort(nums);
        int j=nums.length-1;
        for(int i=0;i<(nums.length/2);i++){
            double avg=(nums[i]+nums[j])/2.0;
            if(!h.contains(avg)){
                h.add(avg);
            }
            j--;
        }
        return h.size();
    }
}