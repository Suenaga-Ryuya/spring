package com.internous.mysession.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.internous.mysession.model.LoginForm;
import com.internous.mysession.model.LoginSession;

@Controller
public class IndexController {

	@Autowired
	protected LoginSession loginSession;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	public String confirm(@ModelAttribute LoginForm form, Model model) {
		loginSession.setUserName(form.getUserName());
		loginSession.setPassword(form.getPassword());
		
		return "hello";
	}
	
}
