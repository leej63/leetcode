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
public class ShuffleString {
    public static void main(String[] args) {
        
    }
    
    public static String restoreString(String s, int[] indices) {
        char[] answerArr = new char[s.length()];
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            answerArr[indices[i]] = s.charAt(i);
        }        
        
        for (int i = 0; i < answerArr.length; i++) {
            answer += answerArr[i];
        }
        
        return answer;
    }
    
    public static String restoreString2(String s, int[] indices) {
        char[] answerArr = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            answerArr[indices[i]] = s.charAt(i);
        }
        
        return String.valueOf(answerArr);
//        return new String(answerArr);
    }
}



// Given a string 's' and an integer array 'indicies' of the same length.
// The string 's' will be shuffled such that the character at the 'ith' position moves to 'indicies[i]' in the shuffled string.
// Return the shuffled string.

// Input: s = "codeleet", indicies = [4,5,6,7,0,2,1,3]
// Output: "leetcode"
// Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
