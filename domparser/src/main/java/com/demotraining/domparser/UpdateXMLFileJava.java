package com.demotraining.domparser;

import java.io.File;
import java.io.IOException;

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
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class UpdateXMLFileJava {

	public static void main(String[] args) {

		File xmlFile = new File("books.xml");

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

		DocumentBuilder dBuilder;

		try {
			dBuilder = dbFactory.newDocumentBuilder();

			// read xml document
			Document doc = dBuilder.parse(xmlFile);

			doc.getDocumentElement().normalize();

			// make changes to xml

			addElement(doc);

			// delete a node value

			deleteElement(doc);
			
			//update a node
			
			updateElement(doc);

			// Writing document to another xml file
			writeDocumentToXMLFile(doc);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void addElement(Document doc) {
		NodeList books = doc.getElementsByTagName("book");

		for (int i = 0; i < books.getLength(); i++) {
			Element bookEl = (Element) books.item(i);
			Element urlEl = doc.createElement("url");
			urlEl.appendChild(doc.createTextNode("https://www.amazon.com/"));
			bookEl.appendChild(urlEl);
		}
	}

	public static void deleteElement(Document doc) {
		NodeList books = doc.getElementsByTagName("book");

		for (int i = 0; i < books.getLength(); i++) {
			Element bookEl = (Element) books.item(i);

			Node descNode = bookEl.getElementsByTagName("description").item(0);
			bookEl.removeChild(descNode);
		}
	}
	
	public static void updateElement(Document doc) {
		NodeList books = doc.getElementsByTagName("book");

		for (int i = 0; i < books.getLength(); i++) {
			Element bookEl = (Element) books.item(i);

			Node authorNode = bookEl.getElementsByTagName("author").item(0);
			authorNode.setTextContent(authorNode.getTextContent().toUpperCase());
		}
	}

	public static void writeDocumentToXMLFile(Document doc) {
		TransformerFactory transformerFactory = TransformerFactory.newInstance();

		Transformer transformer;
		try {
			transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			DOMSource source = new DOMSource(doc);

			// write output

			StreamResult console = new StreamResult(System.out);

			StreamResult file = new StreamResult(new File("book_modified.xml"));
			transformer.transform(source, console);
			transformer.transform(source, file);
		} catch (TransformerException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
