class Solution {
    int[][]grid;
    int row;
    int col;
    int parent[];
    public boolean hasValidPath(int[][] grid) {
        this.grid=grid;
        this.row=grid.length;
        this.col=grid[0].length;
        this.parent=new int[row*col];

        for(int i=0;i<row*col;i++){
            parent[i]=i;
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                int currentPath=grid[i][j];

                if(currentPath==2){
                    connectUp(i,j);
                    connectDown(i,j);
                }else if(currentPath==1){
                    connectLeft(i,j);
                    connectRight(i,j);
                }else if(currentPath==3){
                    connectLeft(i,j);
                    connectDown(i,j);
                }else if(currentPath==4){
                    connectDown(i,j);
                    connectRight(i,j);
                }else if(currentPath==5){
                    connectLeft(i,j);
                    connectUp(i,j);
                }else if(currentPath==6){
                    connectUp(i,j);
                    connectRight(i,j);
                }
            }
        }
        return find(0)==find(row*col-1);
    }
    public void connectUp(int i,int j){
        if(i>0 && (grid[i-1][j]==2 ||grid[i-1][j]==3 ||grid[i-1][j]==4)){
            parent[find(i*col+j)]=find((i-1)*col+j);
        }
    }
    public void connectDown(int i,int j){
        if(i<row-1 && (grid[i+1][j]==2 ||grid[i+1][j]==5 ||grid[i+1][j]==6)){
            parent[find(i*col+j)]=find((i+1)*col+j);
        }
    }
    public void connectLeft(int i,int j){
        if(j>0 && (grid[i][j-1]==4 ||grid[i][j-1]==6 ||grid[i][j-1]==1)){
            parent[find(i*col+j)]=find((i)*col+j-1);
        }
    }
    public void connectRight(int i,int j){
        if(j<col-1 && (grid[i][j+1]==1 ||grid[i][j+1]==3 ||grid[i][j+1]==5)){
            parent[find(i*col+j)]=find((i)*col+j+1);
        }
    }

    public int find(int x){
        if(parent[x]!=x){
            parent[x]=find(parent[x]);
        }
        return parent[x];
    }

}