package com.callor.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
//	@RequestMapping(value="", method=RequestMethod.GET) // 경고나옴
	@GetMapping(value="/")  // 위의걸로 알아서 바꿔준다 &PostMapping
	public String home() {
		return "Hello Korea";
	}

}
