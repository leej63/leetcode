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
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        
    }
    
    public static int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        
        for(int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                if(j != i && temp == nums[j]) {
                    goodPairs++;
                }
            }
        }
        
        return goodPairs;
    }
}



// Given an array of integers 'nums'.
// A pair '(i,j)' is called good if 'nums[i]' == 'nums[j]' and 'i < j'.
// Return the number of good pairs.

// Input: nums = [1,2,3,1,1,3]
// Output: 4
// Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
