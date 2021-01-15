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
public class DecompressRunLengthEncodedList {
    public static void main(String[] args) {
        
    }
    
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i+=2) {
            for(int j = 0; j < nums[i]; j++) {
                answer.add(nums[i + 1]);
            }
        }
        
        int[] result = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
        
//        return answer.stream().mapToInt(i->i).toArray();
    }
}


// We are given a list of 'nums' of integers representing a list compressed with run-length encoding.
// Consider each adjacent pair of elements [freq, val] = [nums[2*1], nums[2*i+1]]' (with i >= 0). For each such pair, there are 'freq' elements with value 'val' concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.
// Return decompressed list.

// Input: nums = [1,2,3,4]
// Output: [2,4,4,4]
// Explanation:
// The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
// The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
// At the end the concatenation [2] + [4,4,4] is [2,4,4,4].