package com.dsa.dsasolutions.medium;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FindRightInterval {
    //https://leetcode.com/problems/find-right-interval/

    public static void main(String[] args) {
        int[][] nums = {{3,4},{2,3},{1,2}};
        System.out.println(Arrays.toString(findRightInterval(nums)));
    }


    public static int[] findRightInterval(int[][] intervals) {
        final int n = intervals.length;

        int[] ans = new int[n];
        java.util.NavigableMap<Integer, Integer> startToIndex = new TreeMap<>();

        for (int i = 0; i < n; ++i)
            startToIndex.put(intervals[i][0], i);

        for (int i = 0; i < n; ++i) {
            Map.Entry<Integer, Integer> entry = startToIndex.ceilingEntry(intervals[i][1]);
            if (entry == null)
                ans[i] = -1;
            else
                ans[i] = entry.getValue();
        }

        return ans;
    }
}
