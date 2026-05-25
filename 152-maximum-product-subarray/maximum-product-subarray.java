class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length,front=1,back=1,ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(front==0) front=1;
            if(back==0) back=1;
            front*=nums[i];
            back*=nums[n-i-1];
            ans=Math.max(ans,Math.max(front,back));
        }
        return ans;
    }
}