class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                max = Math.max(prices[i] - min, max);
            }
        }
        return max;
    }
}
/*
 * Basic - Do a nested loop and get the max profit
 * 
 * Optimal - Loop through once and keep a min and max value count
 * if any value is less than min then replace with min if not check if its
 * difference with min is greater than max
 * and replace if not keep max.
 */