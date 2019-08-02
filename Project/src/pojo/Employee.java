package pojo;

public class Employee 
{
	private int empID;
	private String empName;
	private String empPassword;
	private String empDob;
	//private String column;
	
	public int getEmployeeID()
	{
		return empID;
	}
	public void setEmployeeID(int empID)
	{
		this.empID=empID;
	}
	
	
	
	public String getEmployeeName()
	{
		return empName;
	}
	
	
	
	public String getEmployeePassword()
	{
		return empPassword;
	}
	public void setEmployeePassword(String empPassword)
	{
		this.empPassword=empPassword;
	}
	
	
	
	public String getEmployeeDob()
	{
		return empDob;
	}
	public void setEmployeeDob(String empDob)
	{
		this.empDob=empDob;
	}

}
