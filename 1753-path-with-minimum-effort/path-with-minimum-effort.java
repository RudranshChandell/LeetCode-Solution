class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        PriorityQueue<int[]>pq=new PriorityQueue<>(Comparator.comparingInt((a)->a[0]));
        pq.add(new int[]{0,0,0});

        int[][]dst=new int[m][n];
        for(int arr[]:dst){
            Arrays.fill(arr,Integer.MAX_VALUE);
        }
        dst[0][0]=0;

        while(!pq.isEmpty()){
            int arr[]=pq.poll();
            int dist=arr[0];
            int r=arr[1];
            int c=arr[2];

            int[]ds={1,0,-1,0,1};

            if(r==m-1 && c==n-1){
                return dist;
            }

            for(int i=0;i<4;i++){
                int nr=r+ds[i];
                int nc=c+ds[i+1];

                if(nr>=0 && nr<m && nc>=0 && nc<n){
                    int newValue=Math.max(Math.abs(heights[r][c]-heights[nr][nc]),dist);

                    if(newValue<dst[nr][nc]){
                        dst[nr][nc]=newValue;
                        pq.add(new int[]{newValue,nr,nc});
                    }
                }
            }
        }
        return 0;
    }
}