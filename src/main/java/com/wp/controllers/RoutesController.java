package com.wp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wp.models.Employee;
import com.wp.services.ServicesInterface;

@Controller
public class RoutesController {

	@Autowired
	private ServicesInterface services;
	
	// Routes
	
		//add
		@RequestMapping("addEmployee")
		public String addEmployee()
		{
			return "AddEmployee";
		}
		
		//search
		@RequestMapping("searchEmployee")
		public String searchEmployee()
		{
			return "SearchEmployee";
		}
		
		//view all
		@RequestMapping("viewAllEmployee")
		public String viewAllEmployees()
		{
			return "ViewAllEmployees";
		}
		
		//update
		@RequestMapping("updateEmployeeDetails")
		public ModelAndView UpdateEmployee(@RequestParam("eno") int code)
		{
		Employee emp= services.searchEmployee(code);

		if(emp!=null)
		{

		ModelAndView modelAndView = new ModelAndView("UpdateEmployee");
		modelAndView.addObject("info", emp);
		return modelAndView;
		}
		else
		{
		ModelAndView modelAndView = new ModelAndView("Error");
		return modelAndView;
		}
		}
		
		//delete
		@RequestMapping("deleteEmployee")
		public String deleteEmployee()
		{
			return "DeleteEmployee";
		}
}
