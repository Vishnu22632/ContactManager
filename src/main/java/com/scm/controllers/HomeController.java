package com.scm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scm.dao.UserRepository;
import com.scm.entities.User;

@Controller
public class HomeController {

	
	
	@GetMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("title", "Home - smart contact manager");
		return "home";
	}
	
	@GetMapping("/about")
	public String about(Model model) {
		
		model.addAttribute("title", "About - smart contact manager");
		return "about";
	}
	
	@GetMapping("/signup")
	public String signup(Model model) {
		
		model.addAttribute("title", "SignUp - smart contact manager");
		model.addAttribute("user", new User());
		return "signup";
	}
	
	@PostMapping("/do_register")
	public String registerUser(@ModelAttribute("user") User user, @RequestParam(value="agreement", defaultValue="false") boolean agreement, Model model) {
		System.out.println("Agreement"  +agreement);
		System.out.println("User" +user);
		return "signup";
	}
	
	
}
