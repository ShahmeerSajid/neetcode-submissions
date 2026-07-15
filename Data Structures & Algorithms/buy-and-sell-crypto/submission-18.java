class Solution {
    public int maxProfit(int[] prices) {

        int leftp = 0; // what day to buy stock ...
        int rightp = 1; // what day to sell stock ...

        int currProfit = 0;
        int maxProfit = 0;

        while (rightp < prices.length){

            if (prices[rightp] > prices[leftp]) {
                currProfit = prices[rightp] - prices[leftp];
                maxProfit = Math.max(maxProfit, currProfit);
            }

            else {
                leftp = rightp; // we have found a cheaper price to buy the stock
            }

            rightp++;
        

        }

        return maxProfit;
    
    }
}

// Time: O(n)
// Space: O(1)
