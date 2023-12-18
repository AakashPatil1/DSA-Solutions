package com.dsa.dsasolutions.sorting.easy;

import java.util.Arrays;

public class FindContentChildren {
    //https://leetcode.com/problems/assign-cookies/
    public static void main(String[] args) {
        int[] num = {1,2,3};
        int[] num1 = {1,1};
        System.out.println(findContentChildren(num,num1));
    }


    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        for (int j = 0; i < g.length && j < s.length; ++j)
            if (g[i] <= s[j])
                ++i;

        return i;
    }
}

