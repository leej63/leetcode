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
public class JewelsAndStones {
    public static void main(String[] args) {
        
    }
    
    public static int numJewelsInStones(String jewels, String stones) {
        int jewelCount = 0;
        
        for(int i = 0; i < jewels.length(); i++) {
            for(int j = 0; j < stones.length(); j++) {
                if(stones.charAt(j) == jewels.charAt(i)) {
                    jewelCount++;
                }
            }
        }
        
        return jewelCount;
    }
}


// You're given strings 'jewels' representing the types of stones that are jewels, and 'stones' representing the stones you have. Each character in 'stones' is a type of stone you have. You want to know how many of the stones you have are also jewels.
// Letters are case sensitive, so "a" is considered a different type of stone from "A".

// Input: jewels = "aA", stones = "aAAbbbb"
// Output: 3
