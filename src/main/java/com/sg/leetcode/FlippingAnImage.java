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
public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] answer = flipAndInvertImage(matrix);
        int count = 0;
        for(int i = 0; i < answer.length; i++) {
            for(int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] + " ");
                count++;
                if(count % 3 == 0) {
                    System.out.println(""); 
                }
            }
        }
    }
    
    public static int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[i].length / 2; j++) {
                // reverse row
                int temp = A[i][j];
                A[i][j] = A[i][A[i].length - 1 - j];
                A[i][A[i].length - 1 - j] = temp;
            }
               
            for(int j = 0; j < A[i].length; j++) {
                // invert row
                if(A[i][j] == 1) {
                    A[i][j] = 0;
                } else if(A[i][j] == 0) {
                    A[i][j] = 1;
                }
            }
        }
        
        return A;
    }
}



// Given a binary matrix 'A', we want to flip the image horizontally, then invert it, and return the resulting image.
// To flip an image horizontally means that each row of the image is reversed. For example, flipping '[1,1,0]' horizontally results in '[0,1,1]'.
// To inver an image means that each '0' is replaced by '1', and each '1' is replaced by '0'. For example, inverting '[0,1,1]' results in '[1,0,0]'.

// Input: [[1,1,0],[1,0,1],[0,0,0]]
// Output: [[1,0,0],[0,1,0],[1,1,1]]
// Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
// Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]


