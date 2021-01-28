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
public class IncreasingDecreasingString {
    public static void main(String[] args) {
        
    }
    
    public static String sortString(String s) {
        int n = s.length(), cnt[] = new int[26];
        
        for(char ch : s.toCharArray()) cnt[ch - 'a']++;
        
        StringBuilder sb = new StringBuilder();
        
        while(n > 0) {
            for(int i = 0; i < 26 && n > 0; i++) {
                if(cnt[i] > 0) {
                    cnt[i]--;
                    sb.append((char)('a' + i));
                    n--;
                }
            }
            
            for(int i = 25; i >= 0 && n > 0; i--) {
                if(cnt[i] > 0) {
                    cnt[i]--;
                    sb.append((char)('a' + i));
                    n--;
                }
            }
        }
        
        return sb.toString();
    }
}



// Given a string 's'. You should re-order the string using the following algorithm.
// 1. Pick the smallest character from s and append it to the result.
// 2. Pick the smallest character from s which is greater than the last appended character to the result and append it.
// 3. Repeat step 2 until you cannot pick more characters.
// 4. Pick the largest character from s and append it to the result.
// 5. Pick the largest character from s which is smaller than the last appended character to the result and append it.
// 6. Repeat step 5 until you cannot pick more characters.
// 7. Repeat the steps from 1 to 6 until you pick all characters from s.
// In each step, if the smallest or the largest character appears more than once you can choose any occurence and append it to the result.
// Return the result string after sorting s with this algorithm.


// Input: s = "aaaabbbbcccc"
// Output: "abccbaabccba"
// Explanation: After steps 1, 2 and 3 of the first iteration, result = "abc"
// After steps 4, 5 and 6 of the first iteration, result = "abccba"
// First iteration is done. Now s = "aabbcc" and we go back to step 1.
// After steps 1, 2 and 3 of second iteration, result = "abccbaabc"
// After steps 4, 5 and 6 of the second iteration, result = "abccbaabccba"