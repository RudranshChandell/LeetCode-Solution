class Solution {
    public int removeElement(int[] nums, int val) {
        int ind=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            nums[ind++]=nums[i];
        }
        return ind;
    }
}