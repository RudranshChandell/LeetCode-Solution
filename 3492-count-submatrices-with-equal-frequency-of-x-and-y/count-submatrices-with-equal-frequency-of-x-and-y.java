class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m=grid.length,n=grid[0].length;
        int[][] prefix=new int[m][n];
        int[][] hasVal=new int[m][n];
        int count=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                int currentVal=(grid[i][j]=='X'|| grid[i][j]=='Y')?((grid[i][j]=='X')?1:-1):0;
                int hascurrentVal=(grid[i][j]=='X')?1:0;
                
                int top=(i>0)?prefix[i-1][j]:0;
                int left=(j>0)?prefix[i][j-1]:0;
                int overlap=(i>0 && j>0)?prefix[i-1][j-1]:0;
                
                int hastop=(i>0)?hasVal[i-1][j]:0;
                int hasleft=(j>0)?hasVal[i][j-1]:0;
                int hasoverlap=(i>0 && j>0)?hasVal[i-1][j-1]:0;

                prefix[i][j]=top+left+currentVal-overlap;
                hasVal[i][j]=hastop+hasleft+hascurrentVal-hasoverlap;

                if(prefix[i][j]==0 && hasVal[i][j]>0) count++;
            }
        }
        return count;
    }
}