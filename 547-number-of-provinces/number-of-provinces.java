class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        List<List<Integer>>list=new ArrayList<>();
        
        for(int i=0;i<n+1;i++){
            list.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && isConnected[i][j]==1){
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }

        boolean pro[]=new boolean[n+1];
        int count=0;

        for(int i=0;i<n;i++){
            if(pro[i]==false){
                count++;
                dfs(i,list,pro);
            }
        }
        return count;
    }

    public void dfs(int num,List<List<Integer>>list,boolean[]pro){
        if(pro[num]==true) return;
        pro[num]=true;

        for(int i:list.get(num)){
            dfs(i,list,pro);
        }
    }
}