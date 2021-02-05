/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 *
 * @author jonat
 */
public class MissingNumber {
    public static void main(String[] args) {
        
    }
    
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        return (int)(n * (n + 1) / 2 - IntStream.of(nums).sum());
    }
    
    public static int missingNumber2(int[] nums) {
        int n = nums.length, sum = n*(n+1)/2, arrsum = 0;
        for(int num : nums) {
            arrsum += num;
        }
        return sum - arrsum;
    }
}



// Given an array 'nums' containing 'n' distinct numbers in the range '[0,n]', return the only number in the range that is missing from the array.
// Follow up: Could you implement a solution using only 'O(1)' extra space complexity and 'O(n)' runtime complexity.


// Input: nums = [3,0,1]
// Output: 2
// Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
