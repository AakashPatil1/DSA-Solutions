package com.dsa.dsasolutions.medium;

public class SearchB {
    //https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target =0 ;
        System.out.println(search(nums,target));

    }


    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            final int m = (start + end) / 2;
            if (nums[m] == target)
                return true;
            if (nums[start] == nums[m] && nums[m] == nums[end]) {
                ++start;
                --end;
            } else if (nums[start] <= nums[m]) { // nums[l..m] are sorted
                if (nums[start] <= target && target < nums[m])
                    end = m - 1;
                else
                    start = m + 1;
            } else { // nums[m..n - 1] are sorted
                if (nums[m] < target && target <= nums[end])
                    start = m + 1;
                else
                    end = m - 1;
            }
        }

        return false;
    }
}
