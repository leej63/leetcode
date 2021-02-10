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
public class CountNegativeNumbersInASortedMatrix {
    public static void main(String[] args) {
        
    }
    
    public static int countNegatives(int[][] grid) {
        int count = 0;
        
        for(int[] row : grid) {
            for(int num : row) {
                if(num < 0) count++;
            }
        }
        
        return count;
    }
    // Time Complexity: O(n^2) - Quadratic 
    // Space Complexity: O(1) - Constant 
}



// Given a 'm x n' matrix 'grid' which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in 'grid'.


// Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
// Output: 8
// Explanation: There are 8 negative numbers in the matrix.