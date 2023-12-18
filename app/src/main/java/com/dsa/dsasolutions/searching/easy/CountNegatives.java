package com.dsa.dsasolutions.easy;

public class CountNegatives {
    //https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
    public static void main(String[] args) {
        int[][] grid = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        System.out.println(countNegatives1(grid));
    }


    //binary search
    public static int countNegatives(int[][] grid) {
        final int m = grid.length;
        final int n = grid[0].length;
        int ans = 0;
        int end = m-1;
        int start = 0;

        while (end>=0 && start < n){
            if (grid[end][start] <0 ){
                ans += n-start;
                end--;
            }else{
                start++;
            }
        }
        return ans;
    }

    //linear search
    public static int countNegatives1(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = grid[i].length-1; j >=0 ; j--) {
                if (grid[i][j] < 0) count++;
                else break;
            }
        }
        return count;
    }
}
