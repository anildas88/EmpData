package com.anil.controller;

import com.anil.domain.Emp;
import com.anil.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class StdController {

    @Autowired
    private EmpService service;

    @RequestMapping("/byId/{id}")
    public Emp getById(@PathVariable("id") int id) {
        System.out.println("hi"+" **"+"student");
        return service.empById(id);

    }
}
