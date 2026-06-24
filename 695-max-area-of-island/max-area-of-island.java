class Solution {
    int m;
    int n;
    int maxArea=0;
    public int maxAreaOfIsland(int[][] grid) {
        this.m=grid.length;
        this.n=grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    maxArea=Math.max(maxArea,dfs(grid,i,j));
                }
            }
        }
        return maxArea;
    }

    public int dfs(int[][]grid,int i,int j){
        if(i<0 ||i>=m || j<0 || j>=n || grid[i][j]==0 ){  
            return 0;
        }

        grid[i][j]=0;

        int[]ds={1,0,-1,0,1};

        int area=1;

        for(int k=0;k<4;k++){
            int row=i+ds[k];
            int col=j+ds[k+1];
            area+=dfs(grid,row,col);
        }
        return area;
    }
}