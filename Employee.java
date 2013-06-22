public class Employee
{
	public Employee()
	{
		employeeName="";
		salary=0;
	}

	public Employee(String employeename, double currentsalary)
	{
		employeeName=employeename;
		salary=currentsalary;
	}

	public String getName()
	{
		return employeeName;
	}

	public Employee(double initsalary)
	{
		salary=initsalary;
	}

	public double getsalary()
	{
		return salary;
	}

	public void raiseSalary(double amount)
	{
		salary=salary*(1 + amount/100);
	}

	public String toString()
	{
		return employeeName+" has a salary of $"+salary;
	}


	private String employeeName;
	private double salary;

}