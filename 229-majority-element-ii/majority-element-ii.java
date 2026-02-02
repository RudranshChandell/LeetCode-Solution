class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length/3;
        List<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(!list.contains(i) && map.get(i)>n){
                list.add(i);
            }
        }
        return list;
    }
}