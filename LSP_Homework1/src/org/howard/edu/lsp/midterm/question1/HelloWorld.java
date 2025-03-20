package org.howard.edu.lsp.midterm.question1;

/**
 * Program to Add integers 
 * @author Paris Alston
 */

public class HelloWorld {
	/**
     * Adds two integers.
     * 
     * @param a The first integer
     * @param b The second integer
     * @return The sum of a and b
     */

	
	public static int add(int a, int b) {
		return a + b;
		}

	public static void main(String[] args) {
		 // Call the add method
		 int result = add(3, 4);

		 // Print the result and "Hello World!"
		 System.out.println("Hello World!");
		 System.out.println("The sum of 3 and 4 is: " + result);
		    }

	}


