class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int res=0;
        for(int i:set){
            if(set.contains(i-1)){
                continue;
            }
            int count=0;
            while(set.contains(i)){
                count++;
                i++;
            }
            res=Math.max(res,count);
        }
        return res;
    }
}