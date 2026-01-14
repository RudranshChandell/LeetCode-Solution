class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int ans=Integer.MAX_VALUE;
        List<List<int[]>>adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int []arr:flights){
            adj.get(arr[0]).add(new int[]{arr[1],arr[2]});
        }

        int[]distance=new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[src]=0;

        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{src,0,0});

        while(!q.isEmpty()){
            int[]arr=q.poll();
            int node=arr[0];
            int cost=arr[1];
            int dis=arr[2];

            if(dis>k ) continue;

            for(int arr1[]: adj.get(node)){
                int nextNode=arr1[0];
                int nextCost=arr1[1]+cost;

                if(nextCost<distance[nextNode] && dis<=k){
                    distance[nextNode]=nextCost;
                    q.add(new int[]{nextNode,nextCost,dis+1});
                }
            }

        }

        return distance[dst]==Integer.MAX_VALUE ? -1: distance[dst]; 
    }
}