package com.epsilon.jaxbdemo;

import java.io.File;

import com.epsilon.jaxbdemo.model.QuestionsAndAnswers;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class Unmarshalling {

	public static void main(String[] args) {
		try {
			JAXBContext contextObj = JAXBContext.newInstance(QuestionsAndAnswers.class);
		    
		  Unmarshaller unmarshaller = contextObj.createUnmarshaller();
		  
		 QuestionsAndAnswers qanda =  (QuestionsAndAnswers) unmarshaller.unmarshal(new File("question.xml"));
		
		 System.out.println(qanda.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
