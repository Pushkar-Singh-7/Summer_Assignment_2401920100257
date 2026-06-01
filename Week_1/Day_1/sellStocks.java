class Solution {
    public int maxProfit(int[] prices) {
        int purchaseprice=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(purchaseprice>prices[i])
            {
purchaseprice=prices[i];
            }
            profit=Math.max(profit,prices[i]-purchaseprice);
        }
        return profit;
    }
}
