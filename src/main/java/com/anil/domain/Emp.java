package com.anil.domain;

import lombok.Data;

@Data
public class Emp {
	
	private int id;
	private String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
