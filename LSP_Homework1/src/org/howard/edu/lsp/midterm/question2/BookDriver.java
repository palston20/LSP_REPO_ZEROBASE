package org.howard.edu.lsp.midterm.question2;

/**
 * This class will instantiate the Book class
 * This class will create Book objects and utilize the equal and toString methods
 */

public class BookDriver {
	public static void main(String[] args) {
		//Creating Book Objects
		Book book1 = new Book("The Great Gatsby", "F.Scott Fitzgerald", "123456789", 1925);
		Book book2 = new Book("The Great Gatsby", "F.Scott Fitzgerald", "123456789", 1925);
		Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);
		
		//Testing equals method
		System.out.println(book1.equals(book2));
		System.out.println(book1.equals(book3));
		
		//Testing toString method (printing a representation of Book1)
		System.out.println(book1);
	}

}
