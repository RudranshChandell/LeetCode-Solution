class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE,high=0;

        for (int w : weights) {
            low = Math.max(low, w); // Minimum capacity is the heaviest item
            high += w;             // Maximum capacity is the sum of all items
        }

        while(low<high){
            int mid=low+(high-low)/2;

            boolean ans=find(weights,mid,days);

            if(ans){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    
    public static boolean find(int[]weights,int num,int days){
        int currentDays=1,currentWeight=0;
        for(int w:weights){
            if(currentWeight+w>num){
                currentDays++;
                currentWeight=w;
            }else{
                currentWeight+=w;
            }
        }

        return currentDays<=days;
    }

}