package com.dsa.dsasolutions.easy;

public class NextGreatestLetter {
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public static void main(String[] args) {
        char[] letters = {'x','x','y','y'};
        char target = 'z';
        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end = letters.length;
        while (start < end){
            final int mid = (start +end)/2;
            if (letters[mid] > target){
                end = mid;
            }else {
                start = mid+1;
            }
        }

        return letters[end % letters.length];
    }
}
