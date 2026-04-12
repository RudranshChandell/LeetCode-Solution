class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>result=new ArrayList<>();
        int slength=s.length();
        int plength=p.length();

        if (slength < plength) {
            return result;
        }

        int[]pattern=new int[26];
        int[]sub=new int[26];
        

        for(int i=0;i<plength;i++){
            pattern[p.charAt(i)-'a']++;
        }

        for(int i=0;i<plength-1;i++){
            sub[s.charAt(i)-'a']++;
        }

        for(int i=plength-1;i<slength;i++){
            sub[s.charAt(i)-'a']++;

            if(Arrays.equals(pattern,sub)){
                result.add(i-plength+1);
            }

            sub[s.charAt(i-plength+1)-'a']--;
        }
        
        return result;
    }

}