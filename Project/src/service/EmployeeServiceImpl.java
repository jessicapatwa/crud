package service;

import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import pojo.Employee;


public class EmployeeServiceImpl implements EmployerService 
{
	
	EmployeeDAO refEmployeeDAO;
	
	@Override

	public void callAddEmployee(Employee refEmployee)
	{
		refEmployeeDAO = new EmployeeDAOImpl();
		refEmployeeDAO.addEmployee(refEmployee);
		

	}

	

	
		
	

}
