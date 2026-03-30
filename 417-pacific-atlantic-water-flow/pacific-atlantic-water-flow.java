class Solution {
    int m;
    int n;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.m=heights.length;
        this.n=heights[0].length;
        boolean[][]visP=new boolean[m][n];
        boolean[][]visA=new boolean[m][n];

        for(int i=0;i<n;i++){
            dfs(heights,visP,0,i,heights[0][i]);
            dfs(heights,visA,m-1,i,heights[m-1][i]); 
        }
        
        for(int i=0;i<m;i++){
            dfs(heights,visP,i,0,heights[i][0]);
            dfs(heights,visA,i,n-1,heights[i][n-1]); 
        }
        List<List<Integer>>list=new ArrayList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(visA[i][j] && visP[i][j]){
                    list.add(Arrays.asList(i,j));
                }
            }
        }
        return list;
    }

    public void dfs(int[][]heights,boolean[][]vis,int row,int col,int last){

        if(row<0 || col<0 || row>=m || col>=n || vis[row][col] || heights[row][col]<last)return ;
        vis[row][col]=true;
        dfs(heights,vis,row+1,col,heights[row][col]);
        dfs(heights,vis,row-1,col,heights[row][col]);
        dfs(heights,vis,row,col+1,heights[row][col]);
        dfs(heights,vis,row,col-1,heights[row][col]);
    }
}