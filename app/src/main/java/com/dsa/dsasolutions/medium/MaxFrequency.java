package com.dsa.dsasolutions.medium;

import java.util.Arrays;

public class MaxFrequency {
    //https://leetcode.com/problems/frequency-of-the-most-frequent-element/

    public static void main(String[] args) {
        int[] nums = {1,2,4};
        int k = 5;
        System.out.println(maxFrequency(nums,k));
    }


    public static int maxFrequency(int[] nums, int k) {
        int ans = 0;
        long sum = 0;

        Arrays.sort(nums);

        for (int l = 0, r = 0; r < nums.length; ++r) {
            sum += nums[r];
            while (sum + k < (long) nums[r] * (r - l + 1))
                sum -= nums[l++];
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}
