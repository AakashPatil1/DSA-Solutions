package com.dsa.dsasolutions.sorting.easy;

import java.util.Arrays;

public class SortArrayByParity {
    //https://leetcode.com/problems/sort-array-by-parity/
    public static void main(String[] args) {
        int[] num = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(num)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            if (nums[l] % 2 == 1 && nums[r] % 2 == 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
            if (nums[l] % 2 == 0)
                ++l;
            if (nums[r] % 2 == 1)
                --r;
        }

        return nums;
    }
}
