class Solution {
    public int arrangeCoins(int n) {
        long ans=0;
        long low=0,high=n;

        while(low<=high){
            long mid=(high-low)/2+low;

            long value=mid*(mid+1)/2;

            if(value<=n){
                ans=mid;
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return (int)ans;
    }
}