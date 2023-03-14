package com.spring.hr_portal.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hr_portal.service.RolesService;

@RestController
public class Roles {
	@Autowired
	private RolesService roleservice;
	
	@GetMapping("api/roles")
	public List<Roles> getAlldetails(){
		List<Roles> get = (List)roleservice.getdetails();
		return get;
		
		
	}
	

}
