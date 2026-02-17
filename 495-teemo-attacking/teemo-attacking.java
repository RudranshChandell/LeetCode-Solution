class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totaltime=0;
        int n=timeSeries.length;

        for(int i=0;i<n-1;i++){
            int gap=timeSeries[i+1]-timeSeries[i];

            totaltime+=Math.min(gap,duration);
        }
        totaltime+=duration;

        return totaltime;
    }
}