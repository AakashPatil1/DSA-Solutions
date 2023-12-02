package com.dsa.dsasolutions.easy;

public class MySqrt {
    //https://leetcode.com/problems/sqrtx/
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        if (x < 2)
            return x; // return x if it is 0 or 1

        int left = 2, right = x / 2; // initialize left and right pointers
        int mid;
        long num; // use long to store result of mid * mid to prevent overflow
        while (left <= right) { // binary search for the square root
            mid = left + (right - left) / 2; // find the middle element
            num = (long) mid * mid;
            if (num > x)
                right = mid - 1; // if mid * mid is greater than x, set right to mid - 1
            else if (num < x)
                left = mid + 1; // if mid * mid is less than x, set left to mid + 1
            else
                return mid; // if mid * mid is equal to x, return mid
        }

        return right; // return right after the loop
    }
}
