class Solution {
    public int firstMissingPositive(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        Collections.sort(list);
        int num=1;
        for(int i:list){
            if(i==num){
                num++;
            }else if(i>num) return num;
        }
        return num;
    }
}