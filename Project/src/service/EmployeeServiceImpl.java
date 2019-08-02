package service;

import controller.Employee;
import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;


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

}
