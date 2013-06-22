import java.util.ArrayList;
public class ArrayListTester
{
	public static void main(String[] args)
	{
		ArrayList<Student> class1=new ArrayList<Student>();
		class1.add(new Student("Connor", 16));
		class1.add(new Student("Alex", 16));
		class1.add(new Student("Robert", 17));
		class1.add(new Student("Evan", 16));
		class1.add(new Student("John", 17));
		class1.add(new Student("Sam", 23));

		System.out.println(class1.get(0).getName());

		for(Student s: class1)
			System.out.println(s.getName());
		System.out.println("");

		class1.add(1, new Student("Crish", 16));
		for(Student s: class1)
			System.out.println(s.getName());
		System.out.println("");

		class1.set(2, new Student("Kevin", 17));
		for(Student s: class1)
			System.out.println(s.getName());
		System.out.println("");

		class1.remove(0);
		for(Student s: class1)
			System.out.println(s.getName()+"'s age is "+s.getAge());
		System.out.println("");

		System.out.println("The size of the class is "+class1.size());


	}
}
