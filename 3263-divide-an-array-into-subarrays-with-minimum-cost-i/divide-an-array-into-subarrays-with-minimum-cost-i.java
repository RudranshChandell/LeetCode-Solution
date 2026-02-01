class Solution {
    public int minimumCost(int[] nums) {
        int first=nums[0];
        int second=100,third=100;

        for(int i=1;i<nums.length;i++){
            if(nums[i]<second){
                third=second;
                second= nums[i];
            }else if(nums[i]<third){
                third=nums[i];
            }
        }
        return first+second+third;
    }
}