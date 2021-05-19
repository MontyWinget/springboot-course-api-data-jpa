package com.springbootquickstart.topic;

public class Topic {
	
	private String id;
	private String name;
	private String description;
	
	// NO ARG CONSTRUCTOR
	public Topic() {
		
	}
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	//ID
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	//NAME
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//DESCRIPTION
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
