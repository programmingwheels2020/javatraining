package com.epsilon.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfiguration.class);
        
        Movie movie = (Movie)ctx.getBean(Movie.class);
        
        System.out.println(movie);
        
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        
        for(int i=0;i<beanDefinitionNames.length;i++) {
        	System.out.println(beanDefinitionNames[i]);
        }
    }
}
