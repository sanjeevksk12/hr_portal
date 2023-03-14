package com.spring.hr_portal.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.hr_portal.repository.DepartmentRepo;

@Service
public class DepartmentServiceImpl {
	
	@Autowired
	private DepartmentRepo deptrepo;
	
	public List<Integer> getdetails(){
		List<Integer> findAll = deptrepo.findAll();
		return findAll;
		
	}
	
	

}
