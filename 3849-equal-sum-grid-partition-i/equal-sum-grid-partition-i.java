class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                sum+=(long)grid[i][j];
            }
        }
        if(sum%2!=0) return false;

        long resum=0;
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                resum+=(long)grid[i][j];
            
            if(resum==sum/2 && i<row-1){
                return true;
            }
            
        }
        resum=0;
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++)
                resum+=(long)grid[j][i];
            
            if(resum==sum/2 && i<col-1){
                return true;
            }
            
        }
        return false;
    }
}