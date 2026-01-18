class Solution {
    public int scoreOfString(String s) {
        int sum=0,first=s.charAt(0);
        for(int i=1;i<s.length();i++){
            sum+=Math.abs(first-s.charAt(i));
            first=s.charAt(i);
        }
        return sum;
    }
}