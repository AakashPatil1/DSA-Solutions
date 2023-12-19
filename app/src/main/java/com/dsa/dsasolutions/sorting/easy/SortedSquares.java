package com.dsa.dsasolutions.sorting.easy;

import java.util.Arrays;

public class SortedSquares {
    //https://leetcode.com/problems/squares-of-a-sorted-array/
    public static void main(String[] args) {
        int[] num = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(num)));
    }

    public static int[] sortedSquares(int[] nums) {
        final int n = nums.length;
        int[] ans = new int[n];
        int i = n - 1;

        for (int l = 0, r = n - 1; l <= r;)
            if (Math.abs(nums[l]) > Math.abs(nums[r]))
                ans[i--] = nums[l] * nums[l++];
            else
                ans[i--] = nums[r] * nums[r--];

        return ans;
    }
}
