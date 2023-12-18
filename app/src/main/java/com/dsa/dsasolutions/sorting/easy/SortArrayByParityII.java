package com.dsa.dsasolutions.sorting.easy;

import java.util.Arrays;

public class SortArrayByParityII {
    //https://leetcode.com/problems/sort-array-by-parity-ii/
    public static void main(String[] args) {
        int[] num = {4, 2, 5, 7};
        System.out.println(Arrays.toString(sortArrayByParityII(num)));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        final int n = nums.length;

        for (int i = 0, j = 1; i < n; i += 2, j += 2) {
            while (i < n && nums[i] % 2 == 0)
                i += 2;
            while (j < n && nums[j] % 2 == 1)
                j += 2;
            if (i < n) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        return nums;
    }
}
