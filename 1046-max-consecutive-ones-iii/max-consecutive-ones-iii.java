class Solution {
    public int longestOnes(int[] nums, int k) {
        int right=0,left=0;
        int max=0;
        int count=0;

        for(right=0;right<nums.length;right++){

            count+=nums[right]==1?1:0;

            while(right-left+1-count>k){
                count-=nums[left]==1?1:0;
                left++;
            }

            max=Math.max(right-left+1,max);
        }
        return max;
    }
}