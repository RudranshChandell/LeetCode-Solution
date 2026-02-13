class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0,ans=0;

        for(int i=0;i<n;i++){
            sum+=(nums[i]==0)?-1:1;
            if(map.containsKey(sum)){
                int index=map.get(sum);
                ans=Math.max(ans,i-index);
            }else{
                map.put(sum,i);
            }
        }
        return ans;
    }
}