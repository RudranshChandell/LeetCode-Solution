class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character>map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char chone=s.charAt(i);
            char chtwo=t.charAt(i);
            if(map.containsKey(chone)){
                if(map.get(chone)!=chtwo) return false;
            }else if(map.containsValue(chtwo)){
                return false;
            }

            map.put(chone,chtwo);
        }
        return true;
    }
}