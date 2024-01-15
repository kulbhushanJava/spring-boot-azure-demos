package com.cg.springbootazuredemos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAzureDemosApplication {
	@GetMapping("/message")
	public String getMessage()
	{
		return "Azure Application deployed successfully";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAzureDemosApplication.class, args);
	}

}
