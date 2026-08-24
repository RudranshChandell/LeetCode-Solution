class Solution {
    public int findMiddleIndex(int[] nums) {
        int len=nums.length;
        int[]prefix=new int[len];
        prefix[0]=nums[0];

        for(int i=1;i<len;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int sum=0;
        int ans=-1;
        for(int i=len-1;i>=0;i--){
            sum+=nums[i];
            if(sum==prefix[i]){
                ans=i;
            }
        }
        return ans;
    }
}