class Solution {
    void ans(List<List<Integer>> rooms,boolean vis[],int idx){
        if(vis[idx]){
            return;
        }
        vis[idx]=true;
        for(int i:rooms.get(idx)){
            ans(rooms,vis,i);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean vis[]=new boolean[rooms.size()];
        if(rooms.size()==0){
            return true;
        }
        for(boolean b:vis){
            if(!b){
                ans(rooms,vis,0);
            }
        }
        for(boolean b:vis){
            if(!b){
                return false;
            }
        }
        return true;
    }
}