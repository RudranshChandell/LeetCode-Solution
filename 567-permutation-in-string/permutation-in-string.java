class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1=s1.length();
        int len2=s2.length();
        if (len1 > len2) {
            return false;
        }

        int ch1[]=new int[26];
        int ch2[]=new int[26];

        for(char ch:s1.toCharArray()){
            ch1[ch-'a']++;
        }

        for(int i=0;i<len1-1;i++){
            ch2[s2.charAt(i)-'a']++;
        }

        for(int i=len1-1;i<len2;i++){
            ch2[s2.charAt(i)-'a']++;
            if(Arrays.equals(ch1,ch2)) return true;
            ch2[s2.charAt(i-len1+1)-'a']--;
        }
        return false;
    }
}