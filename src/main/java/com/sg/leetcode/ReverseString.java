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
public class ReverseString {
    public static void main(String[] args) {
        
    }
    
    public static void reverseString(char[] s) {
        if(s == null || s.length < 2) {
            return;
        }
        
        for(int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}


// Write a function that reverses a string. The input string is given as an array of characters 'car[]'.
// Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
// You may assume all the characters consist of printable ascii characters.


// Input: ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
