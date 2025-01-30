//Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
//
//    answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
//    answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
//
//Note that the integers in the lists may be returned in any order.
//
//Constraints:
//
//1 <= nums1.length, nums2.length <= 1000
//-1000 <= nums1[i], nums2[i] <= 1000

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
