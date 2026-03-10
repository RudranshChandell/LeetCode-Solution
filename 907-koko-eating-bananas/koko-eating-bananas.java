class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=0,high=find(piles);

        while(low<=high){
            int mid=low+(high-low)/2;

            int result=findHour(piles,mid);

            if(result<=h) {
                high=mid-1;
            }
            else low=mid+1;
        }
        return low;
    }

    public int findHour(int[]piles,int speed){
        int hour=0;
        for(int i:piles){
            hour+=Math.ceil((double)i/speed);
        }
        return hour;
    }

    public int find(int[]piles){
        int max=0;
        for(int i:piles){
            max=Math.max(i,max);
        }
        return max;
    }
}