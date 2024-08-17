package org.training.Java.easy;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int wealth : account) {
                sum += wealth;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
