package com.kg.myapp.bye;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ByeController {
	
	@Autowired
	ByeService byeService;

	public void sayBye(String message) {
		System.out.println(byeService.sayBye(message));
	}
}
