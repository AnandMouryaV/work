package com.Tutorials.SpringFrameWork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext appConfig = new ClassPathXmlApplicationContext("beans.xml");
				Car c = (Car) appConfig.getBean("car");
		Tyre t = (Tyre) appConfig.getBean("tyre");
		System.out.println(t.toString());
		
		c.display();

	}
}
