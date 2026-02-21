class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m=grid.length;
        int[]count=new int[(m*m)+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                count[grid[i][j]]++;
            }
        }

        int[]ans=new int[2];

        for(int i=0;i<(m*m)+1;i++){
            if(count[i]==2){
                ans[0]=i;
            }else if(count[i]==0){
                ans[1]=i;
            }
        }
        return ans;
    }
}