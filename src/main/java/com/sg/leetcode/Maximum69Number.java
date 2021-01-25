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
public class Maximum69Number {
    public static void main(String[] args) {
        
    }
    
    public static int maximum69Number(int num) {
        char[] numArr = Integer.toString(num).toCharArray();
        
        for(int i = 0; i < numArr.length; i++) {
            if(numArr[i] == '6') {
                numArr[i] = '9';
                break;
            }
        }
        
        return Integer.parseInt(String.valueOf(numArr));
    }
}



// Given a positive integer 'num' consisting only of digits 6 and 9.
// Return the maximum number you can get by changing at most one digit (6 becomes 9, 9 becomes 6).


// Input: 9669
// Output: 9969
// Explanation:
// Changing the first digit results in 6669.
// Changing the second digit results in 9969.
// Changing the third digit results in 9699.
// Changing the fourth digit results in 9666. 
// The maximum number is 9969.
