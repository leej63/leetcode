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
public class DeleteANodeInALinkedList {
    public static void main(String[] args) {
        
    }
    
//    public static void deleteNode(ListNode node) {
//        if(node.next == null || node == null) return;
//        
//        node.val = node.next.val;
//        node.next = node.next.next;
//    }
}

// Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list, isntead you will be give naccess to the node to be deleted directly.
// It is guaranteed that the node to be deleted is not a tail node in the list.


// Input: head = [4,5,1,9], node = 5
// Output: [4,1,9]
// Explanation: you are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.