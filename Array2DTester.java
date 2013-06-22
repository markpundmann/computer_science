public class Array2DTester
{
	public static void main(String[] args)
	{
		int[][] numbers={{1},{2,2,3},{2,4},{10,2}};

		int sum=0;
		for(int row=0; row<numbers.length; row++)
			for(int col=0; col<numbers[row].length; col++)
			{
				sum+=numbers[row][col];
			}
		System.out.println("The sum of the array is "+sum);


		double[] data={4,3,4,4,3,5,6,78,8,7,5,3,243,43,43,34,432,432,342};

		for(double e: data)
			System.out.println(e);















	}
}