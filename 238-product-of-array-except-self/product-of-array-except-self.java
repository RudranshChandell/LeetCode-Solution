class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i];
        }

        int product=1;
        for(int i=nums.length-1;i>0;i--){
            prefix[i]=prefix[i-1]*product;
            product*=nums[i];
        }
        prefix[0]=product;
        return prefix;
    }
}