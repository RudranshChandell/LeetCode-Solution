class Solution {
    public int minimumDeletions(String s) {
        int deletion=0;
        int countb=0;
        for(char ch:s.toCharArray()){
            if(ch=='b') countb++;
            else{
                if(countb>0){
                    deletion++;
                    countb--;
                }
            }
        }
        return deletion;
    }
}