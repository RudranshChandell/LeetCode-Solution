class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char ch :jewels.toCharArray()){
            for(char st: stones.toCharArray()){
                if(ch==st) count++;
            }
        }
        return count;
    }
}