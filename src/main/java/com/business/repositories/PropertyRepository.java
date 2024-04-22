package com.business.repositories;

import com.business.entities.Property;
import org.springframework.data.repository.CrudRepository;

public interface PropertyRepository extends CrudRepository<Property,Integer>
{
	public Property findByPlocation(String location);

}
