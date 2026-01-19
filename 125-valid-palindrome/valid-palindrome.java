class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            char first=s.charAt(i);
            char second=s.charAt(j);

            if(!Character.isLetterOrDigit(s.charAt(i))) i++;
            else if(!Character.isLetterOrDigit(s.charAt(j))) j--;
            else{
                if(Character.toLowerCase(first)==Character.toLowerCase(second)){
                    i++;
                    j--;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}