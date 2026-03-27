class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int first=0,second=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                first=map.get(target-nums[i]);
                second=i;
                break;
            }
            map.put(nums[i],i);
        }
        return new int[]{first,second};
    }
}