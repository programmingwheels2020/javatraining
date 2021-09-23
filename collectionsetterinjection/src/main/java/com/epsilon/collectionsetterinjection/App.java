package com.epsilon.collectionsetterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/epsilon/collectionsetterinjection/config.xml");
        
        Question question = (Question) ctx.getBean("question");
        
        System.out.println(question);
    }
}
