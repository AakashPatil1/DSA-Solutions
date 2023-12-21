package com.dsa.dsasolutions.sorting.Medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LargestNumber {
//https://leetcode.com/problems/largest-number/
    public static void main(String[] args) {
        int[] num = {10,2};
        System.out.println(largestNumber(num));

    }

    public static String largestNumber(int[] nums) {
        final String s = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .sorted((a, b) -> (b + a).compareTo(a + b))
                .collect(Collectors.joining(""));
        return s.startsWith("00") ? "0" : s;
    }
}
