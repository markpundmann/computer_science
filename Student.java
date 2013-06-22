public class Student
{
	public Student()
	{
		name="";
		age=0;
	}

	public Student(String n, int a)
	{
		name=n;
		age=a;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}



	private String name;
	private int age;
}