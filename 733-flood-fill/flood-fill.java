class Solution {
    int m;
    int n;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.m=image.length;
        this.n=image[0].length;
        int startingColor=image[sr][sc];
        if(startingColor==color)return image;
        dfs(image,sr,sc,startingColor,color);

        return image;
    }
    public void dfs(int[][]image,int sr,int sc,int startingColor,int color){
        image[sr][sc]=color;

        int ds[]={1,0,-1,0,1};

        for(int i=0;i<4;i++){
            int row=sr+ds[i];
            int col=sc+ds[i+1];

            if(row>=0 && row<m && col>=0 && col<n && image[row][col]==startingColor){
                dfs(image,row,col,startingColor,color);
            }
        }
    }
}