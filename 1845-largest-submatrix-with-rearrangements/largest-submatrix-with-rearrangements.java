class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1)
                    matrix[i][j]=matrix[i-1][j]+1;
            }
        }
        int maxArea=0;

        for(int [] row:matrix){
            Arrays.sort(row);

            int wid=1;

            for(int i=n-1;i>=0 && row[i]>0;i--){
                int area=row[i]*wid;
                maxArea=Math.max(area,maxArea);
                wid++;
            }
        }
        return maxArea;
    }
}