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
public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }
    
    public static boolean halvesAreAlike(String s) {
        int aCount = 0, bCount = 0;
        
        String a = s.substring(0, s.length() / 2).toLowerCase();
        String b = s.substring(s.length() / 2, s.length()).toLowerCase();
        
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                aCount++;
            }
            if(b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o' || b.charAt(i) == 'u') {
                bCount++;
            }
        }
        
        if(aCount == bCount) {
            return true;
        }
        
        return false;
    }
    
    public static boolean halvesAreAlike2(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');set.add('e');set.add('i');set.add('o');set.add('u');
        set.add('A');set.add('E');set.add('I');set.add('O');set.add('U');
        
        int firstHalf = 0, secondHalf = 0;
        for(int i = 0; i < s.length() / 2; i++) {
            if(set.contains(s.charAt(i))) firstHalf++;
            if(set.contains(s.charAt(s.length() - i - 1))) secondHalf++;
        }
        
        return firstHalf == secondHalf;
    }
}




// You are given a string 's' of even length. Split this string into two halves of equal lengths, and let 'a' be the first half and 'b' be the second half.
// Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that 's' contains uppercase and lowercase letters.
// Return 'true' if 'a' and 'b' are alike. Otherwise, return 'false'.


// Input: s= "textbook"
// Output: false
// Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
