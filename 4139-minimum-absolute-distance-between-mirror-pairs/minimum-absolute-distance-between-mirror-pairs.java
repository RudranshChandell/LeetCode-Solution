class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            int num=nums[i];                    
            int revNum=rev(nums[i]);

            if(map.containsKey(num)){
                min=Math.min(min,i-map.get(num));
            }                    
            map.put(revNum,i);
        }
        return (min!=Integer.MAX_VALUE)?min:-1;
    }

    public int rev(int num){
        return Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
    }
}