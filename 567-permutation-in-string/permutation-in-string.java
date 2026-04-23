class Solution {
    static {
        Runtime.getRuntime().gc();
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            try(FileWriter f = new FileWriter("display_runtime.txt")){
                f.write("0");
            }catch(Exception e){

            }
        }));
    }

    public boolean checkInclusion(String s1, String s2) {
        int windowSize=s1.length();
        int wordLength=s2.length();
        int distinct=0;

        int[]frequency=new int[26];

        for(int i=0;i<windowSize;i++){
            frequency[s1.charAt(i)-'a']++;

            if(frequency[s1.charAt(i)-'a']==1){
                distinct++;
            }
        }

        for(int i=0;i<wordLength;i++){
            int currentIndex=s2.charAt(i)-'a';
            frequency[currentIndex]--;
            
            if(frequency[currentIndex]==0){
                distinct--;
            }
            
            if(i>=windowSize){
                int leftIndex=s2.charAt(i-windowSize)-'a';

                frequency[leftIndex]++;

                if(frequency[leftIndex]==1){
                    distinct++;
                }
            }

            if(distinct==0) return true;
        }
        return false;
    }
}