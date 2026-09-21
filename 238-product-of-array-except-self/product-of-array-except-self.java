class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[]res=new int[n];

        res[0]=nums[0];
        for(int i=1;i<n-1;i++){
            res[i]=res[i-1]*nums[i];
        }

        int mul=1;
        for(int i=n-1;i>0;i--){
            res[i]=res[i-1]*mul;
            mul*=nums[i];
        }
        res[0]=mul;
        return res;
    }
}