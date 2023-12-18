package com.dsa.dsasolutions.easy;

public class FirstBadVersion {
//https://leetcode.com/problems/first-bad-version/
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    public static void main(String[] args) {

    }

    public int firstBadVersion(int n) {
        int start= 1;
        int end =n;
        while (start<=end){
            int mid = start + (end - start ) /2;
            if (isBadVersion(mid)){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return start;
    }
}
