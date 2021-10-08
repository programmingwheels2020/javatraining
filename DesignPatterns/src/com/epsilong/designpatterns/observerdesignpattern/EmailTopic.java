package com.epsilong.designpatterns.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {

	private List<Observer> observers;
	private String message;
	
	
	
	public EmailTopic() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer observer) {
		if(observer==null) {
			throw new NullPointerException("Null Observer");
		}
		if(!observers.contains(observer)) {
			observers.add(observer);
		}

	}

	@Override
	public void unregister(Observer observer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void notifyObserver() {
		for(Observer observer:observers) {
			observer.update();
		}

	}

	@Override
	public Object getUpdate(Observer observer) {
		// TODO Auto-generated method stub
		return this.message;
	}
	
	public void postMessage(String msg) {
		System.out.println("Message posted to the topic "+msg);
		this.message=msg;
		notifyObserver();
	}

}
