class Solution {
    public int removeStones(int[][] stones) {
        int[] parent=new int[20002];
        int[] rank=new int[20002];

        for(int i=0;i<20002;i++){
            parent[i]=i;
        }

        for(int[]stone:stones){
            union(parent,rank,stone[0],stone[1]+10001);
        }

        Set<Integer>component=new HashSet<>();
        for(int stone[]:stones){
            component.add(find(parent,stone[0]));
        }
        return stones.length-component.size();

    }
    public static void union(int[]parent,int[]rank,int x,int y){
        int px=find(parent,x);
        int py=find(parent,y);

        if(px==py) return;

        if(rank[px]>rank[py]) parent[py]=px;
        else if(rank[px]<rank[py]) parent[px]=py;
        else{
            rank[px]++;
            parent[py]=px;
        }        
    }

    public static int find( int[]parent,int x){
        if(parent[x]!=x){
            parent[x]=find(parent,parent[x]);
        }
        return parent[x];
    }
}