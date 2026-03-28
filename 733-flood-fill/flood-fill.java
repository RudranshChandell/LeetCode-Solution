class Solution {
    int rows;
    int cols;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.rows=image.length;
        this.cols=image[0].length;

        int startingColor=image[sr][sc];

        if(startingColor==color) return image;

        dfs(image,sr,sc,startingColor,color);

        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int startingColor,int color){
        image[sr][sc]=color;

        int[]ds={1,0,-1,0,1};

        for(int i=0;i<4;i++){
            int nrow=sr+ds[i];
            int ncol=sc+ds[i+1];

            if(nrow>=0 && nrow<rows && ncol>=0 && ncol<cols && image[nrow][ncol]==startingColor){
                dfs(image,nrow,ncol,startingColor,color);
            } 
        }
    }
}