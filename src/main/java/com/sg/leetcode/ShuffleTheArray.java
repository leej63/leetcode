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
public class ShuffleTheArray {
    public static void main(String[] args) {
        
    }
    
    public static int[] shuffle(int[] nums, int n) {
        int[] answer = new int[n * 2];
        
        for(int i = 0, j = n, idx = 0; idx < answer.length; i++, j++) {
            answer[idx++] = nums[i];
            answer[idx++] = nums[j];
        }
        
        return answer;
    }
}



// Given the array 'nums' consisting of '2n' elements in the form '[x1, x2,...xn,y1,y2,...,yn]'.
// Return the array in the form '[x1,y1,x2,y2,...,xn,yn]'.

// Input: nums = [2,5,1,3,4,7], n = 3
// Output: [2,3,5,4,1,7]
// Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].