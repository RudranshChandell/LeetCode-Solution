class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*k) return -1;

        int low=Integer.MAX_VALUE,high=0,mid=0;
        for(int days:bloomDay){
            low=Math.min(low,days);
            high=Math.max(high,days);
        }
        int ans=-1;

        while(low<=high){
            mid=low+(high-low)/2;

            boolean cond=check(bloomDay,mid,m,k);

            if(cond){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public boolean check(int arr[],int num,int m,int k){
        int countFlower=0,countBouque=0;;
        for(int i:arr){
            if(i<=num) {
                countFlower++;
                if(countFlower==k){
                    countBouque++;
                    countFlower=0;
                }
            }else{
                countFlower=0;
            }
        }
        return countBouque>=m;
    }
}