/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonat
 */
public class SelfDividingNumbers {
    public static void main(String[] args) {
        
    }
    
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = left; i <= right; i++) {
            if(isSelfDividing(i)) {
                list.add(i);
            }
        }
        
        return list;
    }
    
    public static boolean isSelfDividing(int number) {
        int originalDivident = number;
        while(number > 0) {
            int divider = number % 10;
            if(divider == 0 || originalDivident % divider != 0) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}




// A self-dividing number is a number that is divisible by every digit it contrains.
// For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0 and 128 % 8 == 0.
// Also, a self-dividing number is not allowed to contain the digit zero.
// Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.


// Input: left = 1, right = 22
// Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
// The boundaries of each input argument are 1 <= left <= right <= 10,000