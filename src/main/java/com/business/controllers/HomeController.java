package com.business.controllers;

import java.util.List;

import com.business.entities.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.business.loginCredentials.AdminLogin;
import com.business.services.PropertyServices;

@Controller
public class HomeController 
{
	@Autowired
	private PropertyServices propertyServices;
	@GetMapping("/home")
	public String home()
	{
		return "Home";
	}

	@GetMapping("/properties")
	public String properties( Model model)
	{ 
		List<Property> allProperties = this.propertyServices.getAllProperties();
		model.addAttribute("properties", allProperties);
		return "Properties";
	}

	@GetMapping("/location")
	public String location()
	{
		return "Locate_us";
	}

	@GetMapping("/about")
	public String about()
	{
		return "About";
	}

	@GetMapping("/login")
	public String login(Model model)
	{
		model.addAttribute("adminLogin",new AdminLogin());
		return "Login";
	}
}
