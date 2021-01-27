/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.leetcode;

import java.util.Random;

/**
 *
 * @author jonat
 */
public class FindNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        
    }
    
    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        
        if(n == 1) {
            return arr;
        }
        
        int idx = 0;
        if(n % 2 != 0) {
            arr[0] = 0;
            idx++;
        }
        
        for(int i = 1; i <= n/2; i++) {
            arr[idx++] = i;
            arr[idx++] = -i;
        }
        
        return arr;
    }
}



// Given an integer 'n', return any array containing 'n' unique integers such that they add up to 0.


// Input: n = 5
// Output: [-7, -1, 1, 3, 4]
// Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

// Input: n = 3
// Output: [-1,0,1]

// Input: n = 1
// Output: [0]
