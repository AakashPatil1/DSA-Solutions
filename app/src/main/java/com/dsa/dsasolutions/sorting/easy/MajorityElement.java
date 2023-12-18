package com.dsa.dsasolutions.sorting.easy;

public class MajorityElement {
    //https://leetcode.com/problems/majority-element/
    public static void main(String[] args) {
        int[] num = {3, 2, 3};
        System.out.println(majorityElement(num));
    }


    public static int majorityElement(int[] nums) {
        Integer ans = null;
        int count = 0;

        for (final int num : nums) {
            if (count == 0)
                ans = num;
            count += num == ans ? 1 : -1;
        }

        return ans;
    }
}
