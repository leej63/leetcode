/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jonat
 */
public class ValidAnagram {
    public static void main(String[] args) {
        
    }
    
    public static boolean isAnagram(String s, String t) {
        if(t.length() != s.length()) return false;
        return sortCharacterArray(s).equals(sortCharacterArray(t));
    }
    
    public static String sortCharacterArray(String s) {
        char[] arr = s.toCharArray();
        java.util.Arrays.sort(arr);
        return new String(arr);
    }
    
    public static boolean isAnagram2(String s, String t) {
        if(t.length() != s.length()) return false;
        
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()) {
            if(map.containsKey(c)) {
                int count = map.get(c);
                if(count == 1) {
                    map.remove(c);
                } else {
                    map.put(c, count - 1);
                }
            }
        }
        return map.isEmpty();
    }
    
    public static boolean isAnagram3(String s, String t) {
        int[] counts = new int[26];
        
        for(char ch : s.toCharArray()) {
            counts[ch - 'a']++;
        }
        
        for(char ch : t.toCharArray()) {
            counts[ch - 'a']--;
        }
        
        for(int count : counts) {
            if(count != 0) return false;
        }
        
        return true;
    }
}



// Given two strings 's' and 't', write a function to determine if 't' is an anagram of 's'.

// Input: s = "anagram", t = "nagaram"
// Output: true
// You may assume the string contains only lowercase alphabets.
