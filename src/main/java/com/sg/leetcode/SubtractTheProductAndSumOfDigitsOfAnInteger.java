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
public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {
        subtractProductAndSum(234);
    }
    
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        
        while(n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        
        return product - sum;
    }
    
    public static int subtractProductAndSum2(int n) {
        int product = 1;
        int sum = 0;
        
        for (char c : String.valueOf(n).toCharArray()) {
            int digit = Character.getNumericValue(c);
            product *= digit;
            sum += digit;
        }
        
        return product - sum;
    }
}



// Given an integer number 'n', return the difference between the product of its digits and the sum of its digits.

// Input: n = 234
// Output: 15
// Explanation:
// Product of digits = 2 * 3 * 4 = 24
// Sum of digits = 2 + 3 + 4 = 9
// Result = 24 - 9 = 15
