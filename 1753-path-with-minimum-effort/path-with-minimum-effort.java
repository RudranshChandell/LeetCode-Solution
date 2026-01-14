class Solution {
    public int minimumEffortPath(int[][] heights) {
        int row=heights.length;
        int col=heights[0].length;
        PriorityQueue<int[]>q=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));

        int[][]dist=new int[row][col];
        for(int[]x: dist){
            Arrays.fill(x,Integer.MAX_VALUE);
        }

        dist[0][0]=0;
        q.add(new int[]{0,0,0});

        while(!q.isEmpty()) {
            int []arr=q.poll();
            int dis=arr[0];
            int r=arr[1];
            int c=arr[2];

            int []ds={0,0,1,-1};
            int []dr={1,-1,0,0};
            
            if(r==row-1 && c==col-1){
                return dis;
            }
            
            for(int i=0;i<4;i++){
                int newr=r+ds[i];
                int newc=c+dr[i];
            
                if(newr>=0 && newr<row && newc>=0 && newc<col ){
                    int newVal=Math.max(Math.abs(heights[r][c]-heights[newr][newc]),dis);
                    
                    if(newVal<dist[newr][newc]){
                        dist[newr][newc]=newVal;
                        q.add(new int[]{newVal,newr,newc});
                    }
                }
            }
        }   
        return 0;
    }
}