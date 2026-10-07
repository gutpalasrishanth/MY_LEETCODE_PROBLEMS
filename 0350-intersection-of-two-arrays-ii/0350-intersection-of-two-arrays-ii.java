class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> al=new ArrayList<>();
        while(i<nums1.length&&j<nums2.length){
            int a1=nums1[i];
            int a2=nums2[j];
            if(a1==a2){
                al.add(a1);
                i++;j++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        int arr[]=new int[al.size()];
        for(int p=0;p<al.size();p++){
            arr[p]=al.get(p);
        }
        return arr;
    }
}