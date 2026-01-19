class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                str+=String.valueOf(ch);
            }
        }
        str=str.toLowerCase();

        return str.equals(String.valueOf(new StringBuilder(str).reverse()));
    }
}