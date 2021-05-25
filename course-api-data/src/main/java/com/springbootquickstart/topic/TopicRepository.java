package com.springbootquickstart.topic;

import org.springframework.data.repository.CrudRepository;

// All Generic crud operations comes with CrudRepository Class

public interface TopicRepository extends CrudRepository<Topic, String> {
	
	

}
