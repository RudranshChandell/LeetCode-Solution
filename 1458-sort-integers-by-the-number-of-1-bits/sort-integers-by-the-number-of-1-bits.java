import java.util.Arrays;

class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        
        // Step 1: Encode bit count and value into a single integer
        for (int i = 0; i < n; i++) {
            int count = Integer.bitCount(arr[i]);
            // Store count in the higher "place value"
            arr[i] += count * 100001; 
        }
        
        // Step 2: Standard primitive sort (Dual-Pivot Quicksort)
        Arrays.sort(arr);
        
        // Step 3: Decode to get original values back
        for (int i = 0; i < n; i++) {
            arr[i] %= 100001;
        }
        
        return arr;
    }
}