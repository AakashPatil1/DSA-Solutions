package com.dsa.dsasolutions.sorting.easy;

public class MaxProduct {
    //https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
    public static void main(String[] args) {
        int[] num =  {3,4,5,2};
        System.out.println(maxProduct(num));
    }

    public static int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;

        for (final int num : nums)
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

        return (max1 - 1) * (max2 - 1);
    }
}
