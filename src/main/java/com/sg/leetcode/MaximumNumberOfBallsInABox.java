/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.leetcode;

import java.util.HashMap;

/**
 *
 * @author jonat
 */
public class MaximumNumberOfBallsInABox {
    public static void main(String[] args) {
        
    }
    
    public static int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = lowLimit; i <= highLimit; i++) {
            char[] nums = String.valueOf(i).toCharArray();
            int sum = 0;
            
            for(char num : nums) {
                sum += Character.getNumericValue(num);
            }
            
            if(!map.containsKey(sum)) {
                map.put(sum, 1);
            } else {
                map.put(sum, map.get(sum) + 1);
            }
        }
        
        int mostBalls = 0;
        for(int ballCount : map.values()) {
           if(ballCount > mostBalls) {
               mostBalls = ballCount;
           }
        }
        
        return mostBalls;
    }
}


// You are working in a ball factory where you have 'n' balls numbered from 'lowLimit' up to 'highLimit' inclusive (i.e., n == highLimit - lowLimit + 1), and an infinite number of boxes numbered from '1' to 'infinity'.
// Your job at this factory is to put each ball in the box with a number equal to the sum of digits of the ball's number. For example, the ball number '321' will be put in the box number '3 + 2 + 1 = 6' and the ball number '10' will be put in the box number '1 + 0 = 1'.
// Given two integers 'lowLimit' and 'highLimit', return the number of balls in the box with the most balls.


// Input: lowLimit = 1, highLimit = 10
// Output: 2
// Explanation:
// Box Number: 1 2 3 4 5 6 7 8 9 10 11 ...
// Ball Count: 2 1 1 1 1 1 1 1 1 0  0  ...
// Box 1 has the most number of balls with 2 balls.
