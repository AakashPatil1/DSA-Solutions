package com.dsa.dsasolutions.sorting.easy;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] num = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(num));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (final int num : nums) {
            final int index = Math.abs(num) - 1;
            nums[index] = -Math.abs(nums[index]);
        }

        for (int i = 0; i < nums.length; ++i)
            if (nums[i] > 0)
                ans.add(i + 1);

        return ans;
    }
}
