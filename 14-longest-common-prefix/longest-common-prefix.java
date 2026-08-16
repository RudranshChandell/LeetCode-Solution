class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        if(strs.length==0) return sb.toString();
        if(strs.length==1) return strs[0];
        Arrays.sort(strs);
        String str=strs[0];
        String str2=strs[strs.length-1];
        for(int i=0;i<Math.min(str.length(),str2.length());i++){
            if(str.charAt(i)==str2.charAt(i)){
                sb.append(str.charAt(i));
            }else{
                return sb.toString();
            }
        }
        return sb.toString();
    }
}