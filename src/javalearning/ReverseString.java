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
public class ReverseString {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        
        ReverseString reverse = new ReverseString();
        
        System.out.println(reverse.reverseString(s));
    }
    
    
    private String reverseString(String str)
    {
       String reversedString = "";
        
       for(int i=str.length()-1; i >= 0; i--)
       {
          reversedString = reversedString.concat(""+ str.charAt(i));
       }
       
       return reversedString;  
    }
    
    
}
