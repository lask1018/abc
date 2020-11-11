package com.kg.myapp;

import javax.swing.AbstractAction;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {
	
	public static void main(String[] args) {
		AbstractApplicationContext con =
				new GenericXmlApplicationContext("app-config.xml");
		HelloController controller = con.getBean(HelloController.class);
		controller.sayHello("이승원");
		con.close();
	}

}
