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
public class ClimbingStairs {
    public static void main(String[] args) {
        
    }
    
    public static int climbStairs(int n) {
        if(n <= 0) return 0;
        int list[] = new int[n+1];
        list[0] = list[1] = 1;
        for(int i = 2; i <= n; i++) {
            list[i] = list[i-1] + list[i-2];
        }
        return list[n];
    }
    
    public static int climbStairs2(int n) {
        int a = 0, b = 1, temp = 0;
        for(int i = 0; i < n; i++) {
            temp = b;
            b = b + a;
            a = temp;
        }
        return (n > 0) ? b : 0;
    }
}



// You are climbing a staircase. It takes 'n' steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// - 1. 1 step + 1 step
// - 2. 2 steps
