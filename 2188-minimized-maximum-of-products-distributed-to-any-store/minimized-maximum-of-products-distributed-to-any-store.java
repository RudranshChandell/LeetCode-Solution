class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int low=1,high=0;

        for(int i:quantities){
            high=Math.max(high,i);
        }

        while(low<high){
            int mid=low+(high-low)/2;

            if(check(quantities,mid,n)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return high;
    }

    public boolean check(int[]arr, int num, int n){
        int count=0;
        for(int i:arr){
            count+=Math.ceil((double) i/num);
        }
        return count<=n;
    }
}