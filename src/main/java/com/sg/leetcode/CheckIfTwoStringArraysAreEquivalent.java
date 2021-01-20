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
public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        
    }
    
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String one = String.join("", word1);
        String two = String.join("", word2);
        
        return one.equals(two);
    }
    
    public static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        
        for(String word : word1) {
            str1.append(word);
        }
        for(String word : word2) {
            str2.append(word);
        }
        
        return str1.toString().equals(str2.toString());
    }
}



// Given two string arrays 'word1' and 'word2', return 'true' if the two arrays represent the same string, and 'false' otherwise.
// A string is represented by an array if the array elements concatenated in order forms the string.

// Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
// Output: true
// Explanation:
// word1 represents string "ab" + "c" -> "abc"
// word2 represents string "a" + "bc" -> "abc"
// The strings are the same, so return true.
