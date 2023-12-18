package com.dsa.dsasolutions.medium;

import java.util.Arrays;

public class SearchRange {
    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        final int f = firstGreater(nums,target);
        if (f == nums.length || nums[f] != target){
            return new int[]{-1,-1};
        }
        final int e = firstGreater(nums,target+1) -1;
        return new int[]{f,e};
    }

    public static int firstGreater(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        while (start< end){
            final int mid = (start + end) /2;

            if (nums[mid] >= target){
                end = mid;
            }else {
                start = mid +1;
            }
        }
        return end;
    }
}
