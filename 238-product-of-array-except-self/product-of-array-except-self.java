class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int []arr=new int[n];
        arr[0]=nums[0];
        for(int i=1;i<n-1;i++){
            arr[i]=arr[i-1]*nums[i];
        }
        int mul=1;
        for(int i=n-1;i>=1;i--){
            arr[i]=mul*arr[i-1];
            mul*=nums[i];
        }
        arr[0]=mul;
        return arr;
    }
}