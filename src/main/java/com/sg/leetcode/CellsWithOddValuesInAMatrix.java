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
public class CellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        
    }
    
    public static int oddCells(int n, int m, int[][] indices) {
        // creating new matrix
        
        int[][] matrix = new int[n][m];
        
        // adding value of 1 in rows of matrix
        for(int i = 0; i < indices.length; i++) {
            int a = indices[i][0];
            for(int j = 0; j < m; j++) {
                matrix[a][j] = matrix[a][j] + 1;
            }
        }
        
        // adding value of 1 in columns of matrix
        for(int i = 0; i < indices.length; i++) {
            int b = indices[i][1];
            for(int j = 0; j < n; j++) {
                matrix[j][b] = matrix[j][b] + 1;
            }
        }
        
        // finding all odd numbers in matrix
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] % 2 == 1) {
                    count++;
                }
            }
        }
        
        return count;
    }
}




// Given 'n' and 'm' which are the dimensions of a matrix initialized by zeros and given an array 'indices' where 'indices[i] = [ri, ci]'. For each pair of '[ri, ci]' you have to increment all cells in row 'ri' and column 'ci' by 1.
// Return the number of cells with odd values in the matrix after applying the increment to all 'indices'.

// Input: 
// Output: 6
// Explanation: Initial matrix = [[0,0,0],[0,0,0]].
// After applying first increment it becomes [[1,2,1],[0,1,0]]. The final matrix will be [[1,3,1],[1,3,1]] which contains 6 odd numbers.
