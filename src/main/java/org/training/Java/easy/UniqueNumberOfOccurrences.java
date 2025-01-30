//Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
//
//Constraints:
//
//1 <= arr.length <= 1000
//-1000 <= arr[i] <= 1000

package org.training.Java.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> numbersCount = new HashMap<>();
        for (var number : arr) {
            numbersCount.compute(number, (key, values) -> values == null ? 1 : values + 1);
        }
        return new HashSet<>(numbersCount.values()).size() == numbersCount.size();
    }
}
