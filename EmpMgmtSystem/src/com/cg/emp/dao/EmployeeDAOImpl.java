package com.cg.emp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.cg.emp.beans.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	Connection connection=null;

	@Override
	public void addEmployee(Employee e) throws Exception{
		// TODO Auto-generated method stub
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";//driver/ipadd/database instance"
			String user="system";
			String password="orcl11g"; 
		 Connection connection=DriverManager.getConnection(url, user, password);
		PreparedStatement ps = connection.prepareStatement("insert into employee values(?,?,?,?)");
		ps.setInt(1, e.getEmpId());
		ps.setString(2, e.getEmpName()); 
		ps.setInt(3, e.getSalary());
		ps.setString(4,e.getCity());
		ps.executeUpdate();
		
		}
		catch(Exception ex){
			throw ex;
		}
		finally{
			if(connection!=null)
			connection.close();
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
