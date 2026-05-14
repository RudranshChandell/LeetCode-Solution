class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;
        int count=0;
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            if(num>n-1) return false;
            if(set.contains(num)){
                if(num==n-1 && count<1){
                    count++;
                    continue;
                }else{
                    return false;
                }
            }else{
                set.add(num);
            }
        }
        return nums.length==set.size()+1;
    }
}