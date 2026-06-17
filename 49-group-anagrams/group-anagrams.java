class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        List<List<String>>ans=new ArrayList<>();

        for(String str:strs){
            char []chararray=str.toCharArray();
            Arrays.sort(chararray);
            String newword=new String (chararray);

            List dummy=map.getOrDefault(newword,new ArrayList<>());
            dummy.add(str);
            map.put(newword,dummy);
        }

        for(List list: map.values()){
            ans.add(list);
        }
        return ans;
    }
}