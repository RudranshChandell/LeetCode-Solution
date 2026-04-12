class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>ans=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            HashSet<Integer>set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                List<Integer>list=new ArrayList<>();
                int sum=nums[i]+nums[j];

                if(set.contains(sum*-1)){
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(sum*-1);

                    Collections.sort(list);
                    if(!ans.contains(list))ans.add(list);
                }
                set.add(nums[j]);

            }
        }
        return new ArrayList<>(ans);
    }
}