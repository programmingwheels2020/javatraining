package com.demotraining.domparser;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import com.demotraining.domparser.models.Book;

public class CreateXMLFIleJava {

	public static void main(String[] args) {
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder dBuilder;
		
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc=dBuilder.newDocument();
			
			//create an element "catalog" and add it as root element to the doc
			
			Element rootElement = doc.createElement("catalog");
			
			doc.appendChild(rootElement);
			
			//appending inner elements with root elements
			
			Book book = new Book();
			book.setAuthor("Gambardella, Matthew");
			book.setTitile("XML Developer's Guide");
			book.setGenre("Computer");
			book.setPrice("444.05");
			book.setPublishedDate("2000-10-01");
			book.setDescription("An in-depth look at creating applications \n" + 
					"      with XML.");
			rootElement.appendChild(createBookElement(doc, book));
			
			book.setAuthor("Ralls, Kim");
			book.setTitile("Midnight Rain");
			book.setGenre("Fantasy");
			book.setPrice("444.05");
			book.setPublishedDate("2000-10-01");
			book.setDescription("An in-depth look at creating applications \n" + 
					"      with XML.");
			rootElement.appendChild(createBookElement(doc, book));
			
			//to output file generation
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			
			Transformer transformer = transformerFactory.newTransformer();
			
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			
			DOMSource source = new DOMSource(doc);
			
			// write output
			
			StreamResult console = new StreamResult(System.out);
			
			StreamResult file = new StreamResult(new File("book_updated_new.xml"));
			
			transformer.transform(source, console);
			
			transformer.transform(source, file);
			
			
			
			
			
			
		} catch (ParserConfigurationException | TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static Node createBookElement(Document doc, Book book) {
		Element bookEl = doc.createElement("book");
		
		bookEl.appendChild(createSingleBookElements(doc, "author", book.getAuthor()));
		bookEl.appendChild(createSingleBookElements(doc, "title", book.getTitile()));
		bookEl.appendChild(createSingleBookElements(doc, "genre", book.getGenre()));
		bookEl.appendChild(createSingleBookElements(doc, "price", book.getPrice()));
		bookEl.appendChild(createSingleBookElements(doc, "publish_date", book.getPublishedDate()));
		bookEl.appendChild(createSingleBookElements(doc, "description", book.getDescription()));
		
		return bookEl;
	}
	
	private static Node createSingleBookElements(Document doc, String tagname, String tagvalue ) {
		
		Element node = doc.createElement(tagname);
		
		node.appendChild(doc.createTextNode(tagvalue));
		
		return node;
	}

}
