package controller;

import java.util.Scanner;

import pojo.Employee;
import service.EmployeeServiceImpl;

public class AdminController 
{
	public void userEmployeeController()
	{
		userInput();
	}
	
	
		void userInput()
		{
			
			refEmployee = new Employee();
			refEmployeeService = new EmployeeServiceImpl();
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter Employee ID");
			int empID=sc.nextInt();
			refEmployee.setEmployeeID(empID);
			
			
			System.out.println("Enter Employee Name");
			int empName= sc.next();
			refEmployee.setEmployeeName(empName);
			
			
			System.out.println("Enter Employee Password");
			String empPassword=sc.next();
			refEmployee.setEmployeePassword(empPassword);
			
			refEmployeeService.callAddEmployee(refEmployee);
			
			
		}//end of userInput
		

	

}
