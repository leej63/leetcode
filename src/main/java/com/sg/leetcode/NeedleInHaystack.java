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
public class NeedleInHaystack {
    public static void main(String[] args) {
        
    }
    
    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        
        for(int i = 0; ; i++) { // The length of haystack
            for(int j = 0; ; j++) { // The length of needle
                if(j == needle.length()) return i; // If at this point we have navigated through the entire length of needle, we have found a solution, haystack[i].
                if(i + j == haystack.length()) return -1; // This happens when we run out of elements in haystack, but there are still elements in needle.
                if(needle.charAt(j) != haystack.charAt(i + j)) break; // We stop comparing after needle[j], so i will be incremented and cycle repeats itself.
            }
        }
    }
}
