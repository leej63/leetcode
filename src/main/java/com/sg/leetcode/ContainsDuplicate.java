/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jonat
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        
    }
    
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        
        return false;
    }
}


// Given an array of integers, find if the array contains any duplicates.
// Your function should return true if any value appears at least twice in the array, and it hsould return false if every element is distinct.


// Input: [1,2,3,1]
// Output: true

// Input: [1,2,3,4]
// Output: false