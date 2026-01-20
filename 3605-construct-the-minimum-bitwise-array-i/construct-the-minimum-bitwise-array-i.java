class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int len=nums.size();
        int []ans=new int[len];

        for(int i=0;i<len;i++){
            boolean istrue=false;
            int p=nums.get(i);

            for(int x=0;x<p;x++){
                if((x|x+1)==p){
                    ans[i]=x;                 
                    istrue=true;
                    break;
                }
            }
            if(!istrue){
                ans[i]=-1;
            }
        }
        return ans;
    }
}