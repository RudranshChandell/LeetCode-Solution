class Solution {
    int m;
    int n;
    public int numIslands(char[][] grid) {
        this.m=grid.length;
        this.n=grid[0].length;

        int[][]vis=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1') vis[i][j]=1;
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==1){
                    count++;
                    dfs(i,j,vis,grid);
                }
            }
        }

        return count;
    }

    public void dfs(int i,int j,int[][]vis,char[][]grid){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]=='0' || vis[i][j]==0) return;

        vis[i][j]=0;

        int []ds={1,0,-1,0,1};

        for(int k=0;k<4;k++){
            int ni=i+ds[k];
            int nj=j+ds[k+1];

            dfs(ni,nj,vis,grid);
        }
    }
}