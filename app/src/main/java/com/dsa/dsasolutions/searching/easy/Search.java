package com.dsa.dsasolutions.easy;

import java.util.Arrays;

public class Search {
    //https://leetcode.com/problems/binary-search/

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target =9;
        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target) {
        final int i = Arrays.binarySearch(nums, target);
        return i < 0 ? -1 : i;
    }
}
