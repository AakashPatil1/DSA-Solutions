package com.dsa.dsasolutions.sorting.easy;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        int[] num = {4000, 3000, 1000, 2000};
        System.out.println(average(num));
    }

    public static double average(int[] salary) {
        final double sum = Arrays.stream(salary).sum();
        final int max = Arrays.stream(salary).max().getAsInt();
        final int min = Arrays.stream(salary).min().getAsInt();
        return (sum - max - min) / (salary.length - 2);
    }
}
