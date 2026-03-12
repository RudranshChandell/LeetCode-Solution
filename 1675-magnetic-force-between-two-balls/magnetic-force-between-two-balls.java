import java.util.Arrays;

class Solution {
    public int maxDistance(int[] position, int m) {
        // 1. MUST SORT for the greedy check to work
        Arrays.sort(position);
        
        int low = 1;
        // The max possible force is the distance between ends
        int high = position[position.length - 1] - position[0]; 
        int ans = 0;

        while (low <= high) {
            // 2. Fix the mid calculation
            int mid = low + (high - low) / 2; 
            
            if (check(position, m, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;            
    }

    public boolean check(int[] arr, int m, int minForce) {
        int count = 1; 
        int lastpos = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - lastpos >= minForce) {
                count++;
                lastpos = arr[i];
            }
            if (count >= m) return true;
        }
        return false;
    }
}