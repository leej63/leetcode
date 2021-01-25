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
public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
//        freqAlphabets("10#11#12");
        int num1 = 'k';
        System.out.println("NUMBER: " + num1);
    }
    
    public static String freqAlphabets(String s) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            // if j-z / 10#-26#
            if(i + 2 < s.length() && s.charAt(i + 2) == '#') {
                char c = (char) (Integer.parseInt(Character.toString(s.charAt(i)) + s.charAt(i + 1)) + 96);
                answer.append(c);
                i += 2;
            } else { // if a-i / 1-9 
                char c = (char) (Integer.parseInt(Character.toString(s.charAt(i))) + 96);
                answer.append(c);
            }
        }
        
        return answer.toString();
    }
}



// Given a string 's' formed by digits ('0' - '9') and '#'. We want to map 's' to English lowercase characters as follows:
// - Characters ('a' to 'i') are represented by ('1' to '9') respectively.
// - Characters ('j' to 'z') are repsented by ('10#' to '26#') respectively.
// Return the string formed after mapping.
// It's guaranteed that a unique mapping will always exist.


// Input: s = "10#11#12"
// Output: "jkab"
// Explanation: "j" -> "10#", "k" -> "11#", "a" -> "1", "b" -> "2".
