class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        int current=image[sr][sc];
        int[][]vis=new int[m][n];
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{sr,sc});
        
        while(!q.isEmpty()){
            int[]arr=q.poll();
            int x=arr[0];
            int y=arr[1];

            
            image[x][y]=color;

            int[]ds={1,0,-1,0,1};

            for(int i=0;i<4;i++){
                int row=x+ds[i];
                int col=y+ds[i+1];

                if(row>=0 && row<m && col>=0 && col<n && image[row][col]==current && vis[row][col]==0){
                    vis[row][col]=1;
                    q.add(new int[]{row,col});
                }
            }
        }
        return image;
    }
}