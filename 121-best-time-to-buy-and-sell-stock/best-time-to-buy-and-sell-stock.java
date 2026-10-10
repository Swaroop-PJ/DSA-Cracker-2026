class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int mincost=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<mincost) mincost=prices[i];
            else if(prices[i]-mincost>max_profit) max_profit=prices[i]-mincost;

        }
        return max_profit;
    }
}