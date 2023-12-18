package com.dsa.dsasolutions.sorting.easy;

import java.util.Arrays;

public class MaximumProduct {
//https://leetcode.com/problems/maximum-product-of-three-numbers/description/
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        System.out.println(maximumProduct(num));
    }

    public static int maximumProduct(int[] nums) {
        final int n = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[n - 1] * nums[0] * nums[1], nums[n - 1] * nums[n - 2] * nums[n - 3]);
    }
}
