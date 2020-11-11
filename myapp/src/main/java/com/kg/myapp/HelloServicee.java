package com.kg.myapp;

import org.springframework.stereotype.Service;

@Service
public class HelloServicee implements IHelloService {
	
	public String sayHello(String message) {
		return "Helloo" +message;
	}
	
	

}
