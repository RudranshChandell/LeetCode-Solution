class Solution {
    int m,n;
    public int numIslands(char[][] grid) {
        int count=0;    
        m=grid.length;
        n=grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }

    public void dfs(char[][]grid,int i,int j){
        if(i<0 ||i>=m || j<0 || j>=n || grid[i][j]=='0'){
            return;
        }

        grid[i][j]='0';

        int[]ds={1,0,-1,0,1};

        for(int k=0;k<4;k++){
            dfs(grid,i+ds[k],j+ds[k+1]);
        }
    }
}