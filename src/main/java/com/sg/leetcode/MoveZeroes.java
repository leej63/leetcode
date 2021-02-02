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
public class MoveZeroes {
    public static void main(String[] args) {
        
    }
    
    public static void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for(int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}



// Given an array 'nums', write a function to move all '0's' to the end of it while maintaining the relative order of the non-zero elements.


// Input: [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Note:
// - 1. You must do this in-place without making a copy of the array.
// - 2. Minimize the total number of operations.
