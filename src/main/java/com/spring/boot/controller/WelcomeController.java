package com.spring.boot.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

		@RequestMapping("/")
		public String Welcome() {
			return "Welcome to spring boot!!!";
		}
}
