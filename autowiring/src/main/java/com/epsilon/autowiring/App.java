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
      System.out.println(book.hashCode());
      
      Book book1 = (Book) ctx.getBean("book");
      
      System.out.println(book1.hashCode());
      
      
      
      //Publisher pub = (Publisher) ctx.getBean("publisher");
      
      
      //System.out.println(pub);
     
     //Scopes 
      
      // Aware interfaces - 
      
     
    }
}
