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
public class LongestCommonPrefix {
    public static void main(String[] args) {
        
    }
    
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        
        for(int i = 0; i < strs[0].length(); i++) { // This loop iterates through each char of strs[0].
            for(int j = 1; j < strs.length; j++) { // This loop iterates through each String in strs. 
                if(i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) { // Compares each char with each String in strs, if it doesn't match then it will return a substring. If each char matches then it will keep looping through until something doesn't match. Also, if i (index of char in strs[0]) is greater than length of String being compared to, it will return substring (only if all char before it matches).
                    return strs[0].substring(0, i);
                }            
            }
        }
        
        return strs[0]; // If all characters end up matching, it will return the whole first word.
        
        // Time Complexity: O(n^2) - Quadratic
        // Space Complexity: O(1) - Constant
    }
}



// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".


// Input: strs = ["flower","flow","flight"]
// Output: "fl"

// Input: strs = ["dog","racecar","car"]
// Output: "" -> There is no common prefix among the input strings.