package com.dsa.dsasolutions.sorting.easy;

public class HeightChecker {

    public static void main(String[] args) {

        int[] num = {1,1,4,2,1,3};
        System.out.println(heightChecker(num));
    }


    public static int heightChecker(int[] heights) {
        int ans = 0;
        int currentHeight = 1;
        int[] count = new int[101];

        for (int height : heights)
            count[height]++;

        for (int height : heights) {
            while (count[currentHeight] == 0)
                currentHeight++;
            if (height != currentHeight)
                ans++;
            count[currentHeight]--;
        }

        return ans;
    }
}
