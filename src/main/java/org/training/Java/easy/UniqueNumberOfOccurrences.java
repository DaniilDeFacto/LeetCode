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
