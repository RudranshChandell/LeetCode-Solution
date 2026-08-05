class Solution {
    public String reverseWords(String s) {
        String[]word=s.trim().split("\\s+");
        int left=0,right=word.length-1;
        while(left<right){
            String temp=word[left];
            word[left]=word[right];
            word[right]=temp;
            left++;
            right--;
        }
        String str="";
        for(int i=0;i<word.length-1;i++){
            str+=word[i]+" ";
        }
        str=str+word[word.length-1];
        return str;
    }
}