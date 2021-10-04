package com.epsilon.saxparserdemo;

public class Book {

	private String author;
	private String title;
	private String genre;
	private String price;
	private String publishDate;
	private String description;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", genre=" + genre + ", price=" + price
				+ ", publishDate=" + publishDate + ", description=" + description + "]";
	}
	
	
	
}
