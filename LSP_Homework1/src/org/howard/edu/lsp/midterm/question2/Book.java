package org.howard.edu.lsp.midterm.question2;

/**
 *  Book class will represent books in a library
 *  This class will store book's title, author, ISBN, and publication year.
 */


public class Book {
	// attributes
	private String title;
	private String author;
	private String ISBN;
	private int publishedYear;

	// Constructor
	public Book(String title, String author, String ISBN, int publishedYear) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.publishedYear = publishedYear;
	}

	// Getters and setters
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
	 * This overrides the equals method to compare two Book objects.
	 * Books are equal when they have the same ISBN and author.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Book other = (Book) obj;
		return ISBN.equals(other.ISBN) && author.equals(other.author);
	}

	@Override
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: "
				+ publishedYear;
	}
}





//<<<<<<< HEAD
//credit for encapsulation WebWorks: https://www.w3schools.com/java/java_encapsulation.asp


//credit for encapsulation W3 Schools: https://www.w3schools.com/java/java_encapsulation.asp
//>>>>>>> branch 'main' of https://github.com/palston20/LSP_REPO_ZEROBASE.git

