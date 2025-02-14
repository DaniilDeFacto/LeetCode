//There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the i^th kid has, and an integer extraCandies, denoting the number of extra candies that you have.
//
//Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
//
//Note that multiple kids can have the greatest number of candies.
//
//Constraints:
//
//n == candies.length
//2 <= n <= 100
//1 <= candies[i] <= 100
//1 <= extraCandies <= 50

package org.training.Java.easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (var candy : candies) {
            max = Math.max(candy, max);
        }
        List<Boolean> result = new ArrayList<>();
        for(var candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}
