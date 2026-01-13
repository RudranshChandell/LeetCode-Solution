class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;

        if(grid[0][0]==1 || grid[n-1][n-1]==1){
            return -1;
        }

        int [][] poss={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};

        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{0,0,1});
        grid[0][0]=1;

        while(!q.isEmpty()){
            int[]arr=q.poll();
            
            if(arr[0]==n-1 && arr[1]==n-1){
                return arr[2];
            }

            for(int i[]:poss){
                int row=arr[0]+i[0];
                int col=arr[1]+i[1];

                if(row>=0 && row<n && col>=0 && col<n && grid[row][col]==0){
                    q.add(new int[]{row,col,arr[2]+1});
                    grid[row][col]=1;
                }
            }
        }
        return -1;
    }
}