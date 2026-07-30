class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(res,new ArrayList<>(),nums,0,nums.length);
        return res;        
    }

    public void backtrack(List<List<Integer>>res,List<Integer>list,int nums[],int start,int n){
        res.add(new ArrayList<>(list));
        for(int i=start;i<n;i++){
            list.add(nums[i]);
            backtrack(res,list,nums,i+1,n);
            list.remove(list.size()-1);
        }
    }
}