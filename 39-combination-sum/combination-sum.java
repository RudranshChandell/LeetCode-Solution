class Solution {
    List<List<Integer>>ans;
    int[]candidates;
    List<Integer>list=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.ans=new ArrayList<>();
        Arrays.sort(candidates);
        this.candidates=candidates;

        dfs(0,target);
        return ans;
    }

    public void dfs(int ind,int target){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return ;
        }

        if(target<candidates[ind]) return;

        for(int i=ind;i<candidates.length;i++){
            list.add(candidates[i]);

            dfs(i,target-candidates[i]);

            list.remove(list.size()-1);            
        }
    }
}