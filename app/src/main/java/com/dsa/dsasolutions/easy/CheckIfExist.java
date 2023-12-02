package com.dsa.dsasolutions.easy;

import java.util.HashSet;
import java.util.Set;

public class CheckIfExist {
    //https://leetcode.com/problems/check-if-n-and-its-double-exist/

    public static void main(String[] args) {
       int[] arr = {10,2,5,3};
       System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();

        for (final int a : arr) {
            if (seen.contains(a * 2) || a % 2 == 0 && seen.contains(a / 2))
                return true;
            seen.add(a);
        }

        return false;
    }
}
