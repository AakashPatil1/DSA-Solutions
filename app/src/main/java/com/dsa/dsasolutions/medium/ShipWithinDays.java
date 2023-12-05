package com.dsa.dsasolutions.medium;

import java.util.Arrays;

public class ShipWithinDays {
    //https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

    public static void main(String[] args) {
        int[] weight = {1,2,3,4,5,6,7,8,9,10};
        int days =5 ;
        System.out.println(shipWithinDays(weight,days));
    }


    public static int shipWithinDays(int[] weights, int days) {
        int start = Arrays.stream(weights).max().getAsInt();
        int end = Arrays.stream(weights).sum();

        while (start < end) {
            final int m = (start + end) / 2;
            if (shipDays(weights, m) <= days)
                end = m;
            else
                start = m + 1;
        }

        return start;
    }

    private static int shipDays(int[] weights, int shipCapacity) {
        int days = 1;
        int capacity = 0;
        for (final int weight : weights)
            if (capacity + weight > shipCapacity) {
                ++days;
                capacity = weight;
            } else {
                capacity += weight;
            }
        return days;
    }
}
