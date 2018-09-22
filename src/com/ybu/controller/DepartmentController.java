package com.ybu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ybu.entity.Department;
import com.ybu.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/listDepartments")
	public String listDepartments() {
		List<Department> department = departmentService.getDepartments();
		for(Department s : department) {
			System.out.println(s.getDepartmentName());
		}
		return null;
	}
}
