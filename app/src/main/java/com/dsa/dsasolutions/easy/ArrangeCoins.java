package com.dsa.dsasolutions.easy;

public class ArrangeCoins {
//https://leetcode.com/problems/arranging-coins/
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }


    public static int arrangeCoins(int n) {
        return (int) (-1 + Math.sqrt(8 * n + 1)) / 2;
    }
}
