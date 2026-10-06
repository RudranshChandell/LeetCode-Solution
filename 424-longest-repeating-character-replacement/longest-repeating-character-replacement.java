class Solution {
    public int characterReplacement(String s, int k) {
        int ch[]=new int[26];
        int right=0,left=0;
        int max=0;
        int ans=0;
        int n=s.length();
        for(right=0;right<n;right++){
            ch[s.charAt(right)-'A']++;

            max=Math.max(max,ch[s.charAt(right)-'A']);

            while(right-left-max+1>k){
                ch[s.charAt(left)-'A']--;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;        
    }
}