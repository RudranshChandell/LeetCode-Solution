class Solution {
    public String minWindow(String s, String t) {
        if(s==null || t==null || s.length()==0||t.length()==0 || s.length()<t.length()){
            return new String();
        }

        int charr[]=new int[128];
        int start=0,end=0,count=t.length(),startIndex=0,minLength=Integer.MAX_VALUE;
        
        for(char ch:t.toCharArray()){
            charr[ch]++;
        }

        char []chS=s.toCharArray();


        while(end<s.length()){
            if(charr[chS[end++]]-->0){
                count--;
            }

            while(count==0){
                if(end-start<minLength){
                    startIndex=start;
                    minLength=end-start;
                }

                if(charr[chS[start++]]++ ==0){
                    count++;
                }
            }
        }

        return minLength==Integer.MAX_VALUE?new String(): new String(chS,startIndex,minLength);
    }
}