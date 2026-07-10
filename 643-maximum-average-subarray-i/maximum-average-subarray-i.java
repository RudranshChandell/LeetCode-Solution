class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average=Integer.MIN_VALUE,sum=0;
        int left=0;
        int n=nums.length;

        for(int right=0;right<n;right++){
            sum+=nums[right];
            while(right-left+1>k){
                sum-=nums[left++];
            }
            if(right-left+1==k){
                average=Math.max(average,sum/k);
            }
        }
        return average;
    }
}