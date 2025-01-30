//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//Constraints:
//
//n == nums.length
//1 <= n <= 5 * 10^4
//-10^9 <= nums[i] <= 10^9

package org.training.Java.easy;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 1;
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == result) {
                count++;
            } else {
                count--;
            }
            if (count < 1) {
                result = nums[i];
                count = 1;
            }
        }
        return result;
    }
}
