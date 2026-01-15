class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[]ans=new int[n*2];
        int k=0,j=n;
        for(int i=0;i<n*2;i+=2){
            ans[i]=nums[k++];
            ans[i+1]=nums[j++];
        }
        return ans;
    }
}