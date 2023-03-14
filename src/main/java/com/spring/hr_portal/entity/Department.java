package com.spring.hr_portal.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dept_id;
	private String dept_name;
	private String dept_short_name;
	
	@OneToMany(targetEntity = Roles.class ,cascade = CascadeType.ALL)
	@JoinColumn(name="dept_id1")
	private List<Roles> roles ; 

	public Department(int dept_id, String dept_name, String dept_short_name) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.dept_short_name = dept_short_name;

}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getDept_short_name() {
		return dept_short_name;
	}

	public void setDept_short_name(String dept_short_name) {
		this.dept_short_name = dept_short_name;
	}

	public List<Roles> getRoles() {
		return roles;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + ", dept_short_name=" + dept_short_name
				+ ", roles=" + roles + "]";
	}
	
	
	
}
