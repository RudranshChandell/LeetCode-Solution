import java.util.HashMap;
import java.util.Map;

class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int target = (int)(totalSum % p);
        if (target == 0) return 0; // Already divisible

        // Maps prefix_sum % p -> most recent index
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Base case: prefix before the array starts

        long currentSum = 0;
        int minLen = nums.length;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            int currentMod = (int)(currentSum % p);

            // We need prefix[j] % p == (currentMod - target + p) % p
            int neededMod = (currentMod - target + p) % p;

            if (map.containsKey(neededMod)) {
                minLen = Math.min(minLen, i - map.get(neededMod));
            }

            // Always update to the most recent index to get the shortest subarray
            map.put(currentMod, i);
        }

        return minLen >= nums.length ? -1 : minLen;
    }
}