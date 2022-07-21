package com.anil.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anil.domain.Emp;
import com.anil.service.EmpService;

@RestController
public class EmpController {
	@Autowired
	private EmpService service;
	
	@RequestMapping("/byId/{id}")
	public Emp getById(@PathVariable("id") int id) {
		System.out.println("hi"+" **"+"hello");
		System.out.println("added new feature");
		System.out.println("added new 2nd feature");
		return service.empById(id);

	}

	@RequestMapping("/allEmps")
	public List<Emp> getAllEmps(){
		return service.empEmps();
	}

	@GetMapping("employees/test")
	public String test() {
		
		return "Anil kumar";
	}
	/*
	date method added by @A...
	 */
	private Date date(){
		return new Date();
	}



}
