class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String>list=new ArrayList<>();
        for(String query:queries){
            for(String word:dictionary){
                if(check(query,word))  {
                    list.add(query);
                    break;
                }
            }
        }   
        return list;
    }

    public boolean check(String query,String word){
        int n=query.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(query.charAt(i)!=word.charAt(i))count++;
            if(count>2)return false;
        }
        return true;
    }
}