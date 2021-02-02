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
public class BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        
    }
    
    public static int maxProfit(int[] prices) {
        int s = 0, c = prices[0], i = 0;
        
        while(i < prices.length) {
            if(prices[i] > c) {
                s += prices[i] - c;
            }
            c = prices[i];
            i++;
        }
        return s;
    }
}



// Say you have an array 'prices' for which the 'ith' element is the price of a given stock on day 'i'.
// Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
// Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).


// Input: [7,1,5,3,6,4]
// Output: 7
// Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5 - 1 = 4
// Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6 - 3 = 3.