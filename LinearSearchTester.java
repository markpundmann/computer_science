public class LinearSearchTester
{
	public static void main(String[] args)
	{
		int[] values={27, 4, 10, 9, 25, 8, 2, 3, -5, 4, 7, 22, 10};
		LinearSearch emp1=new LinearSearch(values, 9);

		if(emp1.Search())
			System.out.println("it is located inside of the array");
		else
			System.out.println("it is not located inside of the array");




	}



}