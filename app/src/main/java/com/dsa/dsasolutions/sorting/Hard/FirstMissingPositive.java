package com.dsa.dsasolutions.sorting.Hard;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] num = {1,2,0};
        System.out.println(firstMissingPositive(num));

    }


    public static int firstMissingPositive(int[] nums) {
        final int n = nums.length;

        // Correct slot:
        // nums[i] = i + 1
        // nums[i] - 1 = i
        // nums[nums[i] - 1] = nums[i]
        for (int i = 0; i < n; ++i)
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1])
                swap(nums, i, nums[i] - 1);

        for (int i = 0; i < n; ++i)
            if (nums[i] != i + 1)
                return i + 1;

        return n + 1;
    }

    private static void swap(int[] nums, int i, int j) {
        final int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
