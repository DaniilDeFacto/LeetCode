package org.training.Java.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getDifference(nums1, nums2), getDifference(nums2, nums1));
    }

    List<Integer> getDifference(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<> ();
        Set<Integer> numbers2 = new HashSet<>();
        for (int num : nums2) {
            numbers2.add(num);
        }
        for (int num : nums1) {
            if (!numbers2.contains(num)) {
                result.add(num);
            }
        }
        return new ArrayList<>(result);
    }
}
