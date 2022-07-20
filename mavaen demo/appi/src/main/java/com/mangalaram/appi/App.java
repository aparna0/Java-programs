package com.mangalaram.appi;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	 @Qualifier("bike")
	static Manufactor obj;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
       
        obj= (Manufactor)context.getBean(Manufactor.class);
        obj.dis();
    }
}
