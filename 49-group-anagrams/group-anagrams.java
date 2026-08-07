class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();

        for(String str:strs){
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String newWord=new String(ch);

            map.computeIfAbsent(newWord,k-> new ArrayList<>()).add(str);

        }

        List<List<String>>ans=new ArrayList<>();

        for(Map.Entry<String,List<String>>entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}