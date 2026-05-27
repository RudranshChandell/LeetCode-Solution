class Solution {
    public char findTheDifference(String s, String t) {
        char letter=0;
        for(char ch:s.toCharArray()) letter^=ch;
        for(char ch:t.toCharArray()) letter^=ch;
        return letter;
    }
}