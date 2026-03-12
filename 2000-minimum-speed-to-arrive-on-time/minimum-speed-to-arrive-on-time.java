class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        // If there are N trains, you need at least N-1 full hours + some time for the last train.
        // If hour is <= N-1, it's impossible.
        if (hour <= dist.length - 1) return -1;

        int low = 1;
        int high = 10_000_000; 
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (check(dist, hour, mid)) {
                ans = mid;
                high = mid - 1; // Try to find a slower (smaller) speed
            } else {
                low = mid + 1; // Speed is too slow, increase it
            }
        }
        return ans;
    }

    public boolean check(int[] dist, double hour, int speed) {
        double time = 0;
        for (int i = 0; i < dist.length; i++) {
            double t = (double) dist[i] / speed;
            // If it's not the last train, take the ceiling
            if (i < dist.length - 1) {
                time += Math.ceil(t);
            } else {
                // Last train: add the exact time
                time += t;
            }
        }
        return time <= hour;
    }
}