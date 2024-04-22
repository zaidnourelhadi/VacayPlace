package com.business.services;

import java.util.List;
import java.util.Optional;

import com.business.entities.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.business.repositories.PropertyRepository;
@Component
public class PropertyServices
{
	@Autowired
	private PropertyRepository propertyRepository;

	//add Property
	public void addProperty(Property p)
	{
		this.propertyRepository.save(p);
	}


	//getAll properties
	public List<Property> getAllProperties()
	{
		List<Property> properties =(List<Property>)this.propertyRepository.findAll();
		return properties;
	}

	//get Single Property
	public Property getProperty(int id)
	{
		Optional<Property> optional = this.propertyRepository.findById(id);
		Property property =optional.get();
		return property;
	}

	//update Property
	public void updateproperty(Property p, int id)
	{
		p.setPid(id);
		Optional<Property> optional = this.propertyRepository.findById(id);
		Property prod=optional.get();

		if(prod.getPid()==id)
		{
			this.propertyRepository.save(p);
		}
	}
	//delete property
	public void deleteProperty(int id)
	{
		this.propertyRepository.deleteById(id);
	}

	//Get Property By Location
	public Property getPropertyByLocation(String location)
	{
		
		Property property = this.propertyRepository.findByPlocation(location);
		if(property !=null)
		{
			return property;
		}
		return null;
	
	}
}