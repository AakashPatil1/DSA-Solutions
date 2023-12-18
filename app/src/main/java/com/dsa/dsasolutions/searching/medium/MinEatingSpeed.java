package com.dsa.dsasolutions.medium;

import java.util.Arrays;

public class MinEatingSpeed {
    //https://leetcode.com/problems/koko-eating-bananas/

    public static void main(String[] args) {

        int[] piles = {3,6,7,11};
        int h = 8;

        System.out.println(minEatingSpeed(piles,h));
    }



    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt();

        while (start < end) {
            final int m = (start + end) / 2;
            if (eatHours(piles, m) <= h)
                end = m;
            else
                start = m + 1;
        }

        return start;
    }


    private static int eatHours(int[] piles, int m) {
        return Arrays.stream(piles).reduce(
                0, (subtotal, pile) -> subtotal + (pile - 1) / m + 1);
    }
}

