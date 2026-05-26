class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character>set=new HashSet<>();
        int count=0;
        for(char ch:word.toCharArray()){
            char other=Character.isUpperCase(ch)?Character.toLowerCase(ch):Character.toUpperCase(ch);
            if(set.contains(other) && !set.contains(ch)){
                count++;
            }

            set.add(ch);
        }
        return count;
    }
}