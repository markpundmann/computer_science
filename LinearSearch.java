public class LinearSearch
{
	public LinearSearch(int[] a, int b)
	{
		numbers=a;
		searchnumber=b;
	}
	public boolean Search()
	{
		for(int x=0; x<numbers.length; x++)
		{
			if(numbers[x]==searchnumber)
			{
				return true;
			}
		}
		return false;
	}


private int x;
private int searchnumber;
private int[] numbers;
}