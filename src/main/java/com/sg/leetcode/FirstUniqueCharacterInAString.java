/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jonat
 */
public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        
    }
    
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        if(s.length() == 0) return -1;
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, Integer.MAX_VALUE);
            } else {
                map.put(ch, i);
            }
        }
        
        int min = Collections.min(map.values());
        return(min == Integer.MAX_VALUE) ? -1 : min;
    }
}



// Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

// Input: s = "leetcode"
// Output: return 0

// Input: s = "loveleetcode"
// Output: return 2

// Note: You may assume the string contains only lowercase English letters.
