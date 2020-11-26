package com.springsecurity.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, String error, String logout) {
		
		if(error != null) {
			model.addAttribute("error", "Tu usuario y password son inválidos");
		}
		
		if(logout != null){
			model.addAttribute("message", "Te has desconectado satisfactoriamente");
		}
		
		return "login";
	}
	
	@RequestMapping(value = {
			"/",
			"/welcome"
	}, method = RequestMethod.GET)
	public String welcome(Model model) {
		return "welcome";
	}
}
