package com.dsa.dsasolutions.sorting.easy;

import java.util.Arrays;

public class LargestPerimeter {
    //https://leetcode.com/problems/largest-perimeter-triangle/
    public static void main(String[] args) {
        int[] num = {2,1,2};
        System.out.println(largestPerimeter(num));
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i > 1; --i)
            if (nums[i - 2] + nums[i - 1] > nums[i])
                return nums[i - 2] + nums[i - 1] + nums[i];

        return 0;
    }
}
