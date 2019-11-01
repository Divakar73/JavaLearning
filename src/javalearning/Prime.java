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
public class Prime {
     
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
       
        System.out.println(isPrime(i));
    }
     
    private static boolean isPrime(final int n) 
    {
        if(n==1 || n==0)
        {
            return false;
        }
        else
        {
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    return false; 
                } 
            }
            
            return true;
        }
    }
}
