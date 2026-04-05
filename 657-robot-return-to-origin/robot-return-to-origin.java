class Solution {
    public boolean judgeCircle(String moves) {
        int i=0,j=0;

        for(char ch:moves.toCharArray()){
            if(ch=='U'){
                i+=1;
            }else if(ch=='D'){
                i-=1;
            }
            if(ch=='L'){
                j+=1;
            }else if(ch=='R'){
                j-=1;
            }
        }

        return (i==0 && j==0);
    }
}