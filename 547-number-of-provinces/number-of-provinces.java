class Solution {
    public int findCircleNum(int[][] isConnected) {
        int m=isConnected.length;
        int n=isConnected[0].length;
        List<List<Integer>>list=new ArrayList<>();
        
        for(int i=0;i<m;i++){
            list.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j) continue;
                if(isConnected[i][j]==1){
                    list.get(i).add(j);
                }
            }
        }

        boolean [] vis=new boolean[m];
        int count=0;

        for(int i=0;i<m;i++){
            if(!vis[i]){
                count++;
                dfs(i,vis,list);
            }
        }

        return count;
    }

    public void dfs(int ind,boolean []vis,List<List<Integer>>list){
        vis[ind]=true;
        for(int i:list.get(ind)){
            if(vis[i]==false){
                dfs(i,vis,list);
            }
        }
    }
}