package com.dsa.dsasolutions.sorting.easy;

import java.util.Arrays;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] num = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] num1 = {2, 1, 4, 3, 9, 6};
        System.out.println(Arrays.toString(relativeSortArray(num, num1)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        int[] count = new int[1001];
        int i = 0;

        for (int a : arr1)
            count[a]++;

        for (int a : arr2)
            while (count[a]-- > 0)
                ans[i++] = a;

        for (int num = 0; num < 1001; ++num)
            while (count[num]-- > 0)
                ans[i++] = num;

        return ans;
    }
}
