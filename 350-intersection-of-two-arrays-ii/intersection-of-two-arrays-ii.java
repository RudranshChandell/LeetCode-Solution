class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>result=new ArrayList<>();
        
        for(int i:nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i:nums2){
            if(map.containsKey(i) && map.get(i)>0){
                map.put(i,map.get(i)-1);
                result.add(i);
            }
        }

        int[]ans=new int[result.size()];
        for(int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return ans;
    }
}