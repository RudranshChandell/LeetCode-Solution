class Solution {
    public int maxProfit(int[] prices) {
        int profit=Integer.MIN_VALUE;
        int minValue=Integer.MAX_VALUE;

        for(int price:prices){
            profit=Math.max(profit,price-minValue);
            minValue=Math.min(minValue,price);
        }
        return profit<0?0:profit;
    }
}