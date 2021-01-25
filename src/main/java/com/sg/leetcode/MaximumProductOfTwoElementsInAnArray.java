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
public class MaximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{3,4,5,2}));
    }
    
    public static int maxProduct(int[] nums) {
        int max = 0, max2 = 0;
        int maxIdx = 0, maxIdx2 = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(i != maxIdx && nums[i] > max2) {
                max2 = nums[i];
                maxIdx2 = i;
            }
        }
        
        return ((max - 1) * (max2 - 1));
    }
    
    public static int maxProduct2(int[] nums) {
        int firstHighest = 0, secondHighest = 0;
        
        for (int num : nums) {
            if(num > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = num;
            } else if(num > secondHighest) {
                secondHighest = num;
            }
        }
        return (firstHighest - 1) * (secondHighest - 1);
    }
}



// Given the array of integers 'nums', you will choose two different indices 'i' and 'j' of that array. Return the maximum value of '(nums[i]-1)*(nums[j]-1)'.


// Input: nums = [3,4,5,2]
// Output: 12
// Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
