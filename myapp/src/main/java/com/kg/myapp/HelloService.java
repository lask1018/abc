package com.kg.myapp;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {
	
	public String sayHello(String message) {
		return "Hello " +message;
	}

}
