class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int price=Integer.MAX_VALUE;

        for(int i:prices){
            profit=Math.max(profit,i-price);
            price=Math.min(price,i);
        }

        return profit;
    }
}