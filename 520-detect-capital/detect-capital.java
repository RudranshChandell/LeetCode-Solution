class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        int lower=0,upper=0;
        for(char ch:word.toCharArray()){
            if(Character.isLowerCase(ch)){
                lower++;
            }else{
                upper++;
            }
        }
        if(Character.isUpperCase(word.charAt(0)) && lower==n-1){
            return true;
        }
        return upper==n || lower==n ;
    }
}