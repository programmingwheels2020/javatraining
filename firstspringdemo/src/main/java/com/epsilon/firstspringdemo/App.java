package com.epsilon.firstspringdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/epsilon/firstspringdemo/config.xml");
        
       
        
        Emplyee emp = (Emplyee) ctx.getBean("employee");
        
        System.out.println(emp);
    }
}
