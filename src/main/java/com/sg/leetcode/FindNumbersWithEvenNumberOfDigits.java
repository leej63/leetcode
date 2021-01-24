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
public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        
    }
    
    public static int findNumbers(int[] nums) {
        String[] stringNums = new String[nums.length];
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            stringNums[i] = String.valueOf(nums[i]);
            if(stringNums[i].length() % 2 == 0) {
                count++;
            }
        }
        
        return count;
    }
}



// Given an array of 'nums' of integers, return how many of them contain an even number of digits.

// Input: nums = [12,345,2,6,7896]
// Output: 2
// Explanation:
// 12 contains 2 digits (even number of digits). 
// 345 contains 3 digits (odd number of digits). 
// 2 contains 1 digit (odd number of digits). 
// 6 contains 1 digit (odd number of digits). 
// 7896 contains 4 digits (even number of digits). 
// Therefore only 12 and 7896 contain an even number of digits.
