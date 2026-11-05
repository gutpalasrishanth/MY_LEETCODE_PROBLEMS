class Solution {
    List<List<Integer>> a=new ArrayList<>();
    void ans(int[] arr,int idx,int tar,List<Integer> al){
        if(idx>=arr.length){
            return;
        }
        if(tar<0){
            return;
        }
        if(tar==0){
            a.add(new ArrayList<>(al));
            return;
        }
        al.add(arr[idx]);
        ans(arr,idx,tar-arr[idx],al);
        al.remove(al.size()-1);
        ans(arr,idx+1,tar,al);
    }
    public List<List<Integer>> combinationSum(int[] c, int target) {
        ans(c,0,target,new ArrayList<>());
        return a;
    }
}