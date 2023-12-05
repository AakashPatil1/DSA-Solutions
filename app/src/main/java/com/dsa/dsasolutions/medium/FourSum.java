package com.dsa.dsasolutions.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    //https://leetcode.com/problems/4sum/


    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(nums,target));

    }





    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        nSum(nums, 4, target, 0, nums.length - 1, new ArrayList<>(), ans);
        return ans;
    }

    private static void nSum(int[] nums, int n, int target, int start, int end, List<Integer> path, List<List<Integer>> ans) {
        if (end - start + 1 < n || target < nums[start] * n || target > nums[end] * n) {
            return;
        }

        if (n == 2) {
            twoSum(nums, target, start, end, path, ans);
            return;
        }

        for (int i = start; i <= end; ++i) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            path.add(nums[i]);
            nSum(nums, n - 1, target - nums[i], i + 1, end, path, ans);
            path.remove(path.size() - 1);
        }
    }

    private static void twoSum(int[] nums, int target, int start, int end, List<Integer> path, List<List<Integer>> ans) {
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                path.add(nums[start]);
                path.add(nums[end]);
                ans.add(new ArrayList<>(path));
                path.remove(path.size() - 1);
                path.remove(path.size() - 1);
                ++start;
                --end;
                while (start < end && nums[start] == nums[start - 1]) {
                    ++start;
                }
                while (start < end && nums[end] == nums[end + 1]) {
                    --end;
                }
            } else if (sum < target) {
                ++start;
            } else {
                --end;
            }
        }
    }
}
