package com.dred.spring.basic.demo_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
        Producto p = (Producto) contexto.getBean("producto");
        System.out.println(p);
        Casa c = (Casa) contexto.getBean("casa");
        System.out.println(c);
        ( (ConfigurableApplicationContext) contexto).close();
    }
}
