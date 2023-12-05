package com.dsa.dsasolutions.medium;

import java.util.Arrays;

public class FindPeakGrid {
    //https://leetcode.com/problems/find-a-peak-element-ii/

    public static void main(String[] args) {
        int[][] mat = {{1,4},{3,2}};
        System.out.println(Arrays.toString(findPeakGrid(mat)));

    }
    public static int[] findPeakGrid(int[][] mat) {
        int start = 0;
        int end = mat.length - 1;

        while (start < end) {
            final int m = (start + end) / 2;
            if (Arrays.stream(mat[m]).max().getAsInt() >= Arrays.stream(mat[m + 1]).max().getAsInt())
                end = m;
            else
                start = m + 1;
        }

        return new int[] {start, getMaxIndex(mat[start])};
    }

    private static int getMaxIndex(int[] A) {
        int[] res = {0, A[0]};
        for (int i = 1; i < A.length; ++i)
            if (A[i] > res[1])
                res = new int[] {i, A[i]};
        return res[0];
    }
}
