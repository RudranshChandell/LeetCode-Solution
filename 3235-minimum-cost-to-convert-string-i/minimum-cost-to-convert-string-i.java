class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        long[][]dist=new long[26][26];
        long large=(long)1e15;

        for(int i=0;i<26;i++){
            Arrays.fill(dist[i],large);
            dist[i][i]=0;
        }

        for(int i=0;i<original.length;i++){
            int u=original[i]-'a';
            int v=changed[i]-'a';
            dist[u][v]=Math.min(dist[u][v],(long) cost[i]);
        }

        for(int k=0;k<26;k++){
            for(int i=0;i<26;i++){
                for(int j=0;j<26;j++){
                    if(dist[i][k]!=large && dist[k][j]!=large){
                        dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                    }
                }
            }
        }

        long totalCost=0;
        for(int i=0;i<source.length();i++){
            int u=source.charAt(i)-'a';
            int v=target.charAt(i)-'a';
            
            if(u!=v){
                if(dist[u][v]==large){
                    return -1;
                }
                totalCost+=dist[u][v];
            }
        }
        return totalCost;
    }
}