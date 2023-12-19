package com.dsa.dsasolutions.sorting.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayRankTransform {
    //https://leetcode.com/problems/rank-transform-of-an-array/description/
    public static void main(String[] args) {
        int[] num = {40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(num)));
    }

    public static int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = arr.clone();
        Map<Integer, Integer> rank = new HashMap<>();

        Arrays.sort(sortedArr);

        for (final int a : sortedArr)
            rank.putIfAbsent(a, rank.size() + 1);

        for (int i = 0; i < arr.length; ++i)
            arr[i] = rank.get(arr[i]);

        return arr;
    }
}
