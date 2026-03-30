class Solution {
    int m;
    int n;
    boolean ans;
    public boolean exist(char[][] board, String word) {
        this.ans=false;
        this.m=board.length;
        this.n=board[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    dfs(board,i,j,"",word,0);
                }
            }
        }
        return ans;
    }
    public void dfs(char[][]board,int row,int col,String word,String target,int ind){
        if(row<0 ||row>=m ||col<0 ||col>=n || ans) return;

        if(board[row][col]!=target.charAt(ind)){
            return;
        }
        char temp=board[row][col];
        String newword=word+temp;
        board[row][col]='%';

        if(newword.equals(target)){
            ans=true;
        }

        int[]ds={1,0,-1,0,1};

        for(int i=0;i<4;i++){
            int nrow=row+ds[i];
            int ncol=col+ds[i+1];

            dfs(board,nrow,ncol,newword,target,ind+1);
        }
        board[row][col]=temp;
    }
}