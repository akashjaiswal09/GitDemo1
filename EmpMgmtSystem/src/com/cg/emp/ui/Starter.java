package com.cg.emp.ui;

import com.cg.emp.beans.Employee;
import com.cg.emp.service.EmployeeServiceImpl;

public class Starter {
	public static void main(String[] args) {
		try{
			int empId=3001;
			String empName="nisha";
			int salary=67000;
			String city="Delhi";

			Employee e = new Employee();
			e.setCity(city);
			e.setEmpId(empId); 
			e.setEmpName(empName);
			e.setSalary(salary);

			//EmployeeService service = new EmployeeServiceImpl();
			EmployeeServiceImpl service = new EmployeeServiceImpl();
			service.addEmployee(e);
			System.out.println("record inserted successfully!!");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}


	}

}
