package com.dsa.dsasolutions.hard;

public class FindInMountainArray {
    //https://leetcode.com/problems/find-in-mountain-array/

    public static void main(String[] args) {

    }


    public int findInMountainArray(int target, MountainArray mountainArr) {
        final int n = mountainArr.length();
        final int peakIndex = peakIndexInMountainArray(mountainArr, 0, n - 1);

        final int leftIndex = searchLeft(mountainArr, target, 0, peakIndex);
        if (mountainArr.get(leftIndex) == target)
            return leftIndex;

        final int rightIndex = searchRight(mountainArr, target, peakIndex + 1, n - 1);
        if (mountainArr.get(rightIndex) == target)
            return rightIndex;

        return -1;
    }


    private int peakIndexInMountainArray(MountainArray A, int start, int end) {
        while (start < end) {
            final int m = (start + end) / 2;
            if (A.get(m) < A.get(m + 1))
                start = m + 1;
            else
                end = m;
        }
        return start;
    }

    private int searchLeft(MountainArray A, int target, int start, int end) {
        while (start < end) {
            final int m = (start + end) / 2;
            if (A.get(m) < target)
                start = m + 1;
            else
                end = m;
        }
        return start;
    }

    private int searchRight(MountainArray A, int target, int start, int end) {
        while (start < end) {
            final int m = (start + end) / 2;
            if (A.get(m) > target)
                start = m + 1;
            else
                end = m;
        }
        return start;
    }
}

