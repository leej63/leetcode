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
public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        
    }
    
    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char c : allowed.toCharArray()) {
            set.add(c);
        }
        
        int count = 0;
        for(String word : words) {
            boolean flag = true;
            for(char c : word.toCharArray()) {
                if(!set.contains(c)) {
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
    // Time Complexity: O(n^2) - Quadratic 
    // Space Complexity: O(n) - Linear 
    
}



// You are given a string 'allowed' consisting of distinct characters and an array of strings 'words'. A string is consistent if all characters in the string appear in the string 'allowed'.
// Return the number of consistent strings in array 'words'.

// Input: allowed = "ab", words = ["ad", "bd", "aaab", "baa", "badab"]
// Output: 2
// Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.