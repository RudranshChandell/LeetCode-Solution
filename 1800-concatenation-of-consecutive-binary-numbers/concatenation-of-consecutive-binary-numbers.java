class Solution {
    public int concatenatedBinary(int n) {
        long result = 0;
        int MOD = 1_000_000_007;
        int binaryLength = 0;

        for (int i = 1; i <= n; i++) {
            // If i is a power of 2, the length of its binary representation increases
            if ((i & (i - 1)) == 0) {
                binaryLength++;
            }
            
            // 1. Shift the existing result to the left by the length of i
            // 2. Add i to the result using bitwise OR
            // 3. Apply modulo to keep it within range
            result = ((result << binaryLength) | i) % MOD;
        }

        return (int) result;
    }
}