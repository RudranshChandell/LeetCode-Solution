class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>>map=new HashMap<>();
        
        for(String str:strs){
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String newword=new String(ch);
            map.putIfAbsent(newword,new ArrayList<>());
            map.get(newword).add(str);
        }
        return new ArrayList<>(map.values());
    }
}