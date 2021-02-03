/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jonat
 */
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] answer = mergeSortedArrays(new int[]{0,3,4,31}, new int[]{4,6,30});
        for(int num : answer) {
            System.out.print(num + " ");
        }
        // should return [0,3,4,4,6,30,31]
    }
    
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        
        if(arr1.length == 0) return arr2;
        if(arr2.length == 0) return arr1;
        
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        
        while(i < arr1.length) {
            result[k++] = arr1[i++];
        }
        
        while(j < arr2.length) {
            result[k++] = arr2[j++];
        }
        
        return result;
    }
}
