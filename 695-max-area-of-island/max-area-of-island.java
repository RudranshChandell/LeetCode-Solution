class Solution {
    int rows;
    int cols;
    int maxArea;

    public int maxAreaOfIsland(int[][] grid) {
        this.maxArea=0;
        this.rows=grid.length;
        this.cols=grid[0].length;
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    int area=dfs(i,j,grid);
                    maxArea=Math.max(maxArea,area);
                }
            }
        }
        return maxArea;
    }

    public int dfs(int row,int col,int[][]grid){

        if(row<0 || row>=rows || col<0 || col>=cols || grid[row][col]==0){
            return 0;
        } 
        grid[row][col]=0;
        
        int area=1;
        int[]ds={1,0,-1,0,1};
        for(int i=0;i<4;i++){
            int nrow=row+ds[i];
            int ncol=col+ds[i+1];
            area+=dfs(nrow,ncol,grid);
        }
        return area;
    }
}