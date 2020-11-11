package com.kg.myapp.bye;

import org.springframework.stereotype.Service;

@Service
public class ByeService {
	
	public String sayBye(String message) {
		return "Bye ~ "+message;
	}

}
