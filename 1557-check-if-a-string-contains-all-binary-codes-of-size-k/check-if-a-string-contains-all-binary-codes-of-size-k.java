class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()<(1<<k)+k-1) return false;
        HashSet<String>set=new HashSet<>();

        for(int i=0;i<s.length()-k+1;i++){
            set.add(s.substring(i,i+k));
            if(set.size()==(1<<k)) return true;
        }
        return false;
    }
}