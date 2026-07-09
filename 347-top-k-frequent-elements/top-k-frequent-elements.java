class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Integer>[]list=new List[nums.length+1];

        for(int key:map.keySet()){
            int frequency=map.get(key);
            if(list[frequency]==null){
                list[frequency]=new ArrayList<>();
            }
            list[frequency].add(key);
        }

        int index=0;
        int result[]=new int[k];

        for(int i=nums.length;i>=0;i--){
            if(list[i]!=null){
                for(int num:list[i]){
                    result[index++]=num;
                    if(index==k){
                        return result;
                    }
                }
            }
        }
        return result;
    }
}