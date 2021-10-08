package com.epsilong.designpatterns.observerdesignpattern;

public class ObsDesingPattern {

	public static void main(String[] args) {
		
		EmailTopic topic = new EmailTopic();
		
		Observer firstObserver = new EmailTopicSubscriber("First Observer");
		Observer secondObserver = new EmailTopicSubscriber("SecondObserver");
		Observer thirdObserver = new EmailTopicSubscriber("ThirdObserver");
		
		//registering observer
		topic.register(firstObserver);
		topic.register(secondObserver);
		topic.register(thirdObserver);
		
		//attaching to subject
		
		firstObserver.setSubject(topic);
		secondObserver.setSubject(topic);
		thirdObserver.setSubject(topic);
		
		firstObserver.update();
		
		topic.postMessage("Hello Subscribers");

	}

}
