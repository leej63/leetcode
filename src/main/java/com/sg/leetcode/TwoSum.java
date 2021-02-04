/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jonat
 */
public class TwoSum {
    public static void main(String[] args) {
        
    }
    
    public static int[] twoSum(int[] nums, int target) {
        int tempOne = 0;
        int tempTwo = 0;
        for(int i = 0; i < nums.length; i++) {
            tempOne = nums[i];
            for(int j = 0; j < nums.length; j++) {
                if(j != i) {
                    tempTwo = nums[j];
                    if(tempOne + tempTwo == target) {
                        int[] indices = {i, j};
                        return indices;
                    }
                }
            }
        }
        return null;
    }
    
    public static int[] twoSum2(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    
    public static int[] twoSum3(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}



// Given an array of integers 'nums' and an integer 'target', return indices of the two numbers such that they add up to 'target'.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.


// Input: [2,7,11,15], target = 9
// Output: [0,1]
// Output: Because nums[0] + nums[1] == 9, we return [0,1].
