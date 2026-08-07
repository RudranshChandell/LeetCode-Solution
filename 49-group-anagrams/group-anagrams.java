class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();

        for(String str:strs){
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String newWord=new String(ch);

            map.computeIfAbsent(newWord,k-> new ArrayList<>()).add(str);

        }
        return new ArrayList<>(map.values());
    }
}