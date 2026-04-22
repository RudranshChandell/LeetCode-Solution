class Solution {
    public int characterReplacement(String s, int k) {
        int[]frequency=new int[26];
        int maxCount=0;
        int maxLength=0;
        int n=s.length();
        int left=0,right=0;
        for(right=0;right<n;right++){
            frequency[s.charAt(right)-'A']++;

            maxCount=Math.max(maxCount,frequency[s.charAt(right)-'A']);
            while((right-left+1)-maxCount>k){
                frequency[s.charAt(left)-'A']--;
                left++;
            }

            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}