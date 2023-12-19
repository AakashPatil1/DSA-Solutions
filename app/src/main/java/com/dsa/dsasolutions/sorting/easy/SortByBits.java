package com.dsa.dsasolutions.sorting.easy;

import java.util.Arrays;

public class SortByBits {
    //https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/description/
    public static void main(String[] args) {
        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(sortByBits(num)));
    }

    public static int[] sortByBits(int[] arr) {
        Integer[] A = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(A,
                (a, b)
                        -> Integer.bitCount(a) == Integer.bitCount(b)
                        ? a - b
                        : Integer.bitCount(a) - Integer.bitCount(b));
        return Arrays.stream(A).mapToInt(Integer::intValue).toArray();
    }
}
