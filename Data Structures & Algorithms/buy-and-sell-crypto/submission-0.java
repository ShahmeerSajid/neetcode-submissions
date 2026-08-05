class Solution {
    public int maxProfit(int[] prices) {

        int leftp = 0; // day to buy stock
        int rightp = 1; // day to sell stock

        int currProfit = 0;
        int maxProfit = 0;

        while (rightp < prices.length) {

            if (prices[rightp] > prices[leftp]) {
                currProfit = prices[rightp] - prices[leftp];
                maxProfit = Math.max(maxProfit, currProfit);
            }

            else {
                leftp = rightp;
            }

            rightp++;
        }


        return maxProfit;
    }
}
