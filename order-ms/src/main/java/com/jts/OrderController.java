package com.jts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Value("${welcome.message}")
	public String msg;
	
	@GetMapping("/welcome")
	public String getMsg() {
		return msg;
	}
}
