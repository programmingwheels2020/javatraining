package com.epsilon.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/epsilon/autowiring/config.xml");
      
      Book book = (Book) ctx.getBean("book");
      System.out.println(book);
      
      Publisher pub = (Publisher) ctx.getBean("publisher");
      
      
      System.out.println(pub);
      
     
    }
}
