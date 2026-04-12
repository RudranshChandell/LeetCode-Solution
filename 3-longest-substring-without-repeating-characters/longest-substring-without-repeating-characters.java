class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        if(len==0) return 0;
        HashSet<Character>set=new HashSet<>();
        int maxCount=0;
        
        for(int i=0;i<len;i++){
            set.clear();
            for(int j=i;j<len;j++){
                if(!(set.contains(s.charAt(j)))){
                    set.add(s.charAt(j));
                }else{
                    break;
                }

                maxCount=Math.max(maxCount,set.size());
            }
        }
        return maxCount;
    }
}