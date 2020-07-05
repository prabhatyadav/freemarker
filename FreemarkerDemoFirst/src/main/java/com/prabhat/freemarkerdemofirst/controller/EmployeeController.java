package com.prabhat.freemarkerdemofirst.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prabhat.freemarkerdemofirst.Dao.Employee;
import com.prabhat.freemarkerdemofirst.Dao.RegisteredEmp;
 
@Controller
public class EmployeeController {

	@RequestMapping(path="/employee/{name}/detail",method= RequestMethod.GET)
	 public String getEmployeeDetail(@PathVariable("name") String name, Model model) {
		 return  "employee/employeeDetail";
	 }
	
	@RequestMapping(path="/employee",method= RequestMethod.GET)
	 public String getEmployeeDetail( Model model) {
		ArrayList<Employee> employeeList =  new ArrayList<>();
		employeeList.add(new Employee("Prabhat","Sr. Softare Engineer",30));
		employeeList.add(new Employee("Anirudh","Sr. Softare Engineer",31));
		employeeList.add(new Employee("Virendra","Sr. Softare Engineer",35));
		
		employeeList.add(new Employee("Mayanshi"," Softare Engineer"));
		employeeList.add(new Employee("Dhanvi",18));
		employeeList.add(new Employee("Shivani","Sr. Softare Lead"));
		
		employeeList.add(new Employee("Rashmi","Sr. Softare Engineer",32));
		employeeList.add(new Employee("Atul","Sr. Softare Lead",37));
		employeeList.add(new Employee("Mayank","Sr. Softare Engineer",28));
		employeeList.add(new Employee("Dhanji","Sr. Softare Lead",38));
		employeeList.add(new Employee("Shiv","Sr. Softare Lead",38));
		
		
		model.addAttribute("employes",employeeList);
		 return  "employee/employeeList";
	 }
	
	@RequestMapping(path="/employee/registration/form",method= RequestMethod.GET)
	 public String getEmployeeRegistrationForm() {
		 return  "employee/employeeRegisteration";
	 }
	
	@RequestMapping(path="/employee/register",method= RequestMethod.POST)
	 public String getEmployeeRegister(RegisteredEmp emp, Model model) {
		 model.addAttribute("registeredEmp", emp);
		return  "employee/employeeDetail";
	 }
}
