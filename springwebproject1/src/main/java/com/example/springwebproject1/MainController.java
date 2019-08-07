package com.example.springwebproject1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
			@RequestMapping(path="/hello")
			public String sayHello(){
				System.out.println("hello");
				return "helloWorld";
	}

}
