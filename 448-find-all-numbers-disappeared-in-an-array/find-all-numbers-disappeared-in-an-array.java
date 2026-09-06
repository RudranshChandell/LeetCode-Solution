class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int []vis=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            vis[nums[i]-1]=10;
        }
        List<Integer>list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(vis[i]!=10) list.add(i+1);
        }
        return list;
    }
}