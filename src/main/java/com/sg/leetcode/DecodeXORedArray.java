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
public class DecodeXORedArray {
    public static void main(String[] args) {
        System.out.println("1 ^ 0 = " + (1 ^ 0));
        System.out.println("0 ^ 2 = " + (0 ^ 2));
        System.out.println("2 ^ 1 = " + (2 ^ 1));
    }
    
    public static int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length + 1];
        result[0] = first;
        for(int i = 0; i < encoded.length; i++) {
            result[i + 1] = result[i] ^ encoded[i];
        }
        return result; 
   }
}



// There is a hidden integer array 'arr' that consists of 'n' non-negative integers.
// It was encoded into another integer array 'encoded' of length 'n - 1', such that 'encoded[i] = arr[i] XOR arr[i + 1]'. For example, if 'arr = [1,0,2,1]', then 'encoded = [1,2,3]'.
// You are given the 'encoded' array. You are also given an integer 'first', that is the first element of 'arr', i.e. 'arr[0]'.
// Return the original array 'arr'. It can be proved that the answer exists and is unique.

// Input: encoded = [1,2,3], first = 1
// Output: [1,0,2,1]
// Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
