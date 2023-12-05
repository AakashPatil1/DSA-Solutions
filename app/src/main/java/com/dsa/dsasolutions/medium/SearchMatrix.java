package com.dsa.dsasolutions.medium;

public class SearchMatrix {
    //https://leetcode.com/problems/search-a-2d-matrix/


    public static void main(String[] args) {

        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
    }


    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;

        final int m = matrix.length;
        final int n = matrix[0].length;
        int start = 0;
        int end = m * n;

        while (start < end) {
            final int mid = (start + end) / 2;
            final int i = mid / n;
            final int j = mid % n;
            if (matrix[i][j] == target)
                return true;
            if (matrix[i][j] < target)
                start = mid + 1;
            else
                end = mid;
        }

        return false;
    }
}
