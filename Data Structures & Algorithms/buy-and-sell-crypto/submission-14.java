class Solution {
    public int maxProfit(int[] prices) {
        
        int leftp = 0;
        int rightp = 1;
        int currProfit = 0;
        int maxProfit = 0;

        while (rightp < prices.length){
            if (prices[rightp] > prices[leftp]){
                currProfit = prices[rightp] - prices[leftp];
                maxProfit = Math.max(maxProfit, currProfit);
            }

            else{
                // we have found a cheaper buying price
                leftp = rightp;
            }
            rightp ++;
        }
        return maxProfit;
    }
}
