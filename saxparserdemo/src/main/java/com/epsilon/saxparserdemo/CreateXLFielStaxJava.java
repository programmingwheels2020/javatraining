package com.epsilon.saxparserdemo;

import java.io.StringWriter;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class CreateXLFielStaxJava {

	public static void main(String[] args) {
		StringWriter stringWriter = new StringWriter();

		XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();

		try {
			XMLStreamWriter xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(stringWriter);
		   xmlStreamWriter.writeStartDocument();
		   xmlStreamWriter.writeStartElement("catalog");
		   xmlStreamWriter.writeStartElement("book");
		   xmlStreamWriter.writeStartElement("author");
		   xmlStreamWriter.writeCharacters("Lenin Lawrence");
		   xmlStreamWriter.writeEndElement();
		   xmlStreamWriter.writeEndElement();
		   xmlStreamWriter.writeEndElement();
		   xmlStreamWriter.writeEndDocument();
		   
		   xmlStreamWriter.flush();
		   xmlStreamWriter.close();
		   
		  String myStr= stringWriter.getBuffer().toString();
		  
		  System.out.println(myStr);
		   
		   
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
