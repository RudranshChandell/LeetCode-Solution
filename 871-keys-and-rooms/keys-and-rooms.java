class Solution {
    int[]vis;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int m=rooms.size();
        this.vis=new int[m];

        dfs(rooms,0);

        for(int i:vis){
            if(i==0) return false;
        }
        return true;
    }

    public void dfs(List<List<Integer>>rooms,int ind){
        vis[ind]=1;
        for(int i:rooms.get(ind)){
            if(vis[i]==0)
                dfs(rooms,i);
        }
    }
}