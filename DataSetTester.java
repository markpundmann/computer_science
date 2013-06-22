public class DataSetTester
{
	public static void main(String[] args)
	{
		int[] values={1,2,3,4,5,6,7,8,9,10,11};

		DataSet Data=new DataSet();

		System.out.println("The sum of the array is "+Data.getSum(values, 0, 10));

	}
}