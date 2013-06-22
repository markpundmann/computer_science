public class EmployeeTester
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee("Joe", 50000);

		System.out.println("Employee name is "+emp1.getName());

		System.out.println("Joe's salary is $"+emp1.getsalary());

		emp1.raiseSalary(20);

		System.out.println(emp1.toString());





	}

}

