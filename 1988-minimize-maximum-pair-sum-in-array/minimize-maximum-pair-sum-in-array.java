import java.util.Arrays;

class Solution {
    public int minPairSum(int[] nums) {
        // 1. Sort the array to pair the smallest with the largest
        Arrays.sort(nums);
        
        int maxPairSum = 0;
        int n = nums.length;
        
        // 2. Use two pointers (i and n-1-i) to find pair sums
        for (int i = 0; i < n / 2; i++) {
            // Pair smallest (i) with largest (n-1-i)
            int currentPairSum = nums[i] + nums[n - 1 - i];
            
            // Keep track of the maximum sum encountered
            if (currentPairSum > maxPairSum) {
                maxPairSum = currentPairSum;
            }
        }
        
        return maxPairSum;
    }
}