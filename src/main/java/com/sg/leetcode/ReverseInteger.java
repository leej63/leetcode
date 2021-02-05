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
public class ReverseInteger {
    public static void main(String[] args) {
        reverse(123);
    }
 
    public static int reverse(int x) {
        int res = 0;
        while(x != 0) {
            if((res * 10) / 10 != res) return 0;
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res;
    }
    
    public static int reverse2(int x) {
        long r = 0;
        while(x != 0) {
            r = (r * 10) + x % 10;
            x = x / 10;
        }
        return (r < Integer.MIN_VALUE || r > Integer.MAX_VALUE) ? 0 : (int)r;
    }
}




// Given a signed 32-bit integer 'x', return 'x' with its digits reversed. If reversing 'x' causes the value to go outside the signed 32-bit integer range '[-2^31, 2^31 - 1]', then return '0'.
// Assum the environment does not allow you to store 64-bit integers (signed or unsigned).


// Input: x = 123
// Output: 321
