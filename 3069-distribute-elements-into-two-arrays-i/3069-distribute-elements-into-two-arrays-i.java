class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        al1.add(nums[0]);
        al2.add(nums[1]);
        int p=1;
        int q=1;
        for(int i=2;i<nums.length;i++){
            if(al1.get(p-1)>al2.get(q-1)){
                al1.add(nums[i]);
                p++;
            }else{
                al2.add(nums[i]);
                q++;
            }
        }
        int[] arr=new int[nums.length];
        int k=0;
        for(int i=0;i<al1.size();i++){
            arr[k++]=al1.get(i);
        }
        for(int i=0;i<al2.size();i++){
            arr[k++]=al2.get(i);
        }
        return arr;
    }
}