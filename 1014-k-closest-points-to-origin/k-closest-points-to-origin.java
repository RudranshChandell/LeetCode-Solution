class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<double[]>pq=new PriorityQueue<>((a,b)->Double.compare(a[2],b[2]));

        for(int[]point:points){
            double x=(double)point[0];
            double y=(double)point[1];

            double dist=Math.sqrt((x*x)+(y*y));

            pq.add(new double[]{x,y,dist});
        }

        int[][]ans=new int[k][2];

        for(int i=0;i<k;i++){
            double[]arr=pq.poll();
            ans[i]=new int[]{(int)arr[0],(int)arr[1]};
        }
        return ans;
    }
}