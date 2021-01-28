/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.leetcode;

import java.util.Arrays;

/**
 *
 * @author jonat
 */
public class GenerateAStringWithCharactersThatHaveOddCounts {
    public static void main(String[] args) {
        
    }
    
    public static String generateTheString(int n) {
        char[] arr = new char[n];
        Arrays.fill(arr, 'a');
        if(n % 2 == 0) arr[0] = 'b';
        return new String(arr);
    }
}




// Given an integer 'n', return a string with 'n' characters such that each character in such string occurs an odd number of times;
// The returned string must contain only lowercase English letters. If there are multiple valid strings, return any of them.

// 1 <= n <= 500

// Input: n = 4
// Output: "pppz"
// Explanation "pppz" is a valid string since the character 'p' occurs three times and the character 'z' occurs once. Note that there are many other valid strings such as "ohhh" and "love".