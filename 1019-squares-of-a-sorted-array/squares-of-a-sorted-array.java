class Solution {
    public int[] sortedSquares(int[] nums) {
        Arrays.setAll(nums,i->nums[i]*nums[i]);
        Arrays.sort(nums);
        return nums;
    }
}