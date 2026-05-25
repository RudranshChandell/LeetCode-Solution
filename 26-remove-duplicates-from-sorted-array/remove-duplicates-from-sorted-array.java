class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int right=1;
        int index=1;
        while(right<n ){
            while(right<n && nums[right]==nums[right-1]){
                right++;
            }
            if(index<n && right<n)
            nums[index++]=nums[right++];
        }
        return index;
    }
}