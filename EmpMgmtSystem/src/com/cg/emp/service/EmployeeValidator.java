package com.cg.emp.service;

import com.cg.emp.beans.Employee;
import com.cg.emp.exception.InvalidSalaryException;

public class EmployeeValidator {
	
	public void validate(Employee employee) throws Exception{
		
		isValidEmpId(employee.getEmpId());
		isValidSalary(employee.getSalary());
		
		
	}
	public void isValidEmpId(Integer empId){
		
	}
	public void isValidSalary(Integer salary) throws Exception{
		if(salary==0)
			throw new InvalidSalaryException("salary should not be zero");
		
	}

}
