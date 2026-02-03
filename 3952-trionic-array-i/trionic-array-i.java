class Solution {
    public boolean isTrionic(int[] nums) {
        int currentIndex=0,rem=currentIndex;

        while(currentIndex<nums.length-2 && nums[currentIndex]<nums[currentIndex+1]){
            currentIndex++;
        }
        if(currentIndex==rem) return false;
        rem=currentIndex;
        
        while(currentIndex<nums.length-1 && nums[currentIndex]>nums[currentIndex+1]){
            currentIndex++;
        }
        if(currentIndex==rem) return false;
        rem=currentIndex;
        
        while(currentIndex<nums.length-1 && nums[currentIndex]<nums[currentIndex+1]){
            currentIndex++;
        }
        if(currentIndex==rem) return false;
        
        return currentIndex==nums.length-1;
    }
}