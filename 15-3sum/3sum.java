class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>>list=new HashSet<>();


        for(int i=0;i<n;i++){
            HashSet<Integer>set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                List<Integer>dummy=new ArrayList<>();   
                int num=nums[i]+nums[j];
                if(set.contains(num*-1)){
                    dummy.add(nums[i]);
                    dummy.add(nums[j]);
                    dummy.add(num*-1);
                    Collections.sort(dummy);
                    list.add(dummy);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>( list);
    }
}