/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author divak
 */
public class JavaLearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a = in.nextInt();
        System.out.println("Enter the second value: ");
        int b = in.nextInt();
        
        System.out.println("Total:"+ (a+b));
    }
    
}
