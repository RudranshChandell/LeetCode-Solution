class Solution {
    int[]parent;
    HashSet<Integer>visited;
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1) return -1;
        parent=new int[n];

        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        
        int component=n;
        for(int connection[]:connections){
            
            int first=findParent(connection[0]);
            int second=findParent(connection[1]);
            if(first!=second){
                parent[second]=first;
                component--;
            }
        }
        return component-1;
        
    }
    public int findParent(int x){
        if(x!=parent[x]){
            parent[x]=findParent(parent[x]);
        }
        return parent[x];
    }
}