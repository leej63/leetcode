/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonat
 */
public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        
    }
    
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int[] target = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        for(int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }
        
        return target;
    }
    // Time Complexity: O(n) - Linear 
    // Space Complexity: O(n) - Linear
}



// Given two arrays of integers 'nums' and 'index'. Your task is to create target array under the following rules:
// - Initially target array is empty.
// - From left to right read nums[i] and index[i], insert at index 'index[i]' the value 'nums[i]' in target array.
// - Repeat the previous step until there are no elements to read in 'nums' and 'index'.
// Return the target array.
// It is guaranteed that the insertion operations will be valid.

// Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
// Output: [0,4,1,3,2]
// Explanation:
// nums     index       target
// 0        0           [0]
// 1        1           [0,1]
// 2        2           [0,1,2]
// 3        2           [0,1,3,2]
// 4        1           [0,4,1,3,2]
