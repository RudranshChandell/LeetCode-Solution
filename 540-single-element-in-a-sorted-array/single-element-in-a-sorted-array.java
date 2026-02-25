class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0,high=nums.length-1;
        if(nums.length==1) return nums[0];
        while(low<=high){
            if(nums[low]!=nums[low+1]) return nums[low];
            if(nums[high]!=nums[high-1]) return nums[high];
            low+=2;
            high-=2;
        }
        return -1;
    }
}