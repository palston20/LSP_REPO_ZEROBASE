package org.howard.edu.lsp.midterm.question2;

/**
 *  Book class will represent books in a library
 *  This class will store book's title, author, ISBN, and publication year.
 */

public class Book {
	//attributes 
	private String title;
	private String author;
	private String ISBN;
	private int publishedYear;
	
	/**
	 * 
	 * @param title 
	 * @param author
	 * @param ISBN
	 * @param publishedYear
	 */
	public Book(String title, String author, String ISBN, int publishedYear) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.publishedYear = publishedYear;
	}
	
	//Getters and setters listed 
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public int getPublishedYear() {
		return publishedYear;
		
	}
	
	
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	



/**
 * This will override the equals method to compare two Book Objects
 * Per the instructions, books are equal when they have the same ISBN and author
 * 
 * @param obj  <-- object used to compare the book
 * @param true <-- will return when object is considered equal
 */

//Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
	
		Book other = (Book) obj;
	
		return ISBN.equals(other.ISBN) && author.equals(other.author);
	
	}

//Override 
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: "
				+ publishedYear;	
	}
}


