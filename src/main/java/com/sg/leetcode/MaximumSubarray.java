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
public class MaximumSubarray {
    public static void main(String[] args) {
        
    }
    
    public static int maxSubArray(int[] nums) {
        if(nums.length == 0) System.err.println("No values exist in the array.");
        if(nums.length == 1) return nums[0];
        
        int sum = 0, max = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++) {
            if(sum < 0) {
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            
            if(sum > max) {
                max = sum;
            }
        }
        
        return max;
    }
}



// Given an integer array 'nums', find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.


// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: [4,-1,2,1] has the largest sum = 6.
