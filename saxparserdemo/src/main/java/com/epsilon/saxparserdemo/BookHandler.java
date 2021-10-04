package com.epsilon.saxparserdemo;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BookHandler extends DefaultHandler {
	
	private boolean authorStatus= false;
	private boolean titleStatus= false;
	private boolean genreStatus= false;
	
	private List<Book> bookList = new ArrayList<Book>();
	
	private Book book= new Book();
	
	

	public void startDocument() throws SAXException {
      System.out.println("This is start document");
      
	}

	public void endDocument() throws SAXException {
     System.out.println("End of Document");
	}

	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
      
		
		if(qName.equalsIgnoreCase("author")){
			authorStatus=true;
		}
		
		if(qName.equalsIgnoreCase("title")){
			titleStatus=true;
		}
		if(qName.equalsIgnoreCase("genre")){
			genreStatus=true;
		}
	}

	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equalsIgnoreCase("author")){
			authorStatus=false;
		}
		
		if(qName.equalsIgnoreCase("title")){
			titleStatus=false;
		}
		
		if(qName.equalsIgnoreCase("genre")){
			genreStatus=false;
		}
		
		if(qName.equalsIgnoreCase("book")){
			bookList.add(book);
		}
	}

	public void characters(char ch[], int start, int length) throws SAXException {
		if(authorStatus) {
			book.setAuthor(new String(ch,start,length));
		}
		if(titleStatus) {
			book.setTitle(new String(ch,start,length));
		}
		if(genreStatus) {
			book.setGenre(new String(ch,start,length));
		}
	}

	public List<Book> getBookList() {
		return bookList;
	}

}
