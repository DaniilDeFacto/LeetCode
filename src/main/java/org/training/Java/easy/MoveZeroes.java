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
