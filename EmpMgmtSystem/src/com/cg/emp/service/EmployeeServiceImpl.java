package com.cg.emp.service;

import com.cg.emp.beans.Employee;
import com.cg.emp.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeValidator validator=new EmployeeValidator();
	EmployeeDAOImpl dao = new EmployeeDAOImpl();
	@Override
	public void addEmployee(Employee employee) throws Exception {
		try{
		// TODO Auto-generated method stub
		validator.validate(employee);
		dao.addEmployee(employee);
		}
		catch(Exception e){
			throw e;
		}
		
		
	}

	@Override
	public void udpateEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fetchEmployees() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		
	}

}
