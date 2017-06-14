package com.revature.SpringBootWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "emp")
public class EmployeeController {

	@Autowired
	public EmployeeServiceImpl employeeService;

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public List<Employee> listEmployees(ModelMap modelMap) {

		List<Employee> employees = employeeService.getList();
		modelMap.addAttribute("employees", employees);
		return employees;

	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void addEmployee(@RequestParam("employeeName") String empName, @RequestParam("employeeId") String empId,
			@RequestParam("employeeCity") String eCity) {
		System.out.println("Controller called");
		Employee employee = new Employee(empId, empName, eCity);
		System.out.println("Inside the controller");
		employeeService.save(employee);

	}

}
