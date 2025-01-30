//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i^th customer has in the j^th bank. Return the wealth that the richest customer has.
//
//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
//
//Constraints:
//
//m == accounts.length
//n == accounts[i].length
//1 <= m, n <= 50
//1 <= accounts[i][j] <= 100

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
