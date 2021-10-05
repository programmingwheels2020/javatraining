package com.epsilon.jaxbdemo.model;

public class Answer {

	private String id;
	private String answer;
	
	public Answer() {
		
	}
	
	public Answer(String id, String answer) {
		super();
		this.id = id;
		this.answer = answer;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + "]";
	}
	
	
	
}
