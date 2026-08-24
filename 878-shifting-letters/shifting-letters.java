class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb=new StringBuilder();
        long sumShift=0;

        for(int i=s.length()-1;i>=0;i--){
            sumShift+=shifts[i];
            sb.append((char)('a'+(s.charAt(i)-'a'+sumShift)%26));
        }

        return sb.reverse().toString();
    }
}