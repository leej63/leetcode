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
public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        
    }
    
    public static int uniqueMorseRepresentations(String[] words) {
        if(words == null || words.length == 0) return 0;
        
        String[] table = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        
        for(String word : words) {
            StringBuilder strb = new StringBuilder();
            for(char ch : word.toCharArray()) {
                strb.append(table[ch - 'a']);
            } 
            set.add(strb.toString());
        }
        
        return set.size();
    }
}



// International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
// For convenience, the full table for the 26 letters of the English alphabet is given below:
// "[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]"
// Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-..--...", (which is the concatenation "-.-" + ".-" + "-..."). We'll call such a concatenation, the transformation of a word.
// Return the number of different transformations among all words we have.


// Input: words = ["gin", "zen", "gig", "msg"]
// Output: 2
// Explanation:
// The transformation of each word is:
// "gin" -> "--...-."
// "zen" -> "--...-."
// "gig" -> "--...--."
// "msg" -> "--...--."
// There are 2 different transformations, "--...-." and "--...--.".