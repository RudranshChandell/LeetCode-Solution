class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int len=nums.length;
        for(int i=0;i<len;i++){

            int next=(i+1)%len;

            if(nums[next]<nums[i]){
                count++;
            }
            if(count>1) return false;
        }
        return true;
    }
}