package org.training.easy;

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
