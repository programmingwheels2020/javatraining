package com.epsilon.autowiringdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("com/epsilon/autowiringdemo/config.xml");
        Employee emp = (Employee) ctx.getBean("employee");
        
        ctx.close();
        
        System.out.println(emp);
    }
}
