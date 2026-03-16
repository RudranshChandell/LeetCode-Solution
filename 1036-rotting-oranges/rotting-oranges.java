class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        Queue<Node>q=new LinkedList<>();
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new Node(i,j,0));
                }
            }
        }

        while(!q.isEmpty()){
            int first=q.peek().x;
            int second=q.peek().y;
            int time=q.peek().t;
            q.poll();
                
            ans=Math.max(ans,time);

            int []ds={1,-1,0,0};
            int []dr={0,0,1,-1};
            for(int i=0;i<4;i++){
                int x=first+ds[i];
                int y=second+dr[i];
                
                if(x>=0 && y>=0 && x<m && y<n && grid[x][y]==1){
                    grid[x][y]=2;
                    q.add(new Node(x,y,time+1));
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return ans==Integer.MIN_VALUE?0:ans;
    }
    public class Node{
        int x;
        int y;
        int t;

        public Node(int x,int y,int t){
            this.x=x;
            this.y=y;
            this.t=t;
        }
    }
}