class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return count(nums,k)-count(nums,k-1);
    }
    public int count(int[]nums,int k){
        int count=0;
        int left=0,n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int right=0;right<n;right++){
            int val=nums[right];
            map.put(val,map.getOrDefault(val,0)+1);

            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}