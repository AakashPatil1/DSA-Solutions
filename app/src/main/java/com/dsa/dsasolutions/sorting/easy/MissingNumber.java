package com.dsa.dsasolutions.sorting.easy;

public class MissingNumber {
    //https://leetcode.com/problems/missing-number/description/
    public static void main(String[] args) {
        int[] num = {3, 0, 1};
        System.out.println(missingNumber(num));
    }


    public static int missingNumber(int[] nums) {
        int ans = nums.length;

        for (int i = 0; i < nums.length; ++i)
            ans ^= i ^ nums[i];

        return ans;
    }
}
