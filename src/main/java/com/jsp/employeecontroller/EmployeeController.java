package com.jsp.employeecontroller;

import java.util.ArrayList;
import java.util.List;

import com.jsp.employeedao.EmployeeDao;
import com.jsp.employeedto.Employee;
import com.jsp.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList();
		Employee employee1 = new Employee();
		employee1.setEmail("kajal@gmail.com");
		employee1.setName("Kajal");

		Employee employee2 = new Employee();
		employee2.setEmail("rashmi@gmail.com");
		employee2.setName("Rashmi");

		Employee employee3 = new Employee();
		employee3.setEmail("achal@gmail.com");
		employee3.setName("Achal");

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);

		Employee employee = new Employee();

		EmployeeService employeeService = new EmployeeService();

		// to save records
//		employeeService.testSave(employees);

		// to delete record
//		employee.setId(1);
//		employeeService.deleteById(employee);

		// to update record
//		employee.setId(3);
//		employeeService.updateById(employee);

		/// to get single record by id
//		employee.setId(2);
//		employeeService.getById(employee);

		// to get all the records from table
		employeeService.getAll(employee);
	}
}
