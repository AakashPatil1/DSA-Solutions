package com.dsa.dsasolutions.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Intersection {
    //https://leetcode.com/problems/intersection-of-two-arrays/
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        System.out.println(intersection(num1,num2));

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set  = Arrays.stream(nums1).boxed().collect(Collectors.toSet());

        for (final int num: nums2) {
            if (set.remove(num)){
                ans.add(num);
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }


}
