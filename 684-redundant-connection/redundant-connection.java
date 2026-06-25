class Solution {
    int[]parent;
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        this.parent=new int[n];

        for(int i=0;i<n;i++){
            parent[i]=i;
        }

        for(int i=0;i<n;i++){
            int parent1=findparent(edges[i][0]-1);
            int parent2=findparent(edges[i][1]-1);

            if(parent1==parent2) return new int[]{edges[i][0],edges[i][1]};

            parent[parent2]=parent1;
        }
        return new int[]{-1,-1};
    }

    public int findparent(int num){
        if(parent[num]!=num){
            parent[num]=findparent(parent[num]);
        }
        return parent[num];
    }
}