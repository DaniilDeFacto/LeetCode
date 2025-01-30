//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.
//
//Constraints:
//
//1 <= nums.length <= 10^4
//-2^31 <= nums[i] <= 2^31 - 1

package org.training.Java.easy;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                var temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
