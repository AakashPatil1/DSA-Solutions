package com.dsa.dsasolutions.easy;

public class GuessNumber {
//https://leetcode.com/problems/guess-number-higher-or-lower/
    public static void main(String[] args) {

    }

    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end){
            int mid = start + (end- start) / 2; // find the middle element
            if(guess(mid) == 0){    // extends GuessGame
                return mid;         // guess equal 0 return
            } else if (guess(mid)== 1) {
                start = mid +1;   //if guess mid >  target
            }else{
                end = mid-1;        //if guess mid <  target
            }
        }
        return -1;
    }
}
