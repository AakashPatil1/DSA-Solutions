package com.dsa.dsasolutions.easy;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class FairCandySwap {
    //https://leetcode.com/problems/fair-candy-swap/
    public static void main(String[] args) {
        int[] alizeSizes = {1,1};
        int[] bobSizes = {2,2};
        System.out.println(fairCandySwap(alizeSizes,bobSizes));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        final int diff = (Arrays.stream(aliceSizes).sum() - Arrays.stream(bobSizes).sum()) / 2;
        Set<Integer> bobSizesSet = Arrays.stream(bobSizes).boxed().collect(Collectors.toSet());

        for (final int aliceSize : aliceSizes) {
            final int target = aliceSize - diff;
            if (bobSizesSet.contains(target))
                return new int[] {aliceSize, target};
        }
        throw new IllegalArgumentException();
    }
}
