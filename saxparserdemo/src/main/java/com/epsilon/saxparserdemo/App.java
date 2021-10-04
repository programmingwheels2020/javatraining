package com.epsilon.saxparserdemo;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

		try {
			SAXParser saxParser = saxParserFactory.newSAXParser();
			BookHandler bookHandler = new BookHandler();
			saxParser.parse(new File("book.xml"), bookHandler);
			
			List<Book> bookList = bookHandler.getBookList();
			
			System.out.println(bookList.size());
			
			for(Book book : bookList) {
				System.out.println(book.toString());
			}
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
