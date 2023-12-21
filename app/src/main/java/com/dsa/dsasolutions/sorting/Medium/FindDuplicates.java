package com.dsa.dsasolutions.sorting.Medium;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] num = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(num));
    }


    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (final int num : nums) {
            nums[Math.abs(num) - 1] *= -1;
            if (nums[Math.abs(num) - 1] > 0)
                ans.add(Math.abs(num));
        }

        return ans;

    }
}
