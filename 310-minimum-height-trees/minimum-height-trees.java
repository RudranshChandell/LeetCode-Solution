class Solution {    
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        ArrayList<Integer>ans=new ArrayList<>();
        if(n==1){
            ans.add(0);
            return ans;
        }
        int[] degree=new int[n];
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[]arr:edges){
            adj.get(arr[0]).add(arr[1]);
            adj.get(arr[1]).add(arr[0]);
            degree[arr[0]]++;
            degree[arr[1]]++;
        }
        Queue<Integer>q=new LinkedList<>();

        for(int i=0;i<n;i++){
            if(degree[i]==1) q.add(i);
        }

        while(!q.isEmpty()){
            int size=q.size();
            ans.clear();

            for(int i=0;i<size;i++){
                int num=q.poll();
                ans.add(num);

                for(int j:adj.get(num)){
                    degree[j]--;
                    if(degree[j]==1){
                        q.add(j);
                    }
                }
            }
        }
        return ans;
    }
}