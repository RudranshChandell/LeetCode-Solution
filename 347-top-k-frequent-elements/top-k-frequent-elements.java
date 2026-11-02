class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.putIfAbsent(i,0);
            map.put(i,map.get(i)+1);
        }   

        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<nums.length+1;i++){
            list.add(new ArrayList<>());
        }

        for(Map.Entry<Integer,Integer>mpp:map.entrySet()){
            list.get(mpp.getValue()).add(mpp.getKey());
        }
        int res[]=new int[k];
        int ind=k;

        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i).size()>0){
                for(int j=0;j<list.get(i).size() && ind>0;j++){
                    res[--ind]=list.get(i).get(j);
                }
            }
        }

        return res;
    }
}