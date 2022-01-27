package com.microservices.estockmarket.apigateway;

import java.security.Principal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*",allowedHeaders = "*")
public class Controller {

	@GetMapping("/")
	public String index(Principal principal) {

		return principal.getName();
	}
}
