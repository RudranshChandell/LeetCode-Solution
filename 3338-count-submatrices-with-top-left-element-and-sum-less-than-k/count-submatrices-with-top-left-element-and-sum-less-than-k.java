class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m=grid.length,n=grid[0].length;
        int prefix[][]=new int[m][n];
        int count=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int currentValue=grid[i][j];
                int left=(j>0)? prefix[i][j-1]:0; 
                int top=(i>0)? prefix[i-1][j]:0;
                int overlap=(i>0 && j>0) ? prefix[i-1][j-1]:0;

                prefix[i][j]=currentValue+left+top-overlap;

                if(prefix[i][j]>k){
                    break;
                }else{
                    count++;
                }
            }
        }
        return count;
    }
}