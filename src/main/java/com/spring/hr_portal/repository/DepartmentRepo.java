package com.spring.hr_portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.hr_portal.entity.Department;

public interface DepartmentRepo extends JpaRepository<Integer, Department> {
	
}
