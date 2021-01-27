/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.leetcode;

import java.util.HashSet;
import java.util.List;

/**
 *
 * @author jonat
 */
public class DestinationCity {
    public static void main(String[] args) {
        
    }
    
    public static String destCity(List<List<String>> paths) {
        HashSet<String> from = new HashSet<>();
        
        for(List<String> pair : paths) {
            from.add(pair.get(0));
        }
        
        for(List<String> pair : paths) {
            if(!from.contains(pair.get(1))){
                return pair.get(1);
            }
        }
        
        return null;
    }
}



// You are given the array 'paths', where 'paths[i] = [cityAi, cityBi]' means there exists a direct path going from 'cityAi' to 'cityBi'. Return the destination city, that is, the city without any path outgoing to another city.
// It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.


// Input: paths = [["B","C"],["D","B"],["C","A"]]
// Output: "A"
// Explanation: All possible trips are:
// "D" -> "B" -> "C" -> "A". 
// "B" -> "C" -> "A". 
// "C" -> "A". 
// "A". 
// Clearly the destination city is "A".
