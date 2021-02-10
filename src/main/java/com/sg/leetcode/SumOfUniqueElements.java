/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.leetcode;

import static java.lang.reflect.Array.set;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jonat
 */
public class SumOfUniqueElements {
    public static int sumOfUnique(int[] nums) {
        int frequency[] = new int[101];
        for(int i = 0; i < nums.length; i++) {
            frequency[nums[i]]++;
        }
        
        int sum = 0;
        for(int i = 1; i < 101; i++) {
            if(frequency[i] == 1) {
                sum += i;
            }
        }
        
        return sum;
    }
    
    public static int sumOfUnique2(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(int num : map.keySet()) {
            if(map.get(num) == 1) {
                sum += num;
            }
        }
        
        return sum;
    }
    
    public static int sumOfUnique3(int[] nums) {
        int sum = 0;
        int[] seen = new int[101];
        
        for(int num : nums) {
            seen[num]++;
            if(seen[num] == 1) sum += num;
            else if(seen[num] == 2) sum -= num;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        
    }
}



// You are given an integer array 'nums'. The unique elements of an array are the elements that appear exactly once in the array.
// Return the sum of all the unique elements of 'nums'.


// Input: nums = [1,2,3,2]
// Output: 4
// Explanation: The unique elements are [1,3], and the sum is 4.
