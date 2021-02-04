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
public class RomanToInteger {
    public static void main(String[] args) {
        
    }
    
    public static int romanToInt(String s) {
        int[] map = new int[256];
        map['I'] = 1; map['V'] = 5; map['X'] = 10; map['L'] = 50; map['C'] = 100; map['D'] = 500; map['M'] = 1000;
        
        int ret = 0, pre = 1;
        for(int i = s.length() - 1; i >= 0; i--) {
            int cur = map[s.charAt(i)];
            if(cur < pre) {
                ret -= cur;
            } else {
                pre = cur;
                ret += cur;
            }
        }
        return ret;
    }
    
    public static int romanToInt2(String s) {
        int sum = 0;
        char lastChar = 'a';
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch(ch) {
                case 'I':
                    sum += 1;
                    break;
                case 'V':
                    if(lastChar == 'I') sum += 3;
                    else sum += 5;
                    break;
                case 'X':
                    if(lastChar == 'I') sum += 8;
                    else sum += 10;
                    break;
                case 'L':
                    if(lastChar == 'X') sum += 30;
                    else sum += 50;
                    break;
                case 'C':
                    if(lastChar == 'X') sum += 80;
                    else sum += 100;
                    break;
                case 'D':
                    if(lastChar == 'C') sum += 300;
                    else sum += 500;
                    break;
                case 'M':
                    if(lastChar == 'C') sum += 800;
                    else sum += 1000;
                    break;
            }
            lastChar = ch;
        }
        return sum;
    }
}



// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

// Symbol       Value
//  I           1
//  V           5
//  X           10
//  L           50
//  C           100
//  D           500
//  M           1000

// For example, '2' is written as 'II' in Roman numeral, just two one's added together. '12' is written as 'XII', which is simply 'X + II'. The number '27' is written as 'XXVII', which is 'XX + V + II'.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not 'IIII'. Instead, the number four is written as 'IV'. Because the one is before the five we subtract it making four. The same principle applies to number nine, which is written as 'IX'. There are six instances where subtraction is used:

// - 'I' can be placed before 'V' (5) and 'X' (10) to make 4 and 9.
// - 'X' can be placed before 'L' (50) and 'C' (100) to make 40 and 90.
// - 'C' can be placed before 'D'(500) and M (1000) to make 400 and 900.

// Given a roman numeral, convert it to an integer.


// Input: s = "III"
// Output: 3

// Input: s = "IV"
// Output: 4

// Input: s = "IX"
// Output: 9

// Input: s = "LVIII"
// Output: 58