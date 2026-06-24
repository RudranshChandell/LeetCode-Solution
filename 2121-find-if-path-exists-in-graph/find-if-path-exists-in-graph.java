class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(n==0) return true;
        if(n==1) return source==destination;
        int[]vis=new int[n];

        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }

        for(int[] edge:edges){
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }

        Queue<Integer>q=new LinkedList<>();
        q.add(source);
        vis[source]=1;

        while(!q.isEmpty()){
            int current=q.poll();

            for(int i:list.get(current)){
                if(i==destination) return true;

                if(vis[i]==0){
                    vis[i]=1;
                    q.add(i);
                }
            }
        }
        return false;

    }
}