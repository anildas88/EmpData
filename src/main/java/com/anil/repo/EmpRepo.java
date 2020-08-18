package com.anil.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.anil.domain.Emp;

@Repository
public class EmpRepo {
	
	
	/*
	 * for one emp by id
	 */
	public Emp getEmpById(int id) {
		Emp emp=null;
		List<Emp> list=allEmps();
		Optional<Emp> opt=list.stream().filter(e-> e.getId()== id).findAny();
		if (opt.isPresent()) {
			emp=opt.get();
		}
		return emp;
		
	}//method
	
	public List<Emp> getAllEmps(){
		List<Emp> emps=allEmps();
		return emps;
	}
	
	private List<Emp> allEmps(){
		Emp e1=new Emp(111, "anil");
		Emp e2=new Emp(222, "bulu");
		Emp e3=new Emp(333, "jitu");
		Emp e4=new Emp(444, "raj");
		
		List<Emp> list=new ArrayList<Emp>();
		list.add(e1);list.add(e2);list.add(e4);list.add(e3);
		return list;
	}

}
