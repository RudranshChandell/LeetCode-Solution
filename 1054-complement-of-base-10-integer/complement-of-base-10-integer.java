class Solution {
    public int bitwiseComplement(int n) {
        String num=Integer.toBinaryString(n);
        String ans="";
        boolean cond=false;
        for(char ch:num.toCharArray()){
            ans+=(ch=='1') ? "0":"1";
        }

        return Integer.parseInt(ans,2);
    }
}