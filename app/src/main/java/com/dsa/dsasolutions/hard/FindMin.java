package com.dsa.dsasolutions.hard;

public class FindMin {
    //https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

    public static void main(String[] args) {
        int[] nums = {1,3,5};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length -1;

        while (start < end){
            final int mid = (start+end) /2;
            if (nums[mid] == nums[end]){
                end--;
            } else if (nums[mid] < nums[end]) {
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return nums[start];
    }
}
