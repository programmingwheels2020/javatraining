package com.epsilong.designpatterns.observerdesignpattern;

public class EmailTopicSubscriber implements Observer {

	private String name;
	private Subject topic;
	
	
	public EmailTopicSubscriber(String name) {
		
		this.name = name;
	}

	@Override
	public void update() {
		String msg = (String)topic.getUpdate(this);
		
		System.out.println("New message --"+msg);
		if(msg==null) {
			System.out.println(name + "No New message on this topic");
		}else {
			System.out.println(name+" retrieving new messages "+msg);
		}

	}

	@Override
	public void setSubject(Subject subject) {
		this.topic = subject;

	}

}
