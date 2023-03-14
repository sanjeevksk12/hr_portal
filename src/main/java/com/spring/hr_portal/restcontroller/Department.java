package com.spring.hr_portal.restcontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hr_portal.service.DepartmentService;

@RestController
public class Department {

	@Autowired
	private DepartmentService deptservice;
	
	
}
