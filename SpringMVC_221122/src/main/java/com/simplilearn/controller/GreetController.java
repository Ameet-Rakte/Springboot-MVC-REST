package com.simplilearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

	@GetMapping("/greet")
	public String greet(Model model)
	{
		String name="Amit";
		model.addAttribute("name",name);
		return"Hello";
	}

}
