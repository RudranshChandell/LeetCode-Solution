class Solution {
    public int longestOnes(int[] nums, int k) {
        int right=0,left=0;
        int freq=0;
        int maxLength=0;
        int n=nums.length;
        for(right=0;right<n;right++){
            if(nums[right]==0){
                freq++;
            }
            while(freq>k){
                if(nums[left]==0){
                    freq--;
                }
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}