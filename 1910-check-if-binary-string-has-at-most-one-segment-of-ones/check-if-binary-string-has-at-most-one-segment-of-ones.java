class Solution {
    public boolean checkOnesSegment(String s) {
        int count=0;
        int n=s.length();
        int i=0;

        while(i<n){
            char ch=s.charAt(i);
            if(ch=='1'){
                count++;
                while(i<n && s.charAt(i)=='1'){
                    i++;
                }
            }
            i++;
        }
        return count==1;
    }
}