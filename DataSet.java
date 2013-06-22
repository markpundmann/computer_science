//Mark Pundmann
public class DataSet
{
	public DataSet()
	{

	}

	public int getSum(int[] avalues, int afirst, int alast)
	{
		values=avalues;
		first=afirst;
		last=alast;
		if(last==first)
			return values[last];
		else
			return values[last] + getSum(values, first, last-1);
	}


	private int[] values;
	private int first;
	private int last;
}