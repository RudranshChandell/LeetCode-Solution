class Solution {
    List<List<Integer>>ans;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.ans=new ArrayList<>();

        dfs(graph,0,graph.length-1,new ArrayList<>());

        return ans;
    }

    public void dfs(int[][]graph,int currentNode,int target,List<Integer>list){
        
        list.add(currentNode);
        if(currentNode==target){
            ans.add(new ArrayList<>(list));
        }
        for(int i:graph[currentNode]){
            dfs(graph,i,target,list);
        }
        list.remove(list.size()-1);
    }
}