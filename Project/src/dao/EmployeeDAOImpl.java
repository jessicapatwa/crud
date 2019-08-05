package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnection;
import pojo.Employee;

public class EmployeeDAOImpl implements EmployeeDAO
{
	
	Connection conRef;
	PreparedStatement psRef;
	
	void getConnection()
	{
		try
		{
			conRef= DBConnection.prepareConnection();
		}
		catch (ClassNotFoundException | SQLException e)
		{
			System.out.println("DB Connection Error.....");
		}
	} //3.38-2.30=1.08
	
	@Override
	public void addEmployee(Employee refEmployee)
	{
		getConnection();
		
		try
		{
			psRef = conRef.prepareStatement("inset into employee(id,name,password) values (?,?,?)");
			psRef.setInt(1, refEmployee.getEmpID());
			psRef.setString(2, refEmployee.getEmployeeName());
			psRef.setString(3, refEmployee.getEmpPassword());
			psRef.setString(4, refEmployee.getEmpDob());
			
			psRef.executeUpdate();
			System.out.println("Record added successfully.......");
			
		}
		catch(SQLException e)
		{
		System.out.println("Exception caught.. Not able to add record..");
		
	}
		
		finally
		{
			try
			
			{
				conRef.close();
			}
			catch(SQLException e)
			{
				System.out.println("Exception caught.. not able to close the connection");
			}
			}
			}
		}
	

