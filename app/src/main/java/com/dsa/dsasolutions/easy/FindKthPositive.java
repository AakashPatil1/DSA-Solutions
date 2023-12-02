package com.dsa.dsasolutions.easy;

public class FindKthPositive {
//https://leetcode.com/problems/kth-missing-positive-number/
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));

    }

    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length;

        while (start<end){
            final int mid = (start +end) /2;
            if (arr[mid] -mid -1 >=k){
                end = mid;
            }else {
                start = mid +1;
            }
        }
        return start + k;
    }
}
