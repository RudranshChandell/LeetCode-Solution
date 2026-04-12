class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0;
        double sum=0;

        int right=0,n=nums.length,left=0;

        for(right=0;right<k;right++){
            sum+=nums[right];
        }
        ans=sum/k;

        for(right=right;right<n;right++){
            sum+=nums[right];
            sum-=nums[left++];

            ans=Math.max(ans,sum/k);
        }
        return ans;
    }
}