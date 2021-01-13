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
public class RunningSumOf1DArray {
    public static void main(String[] args) {
        
    }
    
 
    public static int[] runningSum(int[] nums) {
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}



// Given an array 'nums'. We define a running sum of an array as runningSum[i] = sum(nums[0]...nums[i]).
// Return the running sum of 'nums'.

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]

