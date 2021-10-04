package com.demotraining.domparser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.demotraining.domparser.models.Book;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String filepath = "books.xml";

		File xmlFile = new File(filepath);

		DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder;

		try {
			docBuilder = dbfactory.newDocumentBuilder();
			Document doc = docBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();

			NodeList nodeList = doc.getElementsByTagName("book");

			List<Book> books = new ArrayList<Book>();

			for (int i = 0; i < nodeList.getLength(); i++) {
				 Book book = new Book();
				Element element = (Element) nodeList.item(i);
				book.setTitile(getTagValue("title",element));
				book.setAuthor(getTagValue("author",element));
				book.setGenre(getTagValue("genre",element));
				book.setPrice(getTagValue("price",element));
				book.setDescription(getTagValue("description",element));
				book.setPublishedDate(getTagValue("publish_date",element));
				
				books.add(book);
				

			}
			
			for (Book book : books) {
				System.out.println("This is title "+book.getTitile());
				System.out.println("This is author "+book.getAuthor());
			}

		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();

		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();

	}

}
