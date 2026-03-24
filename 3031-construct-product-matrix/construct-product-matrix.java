class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        long mod=12345;
        long num=1;
        int m=grid.length,n=grid[0].length;
        int[][]res=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=(int)num;
                num=(num*(grid[i][j]%mod)%mod);
            }
        }
        num=1;
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                res[i][j]=(int)((res[i][j]*num)%mod);
                num=(num*(grid[i][j]%mod)%mod);
            }
        }

        return res;
    }
}