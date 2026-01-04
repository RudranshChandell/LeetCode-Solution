class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        if(len==0) return len;

        int index=1;
        int current=nums[0];
        int count=1;

        for(int i=1;i<len;i++){
            if(nums[i]==current){
                continue;
            }
            else{
                nums[index]=nums[i];
                current=nums[i];
                index++;
                count++;
            }
        }
        return count;
    }
}