/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jonat
 */
public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        
    }
    
    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) return new int[0];
        
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
//            if (map.containsKey(num)) {
//                map.put(num, map.get(num) + 1);
//            } else {
//                map.put(num, 1);
//            }
        }
        
        for(int num : nums2) {
            if(map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
//            if(map.containsKey(num)) {
//                result.add(num);
//                map.put(num, map.get(num) - 1);
//                if(map.get(num) == 0) {
//                    map.remove(num);
//                }
//            }
        }
        
//        int[] res = new int[result.size()];
//        int i = 0;
//        for(int num : result) {
//            res[i++] = num;
//        }
//        return res;
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}



// Given two arrays, write a function to compute their intersection.

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]

// Note:
// - Each element in the result should appear as many times it shows in both arrays.
// - The result can be in any order.

