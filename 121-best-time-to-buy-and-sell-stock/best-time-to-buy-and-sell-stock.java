class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0,n=prices.length;
        int mincost=prices[0];
        for(int i=1;i<n;i++){
            int profit=prices[i]-mincost;
            if(profit<=0) mincost=prices[i];
            if(profit>max_profit) max_profit=profit;

        }
        return max_profit;
    }
}