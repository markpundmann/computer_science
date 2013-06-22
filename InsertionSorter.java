public class InsertionSorter
{
	public InsertionSorter(int[] a)
	{
		values=a;
	}
	public void Sort()
	{
		for(int i=1; i<values.length; i++)
		{
			temp=values[i];
			j=i;

			while(j>0 && temp<values[j-1])
			{
				values[j]=values[j-1];
				j--;
			}
			values[j]=temp;
		}
	}
	public int[] returnArray()
	{
		return values;
	}



private int temp;
private int[] values;
private int i;
private int j;
}