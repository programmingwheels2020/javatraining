package com.epsilon.jaxbdemo.model;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class QuestionsAndAnswers {

	private String question;
	private List<Answer> answer;

	public QuestionsAndAnswers() {
		
	}
	
	public QuestionsAndAnswers(String question, List<Answer> answer) {
		super();
		this.question = question;
		this.answer = answer;
	}

	@XmlElement
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@XmlElement
	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "QuestionsAndAnswers [question=" + question + ", answer=" + answer + "]";
	}
	

}
