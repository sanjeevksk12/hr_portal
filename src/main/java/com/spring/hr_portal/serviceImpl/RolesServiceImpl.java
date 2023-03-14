package com.spring.hr_portal.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.hr_portal.entity.Roles;
import com.spring.hr_portal.repository.RolesRepo;

public class RolesServiceImpl {
	@Autowired
	private RolesRepo rolesrepo;
	
	public List<Roles> getdetails(){
		List<Roles> findAll = rolesrepo.findAll();
		return findAll;
	}

}
