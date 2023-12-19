package com.dsa.dsasolutions.sorting.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference {
//https://leetcode.com/problems/minimum-absolute-difference
    public static void main(String[] args) {
        int[] num = {4,2,1,3};
        System.out.println(minimumAbsDifference(num));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 0; i + 1 < arr.length; ++i) {
            int diff = arr[i + 1] - arr[i];
            if (diff < min) {
                min = diff;
                ans.clear();
            }
            if (diff == min)
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
        }

        return ans;
    }
}
