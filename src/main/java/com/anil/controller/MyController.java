package com.anil.controller;

import com.anil.domain.Emp;
import com.anil.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class MyController {
    @Autowired
    private EmpService service;

    @RequestMapping("/byId/{data}")
    public Emp getById(@PathVariable("data") int id) {
        return service.empById(id);

    }
}
