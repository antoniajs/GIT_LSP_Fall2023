package org.howard.edu.lsp.midterm.problem1;

public class Book {
	private String title;
	private String author;
	private int year;
	
	public Book(String title, String author, int year) {
		this.title= title;
		this.author = author;
		this.year = year;	
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getYear() {
		return year;
	}
	
	@Override
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", Year: " + year;
	}
	
	@Override 
	public boolean equals(Object obj) {
		//check if the two objects point to the same object
		if (this == obj) {
			return true;
		}
		
		//check for two conditions:
		//1. If the object is null
		//2. If the objects belong to the same class or not
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		
		//casting object to the class type
		Book book2 = (Book) obj;
		
		return this.title.equals(book2.title) && this.author.equals(book2.author);		
	}
		
}



