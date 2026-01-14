class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        for(int []arr: accounts){
            int local=0;
            for(int i:arr){
                local+=i;
            }
            sum=Math.max(sum,local);
        }
        return sum;
    }
}