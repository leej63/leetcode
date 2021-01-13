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
public class GoalParserInterpretation {
    public static void main(String[] args) {
//        System.out.println(interpret("G()(al)"));
//        System.out.println(interpret2("G()(al)"));
        System.out.println(interpret3("G()(al)"));
    }
    
    public static String interpret(String command) {
        HashMap<String, String> interpretation = new HashMap<>();
        interpretation.put("G", "G");
        interpretation.put("()", "o");
        interpretation.put("(al)", "al");
        
        String string = "";
        String finalString = "";
        
        for(int i = 0; i < command.length(); i++) {
            string += command.charAt(i);
            if(interpretation.containsKey(string)) {
                finalString += interpretation.get(string);
                string = "";
            }
        }
        
        return finalString;
    }
    
    public static String interpret2(String command) {
        String answer = "";
        
        for(int i = 0; i < command.length(); ) {
            if(command.charAt(i) == 'G') {
                answer += "G";
                i++;
            } else if(command.charAt(i) == '(' && command.charAt(i + 1) != ')') {
                answer += "al";
                i += 4;
            } else {
                answer += "o";
                i += 2;
            }
        }
        
        return answer;
    }
    
    public static String interpret3(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}



// You own a Goal Parser that can interpret a string 'command'. The 'command' consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.
// Given the string 'command', return the Goal Parser's interpretation of 'command'.

// Input: command = "G()(al)"
// Output: "Goal"
// Explanation: The Goal Parser interprets the command as follows:
// G -> G, () -> o, (al) -> al
// The final concatenated result is "Goal".