public class SelectionSorterTester
{
	public static void main(String[] args)
	{
		int[] values={27, 4, 10, 9, 25, 8, 2, 3, -5, 4, 7, 22, 10};
		SelectionSorter emp1=new SelectionSorter(values);

		emp1.sort();

		int[] array1=emp1.returnArray();

		for(int a=0;a<array1.length;a++)
			System.out.print(array1[a]+" ");

		System.out.println("");







	}
}