class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[]arr=new int[len];
        arr[0]=nums[0];
        for(int i=1;i<len-1;i++){
            arr[i]=arr[i-1]*nums[i];
        }
        int mul=1;
        for(int i=len-1;i>0;i--){
            arr[i]=arr[i-1]*mul;
            mul*=nums[i];
        }
        arr[0]=mul;
        return arr;
    }
}