package com.internous.fragmentsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index(Model m) {
		String msg = "HEllo!";
		
		m.addAttribute("msg", msg);
		return "index";
	}
}
