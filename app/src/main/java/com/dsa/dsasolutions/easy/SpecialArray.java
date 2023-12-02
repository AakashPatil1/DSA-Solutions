package com.dsa.dsasolutions.easy;

import java.util.Arrays;

public class SpecialArray {
    //https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
    public static void main(String[] args) {
        int[] nums = {3,5};
        System.out.println(specialArray(nums));
    }

    public static int specialArray(int[] nums) {
        Arrays.sort(nums);

        if (nums[0] >= nums.length)
            return nums.length;

        for (int i = 1; i < nums.length; ++i) {
            final int count = nums.length - i;
            if (nums[i - 1] < count && nums[i] >= count)
                return count;
        }

        return -1;
    }
}
