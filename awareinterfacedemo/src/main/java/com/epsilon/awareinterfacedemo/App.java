package com.epsilon.awareinterfacedemo;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = new ClassPathXmlApplicationContext("com/epsilon/awareinterfacedemo/config.xml");
       
    	//XmlBeanFactory ctx = new XmlBeanFactory(new ClassPathResource("com/epsilon/awareinterfacedemo/config.xml"));
        Book book = (Book) ctx.getBean("book");
        
        System.out.println(book);
        
    }
}
