/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part01_28.positivity;

import java.util.Scanner;

/**
 *
 * @author Harrison
 */
public class Positivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your code below
        
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        else {
            System.out.println("The number is negative.");
        }
    }
}
