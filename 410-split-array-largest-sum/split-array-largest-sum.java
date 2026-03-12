class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for (int n : nums) {
            low = Math.max(low, n);
            high += n;
        }

        while(low<high){
            int mid=low+(high-low)/2;

            if(test(nums,mid)<=k){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    public int test(int[]nums,int target){

        int count=1,sum=0;

        for(int num:nums){
            if(sum+num>target){
                sum=num;
                count++;
            }
            else{
                sum+=num;
            }
        }
        return count;
    }

}