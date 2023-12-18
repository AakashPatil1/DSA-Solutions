package com.dsa.dsasolutions.sorting.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    //https://leetcode.com/problems/contains-duplicate/
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 1};
        System.out.println(containsDuplicate(num));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (final int num : nums)
            if (!seen.add(num))
                return true;

        return false;
    }

}

