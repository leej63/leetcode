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
public class SplitAStringInBalancedStrings {
    public static void main(String[] args) {
        
    }
    
    public static int balancedStringSplit(String s) {
        int r = 0, l = 0, answer = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L') l++;
            else r++;
            if(l == r) answer++;
        }
        
        return answer;
    }
}



// Balanced strings are those who have equal quantity of 'L' and 'R' characters.
// Given a balanced string 's' split it in the maximum amount of balanced strings.
// Return the maximum amount of splitted balanced strings.

// Input: "RLRRLLRLRL"
// Output: 4
// Explanation: s can be split int "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.