package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndecController {
	@RequestMapping("/")
	public String index(Model m) {
		m.addAttribute("message", "Hello SpringBoot!");
		return "index";
	}
}
