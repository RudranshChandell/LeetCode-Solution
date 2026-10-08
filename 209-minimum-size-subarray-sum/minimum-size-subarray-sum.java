class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int max=0;
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        int right=0,left=0;
        for(right=0;right<n;right++){
            max+=nums[right];
            while(max>=target){
                ans=Math.min(right-left+1,ans);
                max-=nums[left++];
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}