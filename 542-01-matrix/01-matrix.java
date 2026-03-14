class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        int[][]ans=new int[m][n];
        int[][]vis=new int[m][n];
        Queue<Node>q=new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(mat[i][j]==0){
                    q.add(new Node(i,j,0));
                    vis[i][j]=0;
                }else{
                    vis[i][j]=1;
                }
            }
        }

        while(!q.isEmpty()){
            int first=q.peek().first; 
            int second=q.peek().second; 
            int dis=q.peek().dis; 
            q.poll();

            ans[first][second]=dis;

            int[]ds={0,0,1,-1};
            int[]dr={1,-1,0,0};

            for(int i=0;i<4;i++){
                int x=first+ds[i];
                int y=second+dr[i];

                if(x>=0 && y>=0 && x<m && y<n && vis[x][y]==1){
                    vis[x][y]=0;
                    q.add(new Node(x,y,dis+1));
                }
            }
        }
        return ans;
    }
}

public class Node{
    public int first;
    public int second;
    public int dis;

    public Node(int first,int second,int dis){
        this.first=first;
        this.second=second;
        this.dis=dis;
    }
}