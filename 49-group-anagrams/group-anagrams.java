class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();

        for(String str:strs){
            char ch[]=str.toCharArray();
            Arrays.sort(ch);

            String currentKey=new String (ch);
            map.putIfAbsent(currentKey,new ArrayList<>());
            var list=map.get(currentKey);
            list.add(str);
            map.put(currentKey,list);
        };
        return new ArrayList<>(map.values());
    }
}