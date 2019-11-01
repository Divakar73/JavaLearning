/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning;

import java.util.Scanner;

/**
 *
 * @author divak
 */
public class Factorial {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
       
        System.out.println(Factorial.factorial(i));
    }
    
    private static int factorial(int number)
    {
      int fact=1;
 
      for(int i=1;i<=number;i++)
	{
 
	     fact=fact*i;
 	}
                
      return fact;
    }
}
