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
public class MajorityElement {
    public static void main(String[] args) {
        
    }
    
    public static int majorityElement(int[] nums) {
        int n = nums.length, majorityElement = nums[0], count = 1;
        
        for(int i = 1; i < n; i++) {
            if(nums[i] == majorityElement) {
                count++;
            } else if (count > 0) {
                count--;
            } else {
                majorityElement = nums[i];
                count = 1;
            }
        }
        
        return majorityElement;
    }
    
    public static int majorityElement2(int[] nums) {
        int currentCandidate = nums[0];
        int counter = 1;
        for(int i = 1; i < nums.length; i++) {
            if(counter == 0) {
                currentCandidate = nums[i];
                counter = 1;
            } else {
                if(currentCandidate == nums[i]) {
                    counter++;
                } else {
                    counter--;
                }
            }
        }
        return currentCandidate;
    }
}


// Given an array 'nums' of size 'n', return the majority element.
//  The majority element is the element that appears more than '[n / 2]' times. You may assume that the majority element always exists in the array.


// Input: [3,2,3]
// Output: 3
