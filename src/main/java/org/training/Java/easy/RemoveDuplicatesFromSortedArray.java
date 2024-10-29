package org.training.Java.easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (var i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
