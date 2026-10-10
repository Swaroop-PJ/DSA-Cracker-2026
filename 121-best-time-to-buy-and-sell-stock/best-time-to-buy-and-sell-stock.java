class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0,n=prices.length;
        int mincost=prices[0];
        for(int i=1;i<n;i++){
            if(prices[i]<mincost) mincost=prices[i];
            else if(prices[i]-mincost>max_profit) max_profit=prices[i]-mincost;

        }
        return max_profit;
    }
}