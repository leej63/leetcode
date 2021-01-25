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
public class NumberOfRectanglesThatCanFormTheLargestSquare {
    public static void main(String[] args) {
        
    }
    
    public static int countGoodRectangle(int[][] rectangles) {
        int answer = 0;
        int maxLen = 0;

        for(int i = 0; i < rectangles.length; i++) {
            int sideLen = (rectangles[i][0] > rectangles[i][1]) ? rectangles[i][1] : rectangles[i][0];
            
//            if(rectangles[i][0] > rectangles[i][1]) {
//                sideLen = rectangles[i][1];
//            } else {
//                sideLen = rectangles[i][0];
//            }
            
            if(sideLen > maxLen) {
                maxLen = sideLen;
                answer = 1;
            } else if(sideLen == maxLen) {
                answer++;
            }
        }
        
        return answer;
    }
}


// You are given an array 'rectangles' where 'rectangles[i] = [li, wi]' represents the 'ith' rectangle of length 'li' and width 'wi'.
// You can cut the 'ith' rectangle to form a square with a side length of 'k' if both 'k <= li' and 'k <= wi'. For example, if you have a rectangle '[4,6]', you can cut it to get a square with a side length of at most '4'.
// Let 'maxLen' be the side length of the largest square you can obtain from any ofthe given rectangles.
// Return the number of rectangles that can make asquare with a side length of 'maxLen'.

// Input: rectangles = [[5,8],[3,9],[5,12],[16,5]]
// Output: 3
// Explanation: The largest squares you can get from each rectangles are lengths of [5,3,5,5].
// The largest possible square is of length 5, and you can get it out of 3 rectangles.
