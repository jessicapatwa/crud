package controller;

import java.util.Scanner;

import pojo.Employee;
import service.EmployeeServiceImpl;
import service.EmployerService;

public class AdminController 
{
	
	Employee refEmployee;
	EmployerService refEmployeeService;
	public void adminProcess()
	{
		userInput();
	}  //end of admin process
	
	
		void userInput()
		{
			
			refEmployee = new Employee();
			refEmployeeService = new EmployeeServiceImpl();
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter Employee ID");
			int empID=sc.nextInt();
			refEmployee.setEmpID(empID);
			
			
			System.out.println("Enter Employee Name");
			String empName= sc.next();
			refEmployee.setEmpName(empName);
			
			
			System.out.println("Enter Employee Password");           
			String empPassword=sc.next();
			refEmployee.setEmpPassword(empPassword);
			
			refEmployeeService.callAddEmployee(refEmployee);
			
			
		}//end of userInput


		

	

}
