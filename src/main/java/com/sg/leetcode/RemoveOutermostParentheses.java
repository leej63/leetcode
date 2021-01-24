/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author jonat
 */
public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        
    }
    
    public static String removeOuterParentheses(String S) {
        Stack<Character> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
            list.add(0);
        
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '(') {
                if(stack.isEmpty()) {
                    list.add(i);
                }
                stack.add(S.charAt(i));
            } else if(S.charAt(i) == ')') {
                stack.pop();
            }
            if(stack.isEmpty()) {
                list.add(i);
            }
        }
        
        StringBuilder strb = new StringBuilder();
        for(int i = 0; i < S.length(); i++) {
            if(!list.contains(i)) {
                strb.append(S.charAt(i));
            }
        }
        
        return strb.toString();
    }
    
    public static String removeOuterParentheses2(String S) {
        StringBuilder answer = new StringBuilder();
        int count = 0;
        
        for(char ch : S.toCharArray()) {
            if(ch == '(') {
                count++;
                if(count > 1) answer.append(ch);
            } else {
                count--;
                if(count > 0) answer.append(ch);
            }
        }
        
        return answer.toString();
    }
}



// A valid parentheses string is either empty '("")', '"(" + A + ")"', or 'A + B', where 'A' and 'B' are valid parentheses strings, and '+' represents string concatenation. For example, '""', '"()"', '"(())()"', and '"(()(()))"' are all valid parentheses strings.
// A valid parentheses string 'S' is primitive if it is nonempty, and there does not exist a way to split it into 'S = A+B', with 'A' and 'B' nonempty valid parentheses strings.
// Given a valid parentheses string 'S', consider its primitive decomposition: 'S = P_1 + P_2 + ... + P_k', where 'P_i' are primitive valid parentheses strings.
// Return 'S' after removing the outermost parentheses of every primitive string in the primitive decomposition of 'S'.

// Input: "(()())(())"
// Output: "()()()"
// Explanation:
// The input string is "(()())(())", with primitive decomposition "(()())" + "(())". After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
