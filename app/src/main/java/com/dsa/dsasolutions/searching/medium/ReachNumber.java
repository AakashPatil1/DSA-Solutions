package com.dsa.dsasolutions.medium;

public class ReachNumber {
    //https://leetcode.com/problems/reach-a-number/

    public static void main(String[] args) {
        int target = 2;
        System.out.println(reachNumber(target));
    }


    public static int reachNumber(int target) {
        final int newTarget = Math.abs(target);
        int ans = 0;
        int pos = 0;

        while (pos < newTarget)
            pos += ++ans;
        while ((pos - newTarget) % 2 == 1)
            pos += ++ans;

        return ans;
    }
}
