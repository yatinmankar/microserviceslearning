package com.springmvc.model;

import javax.validation.constraints.Size;

public class Address {
	
	public Address(){
		
	}
	
	@Size(min=7, max=30)
	private String country;
	
	private String state;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	
	

}
