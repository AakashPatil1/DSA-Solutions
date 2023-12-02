package com.dsa.dsasolutions.easy;

public class SearchInsert {
    //https://leetcode.com/problems/search-insert-position/
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums,target));
    }


    //linear search

    public static int searchInsert1(int[] nums, int target) {
        for(int i = 0;i < nums.length;i++){
            if (nums[i] == target){
                return i;
            }
        }
        return 0;
    }

    //binary search

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;

        while (start < end){
            final int mid = (start +end) /2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target) {
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
