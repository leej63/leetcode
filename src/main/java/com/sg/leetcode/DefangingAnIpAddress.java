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
public class DefangingAnIpAddress {
    public static void main(String[] args) {
        
    }
    
    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}

// Given a valid (IPv4) IP address, return a defanged version of that IP address.
// A defanged IP address replaces every period "." with "[.]".

// Input: address = '1.1.1.1'
// Output: "1[.]1[.]1[.]1'