class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[]arr={-1,-1};
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;


            if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        if (low >= nums.length || nums[low] != target) {
            return arr; 
        }

        arr[0]= (low<nums.length && nums[low]==target )?low:-1;

        low=0;
        high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(nums[mid]<=target){
                low=mid+1;
            }else{
                high=mid-1;
            }
            
        }
        arr[1]= high;
        return arr;
    }
}