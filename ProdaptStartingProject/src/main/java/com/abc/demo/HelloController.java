package com.abc.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "/prod")
	public String welcome() {
		return "Welcome to Prodapt";
	}
}
