/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.leetcode;

/**
 *
 * @author jonat
 */
public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        
    }
    
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0, n = arr.length;
        
        for(int i = 0; i < n; i++) {
            int temp = 0;
            for(int j = i; j < n; j++) {
                temp += arr[j];
                if((j + i + 1) % 2 != 0) {
                    sum += temp;
                }
            }
        }
        
        return sum;
    }
}



// Given an array of positive integers 'arr', calculate the sum of all possible odd-length subarrays.
// A subarray is a contiguous subsequence of the array.
// Return the sum of all odd-length subarrays of 'arr'.

// Input: arr = [1,4,2,5,3]
// Output: 58
// Explanation: The odd-length subarrays of arr and their sums are:
// [1] = 1
// [4] = 4
// [2] = 2
// [5] = 5
// [3] = 3
// [1,4,2] = 7
// [4,2,5] = 11
// [2,5,3] = 10
// [1,4,2,5,3] = 15
// If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58