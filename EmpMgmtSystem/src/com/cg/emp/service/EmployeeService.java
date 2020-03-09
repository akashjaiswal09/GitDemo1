package com.cg.emp.service;

import com.cg.emp.beans.Employee;

public interface EmployeeService {
	void addEmployee(Employee employee) throws Exception;
	void udpateEmployee();
	void fetchEmployees();
	void deleteEmployee();

}
