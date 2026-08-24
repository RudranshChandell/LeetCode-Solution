class Solution {
    public int minStartValue(int[] nums) {
        int left=1,right=0;
        for(int i:nums){
            right+=(Math.abs(i));
        }
        right=right+1;
        int ans=right;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(check(nums,mid)){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
    public boolean check(int []nums,int num){
        for(int i:nums){
            num+=i;
            if(num<1) return false;
        }
        return true;
    }
}