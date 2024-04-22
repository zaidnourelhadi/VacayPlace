package com.business.controllers;

import com.business.entities.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.business.services.PropertyServices;

@Controller
public class PropertyController
{
	@Autowired
	private PropertyServices propertyServices;

	//	AddProperty
	@PostMapping("/addingProperty")
	public String addProperty(@ModelAttribute Property property)
	{

		this.propertyServices.addProperty(property);
		return "redirect:/admin/services";
	}

	//	UpdateProperty
	@GetMapping("/updatingProperty/{propertyId}")
	public String updateProperty(@ModelAttribute Property property, @PathVariable("propertyId") int id)
	{

		this.propertyServices.updateproperty(property, id);
		return "redirect:/admin/services";
	}
	//DeleteProperty
	@GetMapping("/deleteProperty/{propertyId}")
	public String delete(@PathVariable("propertyId") int id)
	{
		this.propertyServices.deleteProperty(id);
		return "redirect:/admin/services";
	}
	
}
