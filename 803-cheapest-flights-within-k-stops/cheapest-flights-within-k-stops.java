import java.util.*;

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] flight : flights) {
            adj.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }

        int[] stopsMap = new int[n];
        Arrays.fill(stopsMap, Integer.MAX_VALUE);
        stopsMap[src] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        pq.add(new int[]{src, 0, 0});

        while (!pq.isEmpty()) {
            int[] arr = pq.poll();
            int node = arr[0];
            int cost = arr[1];
            int stops = arr[2];

            if (node == dst) return cost;

            if (stops > k) continue;

            for (int[] neighbor : adj.get(node)) {
                int nextNode = neighbor[0];
                int price = neighbor[1];

                if (stops + 1 < stopsMap[nextNode]) {
                    stopsMap[node] = stops ;
                    pq.add(new int[]{nextNode, cost + price, stops + 1});
                }
            }
        }

        return -1;
    }
}