package com.epam.Calci;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args ) throws Exception
	    {
	        System.out.println( "Hello calci!" );
	        @SuppressWarnings("resource")
			Scanner s=new Scanner(System.in);
	        while(true) {
	        	System.out.println("Enter First input:\n");
		        int a = s.nextInt();
		        System.out.println("Enter Second input:\n");
		        int b = s.nextInt();
		    System.out.println("Enter your choice:\n1.Addition\n2.Substract\n3.Multiply\n4.Divide\n5.Modulusdivision\n");
		    int choice = s.nextInt();
		    choice=choice-1;
	        if(choice<0 || choice>5) throw new Exception("Enter a valid input.");
	        	int[] x = new int[5];
				@SuppressWarnings("unused")
				int[] operations = {
						x[0] = Calci_input.addition(a,b),
	        			x[1] = Calci_input.subtract(a,b),
	        			x[2] = Calci_input.multiply(a,b),
	        			x[3] = Calci_input.divide(a,b),
	        			x[4] = Calci_input.modulusdivision(a,b),
	        	};
				System.out.println(x[choice]);
				System.out.println("Exit (0):");
				int ch = s.nextInt();
				if(ch==0) {
					break;
				}
	        }
	        
	        
	    }
}
