class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>>ans=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer>set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int key=nums[i]+nums[j];
                if(set.contains(-1*key)){
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],-1*key)));
                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>>list=new ArrayList<>(ans);
        return list;
    }
}