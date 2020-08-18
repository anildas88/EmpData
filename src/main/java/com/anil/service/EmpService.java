package com.anil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.domain.Emp;
import com.anil.repo.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo repo;
	
	public Emp empById(int id) {
		Emp emp=repo.getEmpById(id);
		return emp;
	}
	
	
	public List<Emp> empEmps() {
		List<Emp> emps=repo.getAllEmps();
		return emps;
	}
	
	

}
