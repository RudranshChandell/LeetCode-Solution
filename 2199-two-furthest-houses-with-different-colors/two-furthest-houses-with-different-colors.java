class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        if(n<=1) return 0;
        int ans=0;
        int firsthouse=colors[0];
        for(int i=n-1;i>=0;i--){
            if(colors[i]!=firsthouse){
                ans=i;
                break;
            }
        }
        int secondHouse=colors[n-1];
        int ans2=0;
        for(int i=0;i<n;i++){
            if(colors[i]!=secondHouse){
                ans2=i;
                break;
            }
        }
        return Math.max(ans,n-1-ans2);        
    }
}