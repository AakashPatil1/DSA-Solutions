package com.dsa.dsasolutions.easy;

public class IsPerfectSquare {
    //https://leetcode.com/problems/valid-perfect-square/
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }


    public static boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num;

        while (start < end){
            final long mid = (start + end) /2;
            if (mid >= num/mid){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return  start * start == num;
    }
}
