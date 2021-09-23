package com.epsilon.constructorinjection;

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
       ApplicationContext ctx = new ClassPathXmlApplicationContext("com/epsilon/constructorinjection/config.xml");
       
       Player player = (Player) ctx.getBean("player");
       
       System.out.println(player);
    }
}
