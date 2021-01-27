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
public class XOROperationInAnArray {
    public static void main(String[] args) {
        System.out.println(5 ^ 7 ^ 9 ^ 11 ^ 13 ^ 15 ^ 17 ^ 19 ^ 21 ^ 23);
    }
    
    public static int xorOperation(int n, int start) {
        int answer = 0;
        for(int i = 0; i < n; i++) {
            answer ^= start + (2*i);
        }
        return answer;
    }
}



// Given an integer 'n' and an integer 'start'.
// Define an array 'nums' where 'nums[i] = start + 2 * i' (0-indexed) and 'n == nums.length'.
// Return the bitwise XOR of all elements of 'nums'.


// Input: n = 5, start = 0
// Output: 8
// Explanation: Array nums is equal to [0,2,4,6,8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
// Where "^" corresponds to bitwise XOR operator.
