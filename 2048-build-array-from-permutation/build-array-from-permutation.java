class Solution {
    public int[] buildArray(int[] nums) {
        int[]arr=new int[nums.length];
        int i=0;
        for(int x:nums){
            arr[i]=nums[x];
            i++;
        }
        return arr;
       
    }
}