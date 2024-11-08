package org.training.Java.easy;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            if (prices[i] - buyPrice > profit) {
                profit = prices[i] - buyPrice;
            }
        }
        return profit;
    }
}
