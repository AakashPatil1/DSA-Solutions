package com.dsa.dsasolutions.easy;

import java.util.Arrays;

public class TwoSum {
    //https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
    public static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(num,target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length -1;
        while (numbers[start] + numbers[end] != target){
            if (numbers[start] + numbers[end] < target){
                start++;
            }else{
                end--;
            }
        }
        return new int[]{start+1,end+1};
    }
}
