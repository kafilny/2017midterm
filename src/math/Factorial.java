package math;

import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter an integer");
    	int number=sc.nextInt();
    	int i,fact=1;  
    	    
    	  for(i=1;i<=number;i++){    
    	      fact=fact*i;    
    	  }    
    	  System.out.println("Factorial of "+number+" is: "+fact); 

    }
}
