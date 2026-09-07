class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n=customers.length;
        int left=0,sum=0;

        for(int i=0;i<n;i++){
            sum+=customers[i]*(1-grumpy[i]);
        }
        int res=0;

        for(int right=0;right<n;right++){
            sum+=customers[right]*grumpy[right];
            if(right-left+1>minutes){
                sum-=customers[left]*grumpy[left];
                left++;
            }
            res=Math.max(sum,res);
        }        
        return res;
    }
}