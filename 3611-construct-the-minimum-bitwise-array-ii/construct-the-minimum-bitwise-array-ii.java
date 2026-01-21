class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int len=nums.size();
        int []ans=new int[len];
        for(int i=0;i<len;i++){
            int current=nums.get(i);

            if(current==2){
                ans[i]=-1;
            }else{
                for(int b=0;b<=30;b++){

                    if(((current>>(b+1)) & 1)==0){
                        ans[i]= current^(1<<b);
                        break;
                    }
                }
            }
        }
        return ans;
    }
}