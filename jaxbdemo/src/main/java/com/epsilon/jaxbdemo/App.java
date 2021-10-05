package com.epsilon.jaxbdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import com.epsilon.jaxbdemo.model.Answer;
import com.epsilon.jaxbdemo.model.Book;
import com.epsilon.jaxbdemo.model.QuestionsAndAnswers;
import com.sun.tools.javac.util.List;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
			JAXBContext contextObj = JAXBContext.newInstance(QuestionsAndAnswers.class);
			
		    Marshaller marshallerObj = contextObj.createMarshaller();
		    
		    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		    
		    /*Book book = new Book();
		    book.setAuthor("Lenin Lawrence");
		    book.setTitle("My Book");
		    book.setPrice("45.00");
		    book.setPublishDate("2020-09-09");
		    
		    marshallerObj.marshal(book, new FileOutputStream("book.xml"));*/
		    
		    Answer ans1 = new Answer("1001","Bangalore");
		    Answer ans2 = new Answer("1002","Hyderbad");
		    Answer ans3 = new Answer("1003","Mumbai");
		    Answer ans4 = new Answer("1004","Chandigarh");
		    
		    ArrayList<Answer> answers = new ArrayList<Answer>();
		    answers.add(ans1);
		    answers.add(ans2);
		    answers.add(ans3);
		    answers.add(ans4);
		    
		    QuestionsAndAnswers qandanswer = new QuestionsAndAnswers("Which indian city good for living condition", answers);
		    
		    marshallerObj.marshal(qandanswer, new FileOutputStream("question.xml"));
		    
		    
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
