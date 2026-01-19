class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] pref = new int[m + 1][n + 1];

        // 1. Build 2D Prefix Sum
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                pref[i][j] = mat[i-1][j-1] + pref[i-1][j] + pref[i][j-1] - pref[i-1][j-1];
            }
        }

        int low = 1, high = Math.min(m, n), ans = 0;

        // 2. Binary Search for side length k
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (hasSquare(pref, mid, threshold)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private boolean hasSquare(int[][] pref, int k, int threshold) {
        for (int i = k; i < pref.length; i++) {
            for (int j = k; j < pref[0].length; j++) {
                int currentSum = pref[i][j] - pref[i-k][j] - pref[i][j-k] + pref[i-k][j-k];
                if (currentSum <= threshold) return true;
            }
        }
        return false;
    }
}