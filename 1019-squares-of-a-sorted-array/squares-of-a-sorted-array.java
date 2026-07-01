class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0,j=nums.length-1,k=j;

        int[]ans=new int[nums.length];
        while(i<j){
            int left=nums[i]*nums[i];
            int right=nums[j]*nums[j];

            if(left>right){
                ans[k--]=left;
                i++;
            }else{
                ans[k--]=right;
                j--;
            }
        }
        ans[0]=nums[i]*nums[i];
        return ans;
    }
}