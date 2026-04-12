class Solution {

    int[]parent;
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;

        this.parent=new int[n];

        for(int i=0;i<n;i++){
            parent[i]=i;
        }

        for(int i=0;;i++){
            int rootA=findParent(edges[i][0]-1);
            int rootB=findParent(edges[i][1]-1);

            if(rootA==rootB) return edges[i];

            parent[rootA]=rootB;
        }
    }

    public int findParent(int num){
        if(parent[num]!=num){
            parent[num]=findParent(parent[num]);
        }
        return parent[num];
    }
}