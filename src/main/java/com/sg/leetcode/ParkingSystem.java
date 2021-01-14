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
public class ParkingSystem {
    public static void main(String[] args) {
        
    }
    
    static int big, medium, small;
    
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public static boolean addCar(int carType) {
        switch(carType) {
            case 1:
                if(big > 0) {
                    big--;
                    return true;
                }
                return false;
            case 2:
                if(medium > 0) {
                    medium--;
                    return true;
                }
                return false;
            case 3:
                if(small > 0) {
                    small--;
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}



// Design a parking system for a parking lot. The parking lot has three kinds of parking spaces: big, medium, and small, with a fixed number of slots for each size.
// Implement the ParkingSystem class:
// ParkingSystem(int big, int medium, int small) Initializes object of the ParkingSystem class. The number of slots for each parking space are given as part of the constructor.
// bool addCar(int carType) Checks whether there is a parking space of carType for the car that wants to get into the parking lot. carType can be of three kinds: big, medium, or small, which are represented by 1, 2, and 3 respectively. A car can only park in a parking space of its carType. If there is no space available, return false, else park the car in that size space and return true.

// Input: ["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]
//        [[1,1,0], [1], [2], [3], [1]]
// Output: [null, true, true, false, false]
// Explanation:
// ParkingSystem parkingSystem = new ParkingSystem(1,1,0);
// parkingSystem.addCar(1); // return true because there is 1 available slot for a big car
// parkingSystem.addCar(2); // return true because there is 1 available slot for a medium car
// parkingSystem.addCar(3); // return false because there is no available slot for a small car
// parkingSystem.addCar(1); // return false because there is no available slot for a big car. It is already occupied.

