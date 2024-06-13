class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            } else {
                max = Math.max(max, price - min);
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