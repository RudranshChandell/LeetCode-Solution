class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []split=s.split("\\s+");
        int len=pattern.length();

        if(split.length!=len) return false;

        var map=new HashMap<Character,String>();

        for(int i=0;i<len;i++){
            char letter=pattern.charAt(i);
            String word=split[i];

            if(map.containsKey(letter)){
                if(!map.get(letter).equals(word)) return false;;
            }else if(map.containsValue(word)){
                return false;
            }
            map.put(letter,word);
        }
        return true;
    }
}