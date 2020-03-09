package com.cg.emp.dao;

import com.cg.emp.beans.Employee;

public interface EmployeeDAO {
	
	void addEmployee(Employee employee) throws Exception;
	void udpateEmployee();
	void fetchEmployees();
	void deleteEmployee();

}
