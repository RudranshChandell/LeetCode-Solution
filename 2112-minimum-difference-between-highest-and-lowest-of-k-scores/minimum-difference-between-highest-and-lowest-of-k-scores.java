class Solution {
    public int minimumDifference(int[] nums, int k) {
        int minSum=Integer.MAX_VALUE;

        Arrays.sort(nums);

        for(int i=0;i<=nums.length-k;i++){
            minSum=Math.min(minSum,nums[i+k-1]-nums[i]);
        }
        return minSum;
    }
}