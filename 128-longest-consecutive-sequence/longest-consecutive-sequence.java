class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();

        for(int i:nums){
            set.add(i);
        }
        int res=0;

        for(int num:set){
            int count=1;

            if(!set.contains(num-1)){
                while(set.contains(num+1)){
                    count++;
                    num+=1;
                }
                res=Math.max(res,count);
            }
        }
        return res;
    }
}